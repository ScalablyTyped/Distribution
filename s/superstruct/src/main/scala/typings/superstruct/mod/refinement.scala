package typings.superstruct.mod

import typings.superstruct.structMod.Struct
import typings.superstruct.structMod.StructContext
import typings.superstruct.structMod.StructResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "refinement")
@js.native
object refinement extends js.Object {
  def apply[T](
    struct: Struct[T, _],
    `type`: String,
    refiner: js.Function2[/* value */ T, /* context */ StructContext, StructResult]
  ): Struct[T, _] = js.native
}

