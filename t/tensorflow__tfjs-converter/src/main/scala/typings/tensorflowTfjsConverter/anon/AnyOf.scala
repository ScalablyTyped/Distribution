package typings.tensorflowTfjsConverter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyOf extends js.Object {
  var anyOf: js.Array[ItemsType | TypeString]
}

object AnyOf {
  @scala.inline
  def apply(anyOf: js.Array[ItemsType | TypeString]): AnyOf = {
    val __obj = js.Dynamic.literal(anyOf = anyOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyOf]
  }
}

