package typings.superstruct

import typings.superstruct.libStructMod.Struct
import typings.superstruct.libSuperstructMod.Superstruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs/instance", JSImport.Namespace)
@js.native
object libStructsInstanceMod extends js.Object {
  def createInstance(schema: js.Any, defaults: js.Any, struct: Superstruct): Struct = js.native
}

