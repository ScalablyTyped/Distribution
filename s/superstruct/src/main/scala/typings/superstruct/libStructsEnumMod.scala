package typings.superstruct

import typings.superstruct.libStructMod.Struct
import typings.superstruct.libSuperstructMod.Superstruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs/enum", JSImport.Namespace)
@js.native
object libStructsEnumMod extends js.Object {
  def createEnum(schema: js.Array[_], defaults: js.Any, struct: Superstruct): Struct = js.native
}

