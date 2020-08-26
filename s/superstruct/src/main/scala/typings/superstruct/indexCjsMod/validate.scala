package typings.superstruct.indexCjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/index.cjs", "validate")
@js.native
object validate extends js.Object {
  /**
    * Validate a value against a `Struct`, returning an error if invalid.
    */
  def apply[T](value: js.Any, struct: Struct_[T, _]): js.Tuple2[js.UndefOr[StructError], js.UndefOr[T]] = js.native
  def apply[T](value: js.Any, struct: Struct_[T, _], coercing: Boolean): js.Tuple2[js.UndefOr[StructError], js.UndefOr[T]] = js.native
}

