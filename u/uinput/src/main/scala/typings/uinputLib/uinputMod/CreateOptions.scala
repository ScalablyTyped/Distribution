package typings
package uinputLib.uinputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOptions extends js.Object {
  var id: CreateID
  var name: java.lang.String
}

object CreateOptions {
  @scala.inline
  def apply(id: CreateID, name: java.lang.String): CreateOptions = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[CreateOptions]
  }
}

