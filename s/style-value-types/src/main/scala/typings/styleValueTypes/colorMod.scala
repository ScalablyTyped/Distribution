package typings.styleValueTypes

import typings.styleValueTypes.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("style-value-types/lib/value-types/color", JSImport.Namespace)
@js.native
object colorMod extends js.Object {
  val color: ValueType = js.native
  val hex: ValueType = js.native
  val hsla: ValueType = js.native
  val rgbUnit: ValueType = js.native
  val rgba: ValueType = js.native
  def getValueFromFunctionString(value: String): String = js.native
}

