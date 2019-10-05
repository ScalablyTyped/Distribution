package typings.theo.theoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("theo", "registerTransform")
@js.native
object registerTransform extends js.Object {
  def apply[T /* <: String */, V /* <: String */](name: T, valueTransforms: js.Array[V | ValueTransform]): Unit = js.native
  def apply[T /* <: String */, V /* <: String */](name: Transform, valueTransforms: js.Array[V | ValueTransform]): Unit = js.native
}

