package typings.superstruct

import typings.superstruct.libStructMod.Struct
import typings.superstruct.libSuperstructMod.Superstruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs/interface", JSImport.Namespace)
@js.native
object libStructsInterfaceMod extends js.Object {
  def createInterface(schema: js.Any, defaults: js.Any, struct: Superstruct): Struct = js.native
}

