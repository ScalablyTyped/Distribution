package typings.websocket.websocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExtension extends js.Object {
  var name: String
  var value: String
}

object IExtension {
  @scala.inline
  def apply(name: String, value: String): IExtension = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IExtension]
  }
}

