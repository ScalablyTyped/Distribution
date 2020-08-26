package typings.superstruct.indexCjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/index.cjs", "dynamic")
@js.native
object dynamic extends js.Object {
  /**
    * Validate that a value dynamically, determing which struct to use at runtime.
    */
  /**
    * Validate that a value dynamically, determing which struct to use at runtime.
    */
  def apply[T](fn: js.Function2[/* value */ js.Any, /* ctx */ StructContext, Struct_[T, _]]): Struct_[T, _] = js.native
}

