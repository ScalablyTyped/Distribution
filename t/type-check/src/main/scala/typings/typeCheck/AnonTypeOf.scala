package typings.typeCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeOf extends js.Object {
  var typeOf: String
  def validate(x: js.Any): js.Any
}

object AnonTypeOf {
  @scala.inline
  def apply(typeOf: String, validate: js.Any => js.Any): AnonTypeOf = {
    val __obj = js.Dynamic.literal(typeOf = typeOf.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
  
    __obj.asInstanceOf[AnonTypeOf]
  }
}

