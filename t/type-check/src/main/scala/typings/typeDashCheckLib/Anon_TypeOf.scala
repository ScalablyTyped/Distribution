package typings
package typeDashCheckLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeOf extends js.Object {
  var typeOf: java.lang.String
  def validate(x: js.Any): js.Any
}

object Anon_TypeOf {
  @scala.inline
  def apply(typeOf: java.lang.String, validate: js.Any => js.Any): Anon_TypeOf = {
    val __obj = js.Dynamic.literal(typeOf = typeOf, validate = js.Any.fromFunction1(validate))
  
    __obj.asInstanceOf[Anon_TypeOf]
  }
}

