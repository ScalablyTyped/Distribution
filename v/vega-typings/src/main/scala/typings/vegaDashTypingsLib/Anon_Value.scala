package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Value[T]
  extends vegaDashTypingsLib.typesSpecEncodeMod.BaseValueRef[T] {
  var value: T | scala.Null
}

object Anon_Value {
  @scala.inline
  def apply[T](value: T = null): Anon_Value[T] = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Value[T]]
  }
}

