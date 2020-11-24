package typings.valerieBrowser.Valerie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// A helper for parsing and formatting numeric values.
@js.native
trait NumericHelper extends js.Object {
  
  // Adds thousands separators to the given numeric string.
  def addThousandsSeparator(numericString: String): String = js.native
  
  // Formats the given numeric value as a string.
  def format(value: Double, format: String): String = js.native
  
  // Initialises the helper
  def init(
    decimalSeparator: String,
    thousandsSeparator: String,
    currencySign: String,
    currencyMinorUnitPlaces: Double
  ): NumericHelper = js.native
  
  // Informs whether the given numeric string represents a currency value with major units only.
  def isCurrencyMajor(numericString: String): Boolean = js.native
  
  // Informs whether the given numeric string represents a currency value with major units and optionally minor units.
  def isCurrencyMajorMinor(numericString: String): Boolean = js.native
  
  // Informs whether the given numeric string represents a non-integer numeric value.
  def isFloat(numericString: String): Boolean = js.native
  
  // Informs whether the given numeric string represents an integer value.
  def isInteger(numericString: String): Boolean = js.native
  
  // Attempts to parse the given numeric string as a number value. The string is unformatted first.
  def parse(numericString: String): Double = js.native
  
  // Unformats a numeric string; removes currency signs, thousands separators and normalises decimal separators.
  def unformat(numericString: String): String = js.native
}
object NumericHelper {
  
  @scala.inline
  def apply(
    addThousandsSeparator: String => String,
    format: (Double, String) => String,
    init: (String, String, String, Double) => NumericHelper,
    isCurrencyMajor: String => Boolean,
    isCurrencyMajorMinor: String => Boolean,
    isFloat: String => Boolean,
    isInteger: String => Boolean,
    parse: String => Double,
    unformat: String => String
  ): NumericHelper = {
    val __obj = js.Dynamic.literal(addThousandsSeparator = js.Any.fromFunction1(addThousandsSeparator), format = js.Any.fromFunction2(format), init = js.Any.fromFunction4(init), isCurrencyMajor = js.Any.fromFunction1(isCurrencyMajor), isCurrencyMajorMinor = js.Any.fromFunction1(isCurrencyMajorMinor), isFloat = js.Any.fromFunction1(isFloat), isInteger = js.Any.fromFunction1(isInteger), parse = js.Any.fromFunction1(parse), unformat = js.Any.fromFunction1(unformat))
    __obj.asInstanceOf[NumericHelper]
  }
  
  @scala.inline
  implicit class NumericHelperOps[Self <: NumericHelper] (val x: Self) extends AnyVal {
    
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
    def setAddThousandsSeparator(value: String => String): Self = this.set("addThousandsSeparator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormat(value: (Double, String) => String): Self = this.set("format", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInit(value: (String, String, String, Double) => NumericHelper): Self = this.set("init", js.Any.fromFunction4(value))
    
    @scala.inline
    def setIsCurrencyMajor(value: String => Boolean): Self = this.set("isCurrencyMajor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsCurrencyMajorMinor(value: String => Boolean): Self = this.set("isCurrencyMajorMinor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFloat(value: String => Boolean): Self = this.set("isFloat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsInteger(value: String => Boolean): Self = this.set("isInteger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParse(value: String => Double): Self = this.set("parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnformat(value: String => String): Self = this.set("unformat", js.Any.fromFunction1(value))
  }
}
