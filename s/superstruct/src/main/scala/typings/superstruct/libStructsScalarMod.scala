package typings.superstruct

import typings.superstruct.libStructMod.Struct
import typings.superstruct.libSuperstructMod.Superstruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs/scalar", JSImport.Namespace)
@js.native
object libStructsScalarMod extends js.Object {
  def createScalar(schema: String, defaults: js.Any, struct: Superstruct): Struct = js.native
}

