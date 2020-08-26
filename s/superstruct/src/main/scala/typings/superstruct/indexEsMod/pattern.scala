package typings.superstruct.indexEsMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/index.es", "pattern")
@js.native
object pattern extends js.Object {
  /**
    * Refine a string struct to match a specific regexp pattern.
    */
  /**
    * Refine a string struct to match a specific regexp pattern.
    */
  def apply[T /* <: String */](S: Struct_[T, _], regexp: RegExp): Struct_[T, _] = js.native
}

