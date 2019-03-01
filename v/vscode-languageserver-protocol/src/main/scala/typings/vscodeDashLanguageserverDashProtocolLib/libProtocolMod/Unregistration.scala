package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unregistration extends js.Object {
  /**
    * The id used to unregister the request or notification. Usually an id
    * provided during the register request.
    */
  var id: java.lang.String
  /**
    * The method to unregister for.
    */
  var method: java.lang.String
}

object Unregistration {
  @scala.inline
  def apply(id: java.lang.String, method: java.lang.String): Unregistration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[Unregistration]
  }
}

