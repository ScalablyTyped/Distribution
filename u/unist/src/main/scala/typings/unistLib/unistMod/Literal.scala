package typings
package unistLib.unistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Literal extends Node {
  var value: js.Any
}

object Literal {
  @scala.inline
  def apply(`type`: java.lang.String, value: js.Any, data: Data = null, position: Position = null): Literal = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Literal]
  }
}

