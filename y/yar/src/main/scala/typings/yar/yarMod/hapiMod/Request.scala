package typings.yar.yarMod.hapiMod

import typings.yar.yarMod.Yar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var yar: Yar
}

object Request {
  @scala.inline
  def apply(yar: Yar): Request = {
    val __obj = js.Dynamic.literal(yar = yar)
  
    __obj.asInstanceOf[Request]
  }
}

