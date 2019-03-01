package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFontWeightsStatics extends js.Object {
  var black: FontWeight
  var bold: FontWeight
  var extraBlack: FontWeight
  var extraBold: FontWeight
  var extraLight: FontWeight
  var light: FontWeight
  var medium: FontWeight
  var normal: FontWeight
  var semiBold: FontWeight
  var semiLight: FontWeight
  var thin: FontWeight
}

object IFontWeightsStatics {
  @scala.inline
  def apply(
    black: FontWeight,
    bold: FontWeight,
    extraBlack: FontWeight,
    extraBold: FontWeight,
    extraLight: FontWeight,
    light: FontWeight,
    medium: FontWeight,
    normal: FontWeight,
    semiBold: FontWeight,
    semiLight: FontWeight,
    thin: FontWeight
  ): IFontWeightsStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("black")(black)
    __obj.updateDynamic("bold")(bold)
    __obj.updateDynamic("extraBlack")(extraBlack)
    __obj.updateDynamic("extraBold")(extraBold)
    __obj.updateDynamic("extraLight")(extraLight)
    __obj.updateDynamic("light")(light)
    __obj.updateDynamic("medium")(medium)
    __obj.updateDynamic("normal")(normal)
    __obj.updateDynamic("semiBold")(semiBold)
    __obj.updateDynamic("semiLight")(semiLight)
    __obj.updateDynamic("thin")(thin)
    __obj.asInstanceOf[IFontWeightsStatics]
  }
}

