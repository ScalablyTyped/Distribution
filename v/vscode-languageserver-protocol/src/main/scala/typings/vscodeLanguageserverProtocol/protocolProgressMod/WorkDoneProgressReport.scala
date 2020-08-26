package typings.vscodeLanguageserverProtocol.protocolProgressMod

import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.report
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkDoneProgressReport extends js.Object {
  /**
    * Controls enablement state of a cancel button. This property is only valid if a cancel
    * button got requested in the `WorkDoneProgressStart` payload.
    *
    * Clients that don't support cancellation or don't support control the button's
    * enablement state are allowed to ignore the setting.
    */
  var cancellable: js.UndefOr[Boolean] = js.native
  var kind: report = js.native
  /**
    * Optional, more detailed associated progress message. Contains
    * complementary information to the `title`.
    *
    * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
    * If unset, the previous progress message (if any) is still valid.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Optional progress percentage to display (value 100 is considered 100%).
    * If not provided infinite progress is assumed and clients are allowed
    * to ignore the `percentage` value in subsequent in report notifications.
    *
    * The value should be steadily rising. Clients are free to ignore values
    * that are not following this rule.
    */
  var percentage: js.UndefOr[Double] = js.native
}

object WorkDoneProgressReport {
  @scala.inline
  def apply(kind: report): WorkDoneProgressReport = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkDoneProgressReport]
  }
  @scala.inline
  implicit class WorkDoneProgressReportOps[Self <: WorkDoneProgressReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: report): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancellable(value: Boolean): Self = this.set("cancellable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancellable: Self = this.set("cancellable", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setPercentage(value: Double): Self = this.set("percentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentage: Self = this.set("percentage", js.undefined)
  }
  
}

