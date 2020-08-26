package typings.superstruct.indexCjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/index.cjs", "struct")
@js.native
object struct extends js.Object {
  /**
    * Define a `Struct` instance with a type and validation function.
    */
  /**
    * Define a `Struct` instance with a type and validation function.
    */
  def apply[T](
    name: String,
    validator: js.Function2[/* value */ js.Any, /* context */ StructContext, StructResult]
  ): Struct_[T, Null] = js.native
}

