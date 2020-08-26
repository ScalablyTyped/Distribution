package typings.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFontWeightsStatics extends js.Object {
  var black: FontWeight = js.native
  var bold: FontWeight = js.native
  var extraBlack: FontWeight = js.native
  var extraBold: FontWeight = js.native
  var extraLight: FontWeight = js.native
  var light: FontWeight = js.native
  var medium: FontWeight = js.native
  var normal: FontWeight = js.native
  var semiBold: FontWeight = js.native
  var semiLight: FontWeight = js.native
  var thin: FontWeight = js.native
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
    val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], extraBlack = extraBlack.asInstanceOf[js.Any], extraBold = extraBold.asInstanceOf[js.Any], extraLight = extraLight.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], semiBold = semiBold.asInstanceOf[js.Any], semiLight = semiLight.asInstanceOf[js.Any], thin = thin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFontWeightsStatics]
  }
  @scala.inline
  implicit class IFontWeightsStaticsOps[Self <: IFontWeightsStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlack(value: FontWeight): Self = this.set("black", value.asInstanceOf[js.Any])
    @scala.inline
    def setBold(value: FontWeight): Self = this.set("bold", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraBlack(value: FontWeight): Self = this.set("extraBlack", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraBold(value: FontWeight): Self = this.set("extraBold", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraLight(value: FontWeight): Self = this.set("extraLight", value.asInstanceOf[js.Any])
    @scala.inline
    def setLight(value: FontWeight): Self = this.set("light", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedium(value: FontWeight): Self = this.set("medium", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormal(value: FontWeight): Self = this.set("normal", value.asInstanceOf[js.Any])
    @scala.inline
    def setSemiBold(value: FontWeight): Self = this.set("semiBold", value.asInstanceOf[js.Any])
    @scala.inline
    def setSemiLight(value: FontWeight): Self = this.set("semiLight", value.asInstanceOf[js.Any])
    @scala.inline
    def setThin(value: FontWeight): Self = this.set("thin", value.asInstanceOf[js.Any])
  }
  
}

