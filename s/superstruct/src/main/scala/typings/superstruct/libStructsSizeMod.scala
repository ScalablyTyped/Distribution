package typings.superstruct

import typings.superstruct.libStructMod.Struct
import typings.superstruct.libSuperstructMod.Superstruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs/size", JSImport.Namespace)
@js.native
object libStructsSizeMod extends js.Object {
  def createSize(schema: js.Tuple2[Double, Double], defaults: js.Any, struct: Superstruct): Struct = js.native
}

