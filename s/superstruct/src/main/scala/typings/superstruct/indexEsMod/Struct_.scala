package typings.superstruct.indexEsMod

import typings.superstruct.anon.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.es", "Struct")
@js.native
class Struct_[T, S] protected () extends js.Object {
  def this(props: Schema[S, T]) = this()
  
  def coercer(value: js.Any): js.Any = js.native
  
  def refiner(value: T, context: StructContext): StructResult = js.native
  
  var schema: S = js.native
  
  var `type`: String = js.native
  
  def validator(value: js.Any, context: StructContext): StructResult = js.native
}
