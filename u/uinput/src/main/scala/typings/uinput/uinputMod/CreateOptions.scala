package typings.uinput.uinputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOptions extends js.Object {
  var id: CreateID
  var name: String
}

object CreateOptions {
  @scala.inline
  def apply(id: CreateID, name: String): CreateOptions = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[CreateOptions]
  }
}

