package typings.superstruct.indexCjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/index.cjs", "nullable")
@js.native
object nullable extends js.Object {
  /**
    * Augment a struct to make it accept `null` values.
    */
  /**
    * Augment a struct to make it accept `null` values.
    */
  def apply[T](S: Struct_[T, _]): Struct_[T | Null, _] = js.native
}

