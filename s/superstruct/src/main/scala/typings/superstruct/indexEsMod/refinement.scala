package typings.superstruct.indexEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.es", "refinement")
@js.native
object refinement extends js.Object {
  
  /**
    * Augment a `Struct` to add an additional refinement to the validation.
    */
  def apply[T](
    struct: Struct_[T, _],
    `type`: String,
    refiner: js.Function2[/* value */ T, /* context */ StructContext, StructResult]
  ): Struct_[T, _] = js.native
}
