package typings.superstruct

import typings.superstruct.libStructMod.Struct
import typings.superstruct.libSuperstructMod.Superstruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs/lazy", JSImport.Namespace)
@js.native
object libStructsLazyMod extends js.Object {
  def createLazy(schema: js.Function0[Struct], defaults: js.Any, struct: Superstruct): Struct = js.native
}

