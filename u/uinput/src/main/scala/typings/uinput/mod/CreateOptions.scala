package typings.uinput.mod

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateOptions]
  }
}

