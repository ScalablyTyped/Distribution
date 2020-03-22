package typings.vscodeLanguageserverProtocol.protocolProgressMod

import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.begin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkDoneProgressBegin extends js.Object {
  /**
    * Controls if a cancel button should show to allow the user to cancel the
    * long running operation. Clients that don't support cancellation are allowed
    * to ignore the setting.
    */
  var cancellable: js.UndefOr[Boolean] = js.undefined
  var kind: begin
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
  /**
    * Mandatory title of the progress operation. Used to briefly inform about
    * the kind of operation being performed.
    *
    * Examples: "Indexing" or "Linking dependencies".
    */
  var title: String
}

object WorkDoneProgressBegin {
  @scala.inline
  def apply(
    kind: begin,
    title: String,
    cancellable: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    percentage: Int | Double = null
  ): WorkDoneProgressBegin = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(cancellable)) __obj.updateDynamic("cancellable")(cancellable.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkDoneProgressBegin]
  }
}

