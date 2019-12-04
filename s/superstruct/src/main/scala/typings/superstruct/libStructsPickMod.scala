package typings.superstruct

import typings.superstruct.libStructMod.Struct
import typings.superstruct.libSuperstructMod.Superstruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs/pick", JSImport.Namespace)
@js.native
object libStructsPickMod extends js.Object {
  def createPick(schema: js.Object, defaults: js.Any, struct: Superstruct): Struct = js.native
}

