package typings.superstruct.structMod

import typings.superstruct.anon.Refiner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/struct", "Struct")
@js.native
class Struct[T, S] protected () extends js.Object {
  def this(props: Refiner[S, T]) = this()
  
  def coercer(value: js.Any): js.Any = js.native
  
  def refiner(value: T, context: StructContext): StructResult = js.native
  
  var schema: S = js.native
  
  var `type`: String = js.native
  
  def validator(value: js.Any, context: StructContext): StructResult = js.native
}
