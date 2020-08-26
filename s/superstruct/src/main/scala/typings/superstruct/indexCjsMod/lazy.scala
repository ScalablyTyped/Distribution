package typings.superstruct.indexCjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/index.cjs", "lazy")
@js.native
object `lazy` extends js.Object {
  /**
    * Validate a value lazily, by constructing the struct right before the first
    * validation. This is useful for cases where you want to have self-referential
    * structs for nested data structures.
    */
  def apply[T](fn: js.Function0[Struct_[T, _]]): Struct_[T, _] = js.native
}

