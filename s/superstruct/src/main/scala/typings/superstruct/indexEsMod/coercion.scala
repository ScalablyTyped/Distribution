package typings.superstruct.indexEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.es", "coercion")
@js.native
object coercion extends js.Object {
  
  /**
    * Augment a `Struct` to add an additional coercion step to its input.
    */
  def apply[T](struct: Struct_[T, _], coercer: js.Function1[/* value */ js.Any, _]): Struct_[T, _] = js.native
}
