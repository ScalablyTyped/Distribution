package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializeError extends js.Object {
  /**
    * Indicates whether the client execute the following retry logic:
    * (1) show the message provided by the ResponseError to the user
    * (2) user selects retry or cancel
    * (3) if user selected retry the initialize method is sent again.
    */
  var retry: scala.Boolean
}

