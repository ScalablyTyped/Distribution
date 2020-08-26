package typings.superstruct.indexCjsMod

import typings.superstruct.anon.Coercer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/index.cjs", "Struct")
@js.native
class Struct_[T, S] protected () extends js.Object {
  def this(props: Coercer[S, T]) = this()
  var schema: S = js.native
  var `type`: String = js.native
  def coercer(value: js.Any): js.Any = js.native
  def refiner(value: T, context: StructContext): StructResult = js.native
  def validator(value: js.Any, context: StructContext): StructResult = js.native
}

