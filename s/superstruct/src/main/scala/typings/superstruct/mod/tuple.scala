package typings.superstruct.mod

import typings.superstruct.structMod.Struct
import typings.superstruct.utilsMod.StructTuple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct", "tuple")
@js.native
object tuple extends js.Object {
  
  def apply[A](Structs: StructTuple[js.Array[A]]): Struct[A, _] = js.native
}
