package typings.superstruct.indexCjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.cjs", "coerce")
@js.native
object coerce extends js.Object {
  
  /**
    * Coerce a value with the coercion logic of `Struct` and validate it.
    */
  def apply[T](value: js.Any, struct: Struct_[T, _]): T = js.native
}
