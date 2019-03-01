package typings
package yarLib.yarMod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var yar: yarLib.yarMod.yarNs.Yar
}

object Request {
  @scala.inline
  def apply(yar: yarLib.yarMod.yarNs.Yar): Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("yar")(yar)
    __obj.asInstanceOf[Request]
  }
}

