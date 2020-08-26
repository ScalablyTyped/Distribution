package typings.superstruct.indexEsMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/index.es", "set")
@js.native
object set extends js.Object {
  /**
    * Validate that a set of values matches a specific type.
    */
  /**
    * Validate that a set of values matches a specific type.
    */
  def apply[T](Element: Struct_[T, _]): Struct_[Set[T], _] = js.native
}

