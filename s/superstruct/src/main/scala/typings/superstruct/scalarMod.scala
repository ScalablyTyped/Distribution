package typings.superstruct

import typings.superstruct.structMod.Struct
import typings.superstruct.superstructMod.Superstruct_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs/scalar", JSImport.Namespace)
@js.native
object scalarMod extends js.Object {
  def createScalar(schema: String, defaults: js.Any, struct: Superstruct_): Struct = js.native
}

