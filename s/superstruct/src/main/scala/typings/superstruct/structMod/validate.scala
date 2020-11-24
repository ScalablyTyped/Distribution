package typings.superstruct.structMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/struct", "validate")
@js.native
object validate extends js.Object {
  
  def apply[T](value: js.Any, struct: Struct[T, _]): js.Tuple2[js.UndefOr[StructError], js.UndefOr[T]] = js.native
  def apply[T](value: js.Any, struct: Struct[T, _], coercing: Boolean): js.Tuple2[js.UndefOr[StructError], js.UndefOr[T]] = js.native
}
