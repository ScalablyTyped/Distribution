package typings
package winrtLib.WindowsNs.GlobalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeographicRegion extends js.Object {
  var code: java.lang.String
  var codeThreeDigit: java.lang.String
  var codeThreeLetter: java.lang.String
  var codeTwoLetter: java.lang.String
  var currenciesInUse: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var displayName: java.lang.String
  var nativeName: java.lang.String
}

object IGeographicRegion {
  @scala.inline
  def apply(
    code: java.lang.String,
    codeThreeDigit: java.lang.String,
    codeThreeLetter: java.lang.String,
    codeTwoLetter: java.lang.String,
    currenciesInUse: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    displayName: java.lang.String,
    nativeName: java.lang.String
  ): IGeographicRegion = {
    val __obj = js.Dynamic.literal(code = code, codeThreeDigit = codeThreeDigit, codeThreeLetter = codeThreeLetter, codeTwoLetter = codeTwoLetter, currenciesInUse = currenciesInUse, displayName = displayName, nativeName = nativeName)
  
    __obj.asInstanceOf[IGeographicRegion]
  }
}

