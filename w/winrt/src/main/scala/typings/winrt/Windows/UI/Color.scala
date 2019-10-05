package typings.winrt.Windows.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var a: Double
  var b: Double
  var g: Double
  var r: Double
}

object Color {
  @scala.inline
  def apply(a: Double, b: Double, g: Double, r: Double): Color = {
    val __obj = js.Dynamic.literal(a = a, b = b, g = g, r = r)
  
    __obj.asInstanceOf[Color]
  }
}

