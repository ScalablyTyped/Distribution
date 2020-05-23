package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyWorkspaceEditResponse extends js.Object {
  /**
    * Indicates whether the edit was applied or not.
    */
  var applied: Boolean
  /**
    * Depending on the client's failure handling strategy `failedChange` might
    * contain the index of the change that failed. This property is only available
    * if the client signals a `failureHandlingStrategy` in its client capabilities.
    */
  var failedChange: js.UndefOr[Double] = js.undefined
  /**
    * An optional textual description for why the edit was not applied.
    * This may be used by the server for diagnostic logging or to provide
    * a suitable error for a request that triggered the edit.
    */
  var failureReason: js.UndefOr[String] = js.undefined
}

object ApplyWorkspaceEditResponse {
  @scala.inline
  def apply(applied: Boolean, failedChange: js.UndefOr[Double] = js.undefined, failureReason: String = null): ApplyWorkspaceEditResponse = {
    val __obj = js.Dynamic.literal(applied = applied.asInstanceOf[js.Any])
    if (!js.isUndefined(failedChange)) __obj.updateDynamic("failedChange")(failedChange.get.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyWorkspaceEditResponse]
  }
}

