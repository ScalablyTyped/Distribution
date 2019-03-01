package typings
package yarLib.yarMod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  var yar: yarLib.yarMod.yarNs.ServerYar
}

object Server {
  @scala.inline
  def apply(yar: yarLib.yarMod.yarNs.ServerYar): Server = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("yar")(yar)
    __obj.asInstanceOf[Server]
  }
}

