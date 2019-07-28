package typings.yar.yarMod.hapiMod

import typings.yar.yarMod.ServerYar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  var yar: ServerYar
}

object Server {
  @scala.inline
  def apply(yar: ServerYar): Server = {
    val __obj = js.Dynamic.literal(yar = yar)
  
    __obj.asInstanceOf[Server]
  }
}

