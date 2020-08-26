package typings.superstruct

import typings.std.RegExp
import typings.superstruct.structMod.Struct
import typings.superstruct.structMod.StructContext
import typings.superstruct.structMod.StructResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/refinements", JSImport.Namespace)
@js.native
object refinementsMod extends js.Object {
  def empty[T /* <: String | js.Array[_] */](S: Struct[T, _]): Struct[T, _] = js.native
  def length[T /* <: String | js.Array[_] */](S: Struct[T, _], min: Double, max: Double): Struct[T, _] = js.native
  def pattern[T /* <: String */](S: Struct[T, _], regexp: RegExp): Struct[T, _] = js.native
  def refinement[T](
    struct: Struct[T, _],
    `type`: String,
    refiner: js.Function2[/* value */ T, /* context */ StructContext, StructResult]
  ): Struct[T, _] = js.native
}

