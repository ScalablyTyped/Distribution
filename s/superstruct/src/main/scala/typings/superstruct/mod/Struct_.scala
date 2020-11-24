package typings.superstruct.mod

import typings.superstruct.anon.Refiner
import typings.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct", "Struct")
@js.native
class Struct_[T, S] protected () extends Struct[T, S] {
  def this(props: Refiner[S, T]) = this()
}
