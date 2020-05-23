package typings.typeCheck.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeOf extends js.Object {
  var typeOf: String
  def validate(x: js.Any): js.Any
}

object TypeOf {
  @scala.inline
  def apply(typeOf: String, validate: js.Any => js.Any): TypeOf = {
    val __obj = js.Dynamic.literal(typeOf = typeOf.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[TypeOf]
  }
}

