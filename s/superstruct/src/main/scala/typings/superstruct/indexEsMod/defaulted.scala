package typings.superstruct.indexEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/index.es", "defaulted")
@js.native
object defaulted extends js.Object {
  /**
    * Augment a struct to coerce a default value for missing values.
    *
    * Note: You must use `coerce(value, Struct)` on the value before validating it
    * to have the value defaulted!
    */
  /**
    * Augment a struct to coerce a default value for missing values.
    *
    * Note: You must use `coerce(value, Struct)` on the value before validating it
    * to have the value defaulted!
    */
  def apply[T](S: Struct_[T, _], fallback: js.Any): Struct_[T, _] = js.native
}

