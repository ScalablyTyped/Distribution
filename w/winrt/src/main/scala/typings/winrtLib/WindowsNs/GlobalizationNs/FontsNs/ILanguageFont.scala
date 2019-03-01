package typings
package winrtLib.WindowsNs.GlobalizationNs.FontsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageFont extends js.Object {
  var fontFamily: java.lang.String
  var fontStretch: winrtLib.WindowsNs.UINs.TextNs.FontStretch
  var fontStyle: winrtLib.WindowsNs.UINs.TextNs.FontStyle
  var fontWeight: winrtLib.WindowsNs.UINs.TextNs.FontWeight
  var scaleFactor: scala.Double
}

object ILanguageFont {
  @scala.inline
  def apply(
    fontFamily: java.lang.String,
    fontStretch: winrtLib.WindowsNs.UINs.TextNs.FontStretch,
    fontStyle: winrtLib.WindowsNs.UINs.TextNs.FontStyle,
    fontWeight: winrtLib.WindowsNs.UINs.TextNs.FontWeight,
    scaleFactor: scala.Double
  ): ILanguageFont = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fontFamily")(fontFamily)
    __obj.updateDynamic("fontStretch")(fontStretch)
    __obj.updateDynamic("fontStyle")(fontStyle)
    __obj.updateDynamic("fontWeight")(fontWeight)
    __obj.updateDynamic("scaleFactor")(scaleFactor)
    __obj.asInstanceOf[ILanguageFont]
  }
}

