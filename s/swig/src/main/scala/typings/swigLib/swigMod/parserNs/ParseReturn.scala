package typings
package swigLib.swigMod.parserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseReturn extends js.Object {
  var blocks: js.Any
  var name: java.lang.String
  var parent: js.Any
  var tokens: js.Array[_]
}

object ParseReturn {
  @scala.inline
  def apply(blocks: js.Any, name: java.lang.String, parent: js.Any, tokens: js.Array[_]): ParseReturn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blocks")(blocks)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parent")(parent)
    __obj.updateDynamic("tokens")(tokens)
    __obj.asInstanceOf[ParseReturn]
  }
}

