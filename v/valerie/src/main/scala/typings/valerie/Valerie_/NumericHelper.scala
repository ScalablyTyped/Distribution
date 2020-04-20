package typings.valerie.Valerie_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// A helper for parsing and formatting numeric values.
trait NumericHelper extends js.Object {
  // Adds thousands separators to the given numeric string.
  def addThousandsSeparator(numericString: String): String
  // Formats the given numeric value as a string.
  def format(value: Double, format: String): String
  // Initialises the helper
  def init(
    decimalSeparator: String,
    thousandsSeparator: String,
    currencySign: String,
    currencyMinorUnitPlaces: Double
  ): NumericHelper
  // Informs whether the given numeric string represents a currency value with major units only.
  def isCurrencyMajor(numericString: String): Boolean
  // Informs whether the given numeric string represents a currency value with major units and optionally minor units.
  def isCurrencyMajorMinor(numericString: String): Boolean
  // Informs whether the given numeric string represents a non-integer numeric value.
  def isFloat(numericString: String): Boolean
  // Informs whether the given numeric string represents an integer value.
  def isInteger(numericString: String): Boolean
  // Attempts to parse the given numeric string as a number value. The string is unformatted first.
  def parse(numericString: String): Double
  // Unformats a numeric string; removes currency signs, thousands separators and normalises decimal separators.
  def unformat(numericString: String): String
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
}

