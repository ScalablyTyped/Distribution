package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDescriptorBase[TMessageIds /* <: String */] extends js.Object {
  /**
    * The parameters for the message string associated with `messageId`.
    */
  var data: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * The fixer function.
    */
  var fix: js.UndefOr[ReportFixFunction | Null] = js.undefined
  /**
    * The messageId which is being reported.
    */
  var messageId: TMessageIds
}

object ReportDescriptorBase {
  @scala.inline
  def apply[TMessageIds /* <: String */](messageId: TMessageIds, data: Record[String, _] = null, fix: ReportFixFunction = null): ReportDescriptorBase[TMessageIds] = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (fix != null) __obj.updateDynamic("fix")(fix)
    __obj.asInstanceOf[ReportDescriptorBase[TMessageIds]]
  }
}

