package typings.superstruct

import typings.superstruct.structMod.Struct
import typings.superstruct.superstructMod.Superstruct_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs/record", JSImport.Namespace)
@js.native
object recordMod extends js.Object {
  def createRecord(schema: js.Tuple2[_, _], defaults: js.Any, struct: Superstruct_): Struct = js.native
}

