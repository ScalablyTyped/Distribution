package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registration extends js.Object {
  /**
    * The id used to register the request. The id can be used to deregister
    * the request again.
    */
  var id: java.lang.String
  /**
    * The method to register for.
    */
  var method: java.lang.String
  /**
    * Options necessary for the registration.
    */
  var registerOptions: js.UndefOr[js.Any] = js.undefined
}

