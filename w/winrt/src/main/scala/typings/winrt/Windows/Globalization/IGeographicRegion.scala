package typings.winrt.Windows.Globalization

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeographicRegion extends js.Object {
  var code: String
  var codeThreeDigit: String
  var codeThreeLetter: String
  var codeTwoLetter: String
  var currenciesInUse: IVectorView[String]
  var displayName: String
  var nativeName: String
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
    val __obj = js.Dynamic.literal(code = code, codeThreeDigit = codeThreeDigit, codeThreeLetter = codeThreeLetter, codeTwoLetter = codeTwoLetter, currenciesInUse = currenciesInUse, displayName = displayName, nativeName = nativeName)
  
    __obj.asInstanceOf[IGeographicRegion]
  }
}

