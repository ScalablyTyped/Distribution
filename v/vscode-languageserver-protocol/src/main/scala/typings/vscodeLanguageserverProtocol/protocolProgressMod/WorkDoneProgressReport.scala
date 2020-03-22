package typings.vscodeLanguageserverProtocol.protocolProgressMod

import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.report
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkDoneProgressReport extends js.Object {
  /**
    * Controls enablement state of a cancel button. This property is only valid if a cancel
    * button got requested in the `WorkDoneProgressStart` payload.
    *
    * Clients that don't support cancellation or don't support control the button's
    * enablement state are allowed to ignore the setting.
    */
  var cancellable: js.UndefOr[Boolean] = js.undefined
  var kind: report
  /**
    * Optional, more detailed associated progress message. Contains
    * complementary information to the `title`.
    *
    * Examples: "3/25 files", "project/src/module2", "node_modules/some_dep".
    * If unset, the previous progress message (if any) is still valid.
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * Optional progress percentage to display (value 100 is considered 100%).
    * If not provided infinite progress is assumed and clients are allowed
    * to ignore the `percentage` value in subsequent in report notifications.
    *
    * The value should be steadily rising. Clients are free to ignore values
    * that are not following this rule.
    */
  var percentage: js.UndefOr[Double] = js.undefined
}

object WorkDoneProgressReport {
  @scala.inline
  def apply(
    kind: report,
    cancellable: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    percentage: Int | Double = null
  ): WorkDoneProgressReport = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (!js.isUndefined(cancellable)) __obj.updateDynamic("cancellable")(cancellable.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkDoneProgressReport]
  }
}

