package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnregistrationParams extends js.Object {
  var unregisterations: js.Array[Unregistration]
}

object UnregistrationParams {
  @scala.inline
  def apply(unregisterations: js.Array[Unregistration]): UnregistrationParams = {
    val __obj = js.Dynamic.literal(unregisterations = unregisterations)
  
    __obj.asInstanceOf[UnregistrationParams]
  }
}

