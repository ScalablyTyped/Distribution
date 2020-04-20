package typings.styleToObject.mod

import typings.styleToObject.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// declaration is an object from module `inline-style-parser`
trait Declaration extends js.Object {
  var position: AnonEnd
  var property: String
  var `type`: String
  var value: String
}

object Declaration {
  @scala.inline
  def apply(position: AnonEnd, property: String, `type`: String, value: String): Declaration = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
}

