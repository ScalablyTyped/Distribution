package typings.superstruct.mod

import typings.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "coercion")
@js.native
object coercion extends js.Object {
  def apply[T](struct: Struct[T, _], coercer: js.Function1[/* value */ js.Any, _]): Struct[T, _] = js.native
}

