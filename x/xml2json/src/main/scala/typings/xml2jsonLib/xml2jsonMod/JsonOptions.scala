package typings
package xml2jsonLib.xml2jsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonOptions extends js.Object {
  /**
    * XML child nodes are always treated as arrays
    */
  var arrayNotation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Makes type coercion.
    * i.e.: numbers and booleans present in attributes and element values are converted from string to its correspondent data types.
    * Coerce can be optionally defined as an object with specific methods of coercion based on attribute name or tag name, with fallback to default coercion.
    */
  var coerce: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Returns a Javascript object instead of a JSON string.
    */
  // object?: boolean; // This is now overloaded in the toJson method
  /**
    * Makes the JSON reversible to XML.
    * xml2json tranforms CDATA content to JSON, but it doesn't generate a reversible structure.
    */
  var reversible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sanitizes the following characters present in element values (default true):
    * @example
    * var chars =  {
    * '<': '&lt;',
    * '>': '&gt;',
    * '(': '&#40;',
    * ')': '&#41;',
    * '#': '&#35;',
    * '&': '&amp;',
    * '"': '&quot;',
    * "'": '&apos;'
    * };
    * @example
    */
  var sanitize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Removes leading and trailing whitespaces as well as line terminators in element values.
    * Defaults to true.
    */
  var trim: js.UndefOr[scala.Boolean] = js.undefined
}

object JsonOptions {
  @scala.inline
  def apply(
    arrayNotation: js.UndefOr[scala.Boolean] = js.undefined,
    coerce: js.UndefOr[scala.Boolean] = js.undefined,
    reversible: js.UndefOr[scala.Boolean] = js.undefined,
    sanitize: js.UndefOr[scala.Boolean] = js.undefined,
    trim: js.UndefOr[scala.Boolean] = js.undefined
  ): JsonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrayNotation)) __obj.updateDynamic("arrayNotation")(arrayNotation)
    if (!js.isUndefined(coerce)) __obj.updateDynamic("coerce")(coerce)
    if (!js.isUndefined(reversible)) __obj.updateDynamic("reversible")(reversible)
    if (!js.isUndefined(sanitize)) __obj.updateDynamic("sanitize")(sanitize)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    __obj.asInstanceOf[JsonOptions]
  }
}

