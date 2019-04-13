package typings
package yarLib.yarMod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var yar: yarLib.yarMod.Yar
}

object Request {
  @scala.inline
  def apply(yar: yarLib.yarMod.Yar): Request = {
    val __obj = js.Dynamic.literal(yar = yar)
  
    __obj.asInstanceOf[Request]
  }
}

