package typings.superstruct.indexEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/index.es", "union")
@js.native
object union extends js.Object {
  /**
    * Validate that a value is one of a set of types.
    */
  def apply[A](Structs: StructTuple[js.Array[A]]): Struct_[A, _] = js.native
}

