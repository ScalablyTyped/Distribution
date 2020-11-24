package typings.winrtUwp.Windows.Globalization

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes a region. This is usually a country, but may be a macroregion. */
@js.native
trait GeographicRegion extends js.Object {
  
  /** Gets the string that contains the best available identifier that represents the region. */
  var code: String = js.native
  
  /** Gets the three-digit identifier for this region, as a string. */
  var codeThreeDigit: String = js.native
  
  /** Gets the three-letter identifier for this region. */
  var codeThreeLetter: String = js.native
  
  /** Gets the two-letter identifier for this region. */
  var codeTwoLetter: String = js.native
  
  /** Gets the set of currencies in use in this region. */
  var currenciesInUse: IVectorView[String] = js.native
  
  /** Gets a localized string that is suitable for display to the user for identifying the region. */
  var displayName: String = js.native
  
  /** Gets the name of the region in the primary language spoken in this region. */
  var nativeName: String = js.native
}
object GeographicRegion {
  
  @scala.inline
  def apply(
    code: String,
    codeThreeDigit: String,
    codeThreeLetter: String,
    codeTwoLetter: String,
    currenciesInUse: IVectorView[String],
    displayName: String,
    nativeName: String
  ): GeographicRegion = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], codeThreeDigit = codeThreeDigit.asInstanceOf[js.Any], codeThreeLetter = codeThreeLetter.asInstanceOf[js.Any], codeTwoLetter = codeTwoLetter.asInstanceOf[js.Any], currenciesInUse = currenciesInUse.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], nativeName = nativeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeographicRegion]
  }
  
  @scala.inline
  implicit class GeographicRegionOps[Self <: GeographicRegion] (val x: Self) extends AnyVal {
    
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
