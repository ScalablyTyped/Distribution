package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyWorkspaceEditResponse extends js.Object {
  /**
    * Indicates whether the edit was applied or not.
    */
  var applied: scala.Boolean
  /**
    * Depending on the client's failure handling strategy `failedChange` might
    * contain the index of the change that failed. This property is only available
    * if the client signals a `failureHandlingStrategy` in its client capabilities.
    */
  var failedChange: js.UndefOr[scala.Double] = js.undefined
  /**
    * An optional textual description for why the edit was not applied.
    * This may be used by the server for diagnostic logging or to provide
    * a suitable error for a request that triggered the edit.
    */
  var failureReason: js.UndefOr[java.lang.String] = js.undefined
}

object ApplyWorkspaceEditResponse {
  @scala.inline
  def apply(
    applied: scala.Boolean,
    failedChange: scala.Int | scala.Double = null,
    failureReason: java.lang.String = null
  ): ApplyWorkspaceEditResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applied")(applied)
    if (failedChange != null) __obj.updateDynamic("failedChange")(failedChange.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    __obj.asInstanceOf[ApplyWorkspaceEditResponse]
  }
}

