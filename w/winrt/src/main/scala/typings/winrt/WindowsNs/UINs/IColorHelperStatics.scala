package typings.winrt.WindowsNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorHelperStatics extends js.Object {
  def fromArgb(a: Double, r: Double, g: Double, b: Double): Color
}

object IColorHelperStatics {
  @scala.inline
  def apply(fromArgb: (Double, Double, Double, Double) => Color): IColorHelperStatics = {
    val __obj = js.Dynamic.literal(fromArgb = js.Any.fromFunction4(fromArgb))
  
    __obj.asInstanceOf[IColorHelperStatics]
  }
}

