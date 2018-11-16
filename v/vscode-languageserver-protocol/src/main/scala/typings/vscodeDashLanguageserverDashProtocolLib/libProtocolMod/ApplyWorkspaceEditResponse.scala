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
}

