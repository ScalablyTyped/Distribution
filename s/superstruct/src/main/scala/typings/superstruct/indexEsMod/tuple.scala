package typings.superstruct.indexEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/index.es", "tuple")
@js.native
object tuple extends js.Object {
  /**
    * Validate that a value is a tuple with entries of specific types.
    */
  def apply[A](Structs: StructTuple[js.Array[A]]): Struct_[A, _] = js.native
}

