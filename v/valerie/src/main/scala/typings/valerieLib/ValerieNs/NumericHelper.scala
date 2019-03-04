package typings
package valerieLib.ValerieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// A helper for parsing and formatting numeric values.
trait NumericHelper extends js.Object {
  // Adds thousands separators to the given numeric string.
  def addThousandsSeparator(numericString: java.lang.String): java.lang.String
  // Formats the given numeric value as a string.
  def format(value: scala.Double, format: java.lang.String): java.lang.String
  // Initialises the helper
  def init(
    decimalSeparator: java.lang.String,
    thousandsSeparator: java.lang.String,
    currencySign: java.lang.String,
    currencyMinorUnitPlaces: scala.Double
  ): NumericHelper
  // Informs whether the given numeric string represents a currency value with major units only.
  def isCurrencyMajor(numericString: java.lang.String): scala.Boolean
  // Informs whether the given numeric string represents a currency value with major units and optionally minor units.
  def isCurrencyMajorMinor(numericString: java.lang.String): scala.Boolean
  // Informs whether the given numeric string represents a non-integer numeric value.
  def isFloat(numericString: java.lang.String): scala.Boolean
  // Informs whether the given numeric string represents an integer value.
  def isInteger(numericString: java.lang.String): scala.Boolean
  // Attempts to parse the given numeric string as a number value. The string is unformatted first.
  def parse(numericString: java.lang.String): scala.Double
  // Unformats a numeric string; removes currency signs, thousands separators and normalises decimal separators.
  def unformat(numericString: java.lang.String): java.lang.String
}

object NumericHelper {
  @scala.inline
  def apply(
    addThousandsSeparator: js.Function1[java.lang.String, java.lang.String],
    format: js.Function2[scala.Double, java.lang.String, java.lang.String],
    init: js.Function4[java.lang.String, java.lang.String, java.lang.String, scala.Double, NumericHelper],
    isCurrencyMajor: js.Function1[java.lang.String, scala.Boolean],
    isCurrencyMajorMinor: js.Function1[java.lang.String, scala.Boolean],
    isFloat: js.Function1[java.lang.String, scala.Boolean],
    isInteger: js.Function1[java.lang.String, scala.Boolean],
    parse: js.Function1[java.lang.String, scala.Double],
    unformat: js.Function1[java.lang.String, java.lang.String]
  ): NumericHelper = {
    val __obj = js.Dynamic.literal(addThousandsSeparator = addThousandsSeparator, format = format, init = init, isCurrencyMajor = isCurrencyMajor, isCurrencyMajorMinor = isCurrencyMajorMinor, isFloat = isFloat, isInteger = isInteger, parse = parse, unformat = unformat)
  
    __obj.asInstanceOf[NumericHelper]
  }
}

