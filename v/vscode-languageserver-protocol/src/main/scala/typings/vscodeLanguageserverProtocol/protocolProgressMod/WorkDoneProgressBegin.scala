package typings.vscodeLanguageserverProtocol.protocolProgressMod

import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.begin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkDoneProgressBegin extends js.Object {
  /**
    * Controls if a cancel button should show to allow the user to cancel the
    * long running operation. Clients that don't support cancellation are allowed
    * to ignore the setting.
    */
  var cancellable: js.UndefOr[Boolean] = js.native
  var kind: begin = js.native
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
  /**
    * Mandatory title of the progress operation. Used to briefly inform about
    * the kind of operation being performed.
    *
    * Examples: "Indexing" or "Linking dependencies".
    */
  var title: String = js.native
}

object WorkDoneProgressBegin {
  @scala.inline
  def apply(kind: begin, title: String): WorkDoneProgressBegin = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkDoneProgressBegin]
  }
  @scala.inline
  implicit class WorkDoneProgressBeginOps[Self <: WorkDoneProgressBegin] (val x: Self) extends AnyVal {
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
    def setKind(value: begin): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
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

