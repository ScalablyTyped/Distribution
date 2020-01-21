package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unregistration extends js.Object {
  /**
    * The id used to unregister the request or notification. Usually an id
    * provided during the register request.
    */
  var id: String
  /**
    * The method to unregister for.
    */
  var method: String
}

object Unregistration {
  @scala.inline
  def apply(id: String, method: String): Unregistration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Unregistration]
  }
}

