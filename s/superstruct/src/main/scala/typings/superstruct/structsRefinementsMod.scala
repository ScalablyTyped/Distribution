package typings.superstruct

import typings.std.RegExp
import typings.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs/refinements", JSImport.Namespace)
@js.native
object structsRefinementsMod extends js.Object {
  def empty[T /* <: String | js.Array[_] */](struct: Struct[T, _]): Struct[T, _] = js.native
  def length[T /* <: String | js.Array[_] */](struct: Struct[T, _], min: Double, max: Double): Struct[T, _] = js.native
  def negative[T /* <: Double */](struct: Struct[T, _]): Struct[T, _] = js.native
  def nonnegative[T /* <: Double */](struct: Struct[T, _]): Struct[T, _] = js.native
  def nonpositive[T /* <: Double */](struct: Struct[T, _]): Struct[T, _] = js.native
  def pattern[T /* <: String */](struct: Struct[T, _], regexp: RegExp): Struct[T, _] = js.native
  def positive[T /* <: Double */](struct: Struct[T, _]): Struct[T, _] = js.native
  def refinement[T, S](
    name: String,
    struct: Struct[T, S],
    refiner: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Refiner<T, S> */ js.Any
  ): Struct[T, S] = js.native
}

