package typings.superstruct

import typings.superstruct.structMod.Struct
import typings.superstruct.superstructMod.Superstruct_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs/object", JSImport.Namespace)
@js.native
object objectMod extends js.Object {
  def createObject(schema: js.Object, defaults: js.Any, struct: Superstruct_): Struct = js.native
}

