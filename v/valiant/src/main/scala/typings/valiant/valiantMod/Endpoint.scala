package typings.valiant.valiantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint[T] extends js.Object {
  var finite: Boolean
  var inclusive: Boolean
  var value: T
}

object Endpoint {
  @scala.inline
  def apply[T](finite: Boolean, inclusive: Boolean, value: T): Endpoint[T] = {
    val __obj = js.Dynamic.literal(finite = finite, inclusive = inclusive, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Endpoint[T]]
  }
}

