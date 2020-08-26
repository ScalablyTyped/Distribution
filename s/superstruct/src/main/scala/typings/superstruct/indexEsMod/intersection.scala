package typings.superstruct.indexEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/index.es", "intersection")
@js.native
object intersection extends js.Object {
  /**
    * Validate that a value matches all of a set of structs.
    */
  def apply[A](Structs: StructTuple[js.Array[A]]): Struct_[A, _] = js.native
}

