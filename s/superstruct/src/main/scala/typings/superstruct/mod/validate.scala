package typings.superstruct.mod

import typings.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "validate")
@js.native
object validate extends js.Object {
  def apply[T](value: js.Any, struct: Struct[T, _]): js.Tuple2[js.UndefOr[typings.superstruct.structMod.StructError], js.UndefOr[T]] = js.native
  def apply[T](value: js.Any, struct: Struct[T, _], coercing: Boolean): js.Tuple2[js.UndefOr[typings.superstruct.structMod.StructError], js.UndefOr[T]] = js.native
}

