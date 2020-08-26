package typings.winrt.Windows.Globalization

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeographicRegion extends js.Object {
  var code: String = js.native
  var codeThreeDigit: String = js.native
  var codeThreeLetter: String = js.native
  var codeTwoLetter: String = js.native
  var currenciesInUse: IVectorView[String] = js.native
  var displayName: String = js.native
  var nativeName: String = js.native
}

object IGeographicRegion {
  @scala.inline
  def apply(
    code: String,
    codeThreeDigit: String,
    codeThreeLetter: String,
    codeTwoLetter: String,
    currenciesInUse: IVectorView[String],
    displayName: String,
    nativeName: String
  ): IGeographicRegion = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], codeThreeDigit = codeThreeDigit.asInstanceOf[js.Any], codeThreeLetter = codeThreeLetter.asInstanceOf[js.Any], codeTwoLetter = codeTwoLetter.asInstanceOf[js.Any], currenciesInUse = currenciesInUse.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], nativeName = nativeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeographicRegion]
  }
  @scala.inline
  implicit class IGeographicRegionOps[Self <: IGeographicRegion] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodeThreeDigit(value: String): Self = this.set("codeThreeDigit", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodeThreeLetter(value: String): Self = this.set("codeThreeLetter", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodeTwoLetter(value: String): Self = this.set("codeTwoLetter", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrenciesInUse(value: IVectorView[String]): Self = this.set("currenciesInUse", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNativeName(value: String): Self = this.set("nativeName", value.asInstanceOf[js.Any])
  }
  
}

