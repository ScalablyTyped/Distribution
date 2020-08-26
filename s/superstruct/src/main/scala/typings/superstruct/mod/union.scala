package typings.superstruct.mod

import typings.superstruct.structMod.Struct
import typings.superstruct.utilsMod.StructTuple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "union")
@js.native
object union extends js.Object {
  def apply[A](Structs: StructTuple[js.Array[A]]): Struct[A, _] = js.native
}

