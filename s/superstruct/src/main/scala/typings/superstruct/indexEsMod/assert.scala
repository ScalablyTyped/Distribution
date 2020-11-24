package typings.superstruct.indexEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.es", "assert")
@js.native
object assert extends js.Object {
  
  /**
    * Assert that a value passes a `Struct`, throwing if it doesn't.
    */
  def apply[T](value: js.Any, struct: Struct_[T, _]): /* is T */ Boolean = js.native
}
