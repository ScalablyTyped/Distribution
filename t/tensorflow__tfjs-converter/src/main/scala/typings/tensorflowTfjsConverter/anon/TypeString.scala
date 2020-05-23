package typings.tensorflowTfjsConverter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeString extends js.Object {
  var items: Type
  var `type`: String
}

object TypeString {
  @scala.inline
  def apply(items: Type, `type`: String): TypeString = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeString]
  }
}

