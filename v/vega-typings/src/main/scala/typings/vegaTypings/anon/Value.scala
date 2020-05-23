package typings.vegaTypings.anon

import typings.vegaTypings.encodeMod.BaseValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value[T] extends BaseValueRef[T] {
  var value: T | Null
}

object Value {
  @scala.inline
  def apply[T](value: T = null): Value[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[T]]
  }
}

