package typings.xml2json.anon

import typings.xml2json.xml2jsonBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  object  :true} & xml2json.xml2json.JsonOptions */
trait objecttrueJsonOptions extends js.Object {
  /**
    * Changes the default textNode property from $t to _t when option is set to true.
    * Alternatively a string can be specified which will override $t to what ever the string is.
    */
  var alternateTextNode: js.UndefOr[Boolean] = js.undefined
  /**
    * XML child nodes are always treated as arrays.
    * You can specify a selective array of nodes for this to apply to instead of the whole document.
    */
  var arrayNotation: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  /**
    * Makes type coercion.
    * i.e.: numbers and booleans present in attributes and element values are converted from string to its correspondent data types.
    * Coerce can be optionally defined as an object with specific methods of coercion based on attribute name or tag name, with fallback to default coercion.
    */
  var coerce: js.UndefOr[Boolean] = js.undefined
  var `object`: `true`
  /**
    * Returns a Javascript object instead of a JSON string.
    */
  // object?: boolean; // This is now overloaded in the toJson method
  /**
    * Makes the JSON reversible to XML.
    * xml2json tranforms CDATA content to JSON, but it doesn't generate a reversible structure.
    */
  var reversible: js.UndefOr[Boolean] = js.undefined
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
  var sanitize: js.UndefOr[Boolean] = js.undefined
  /**
    * Removes leading and trailing whitespaces as well as line terminators in element values.
    * Defaults to true.
    */
  var trim: js.UndefOr[Boolean] = js.undefined
}

object objecttrueJsonOptions {
  @scala.inline
  def apply(
    `object`: `true`,
    alternateTextNode: js.UndefOr[Boolean] = js.undefined,
    arrayNotation: Boolean | js.Array[String] = null,
    coerce: js.UndefOr[Boolean] = js.undefined,
    reversible: js.UndefOr[Boolean] = js.undefined,
    sanitize: js.UndefOr[Boolean] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined
  ): objecttrueJsonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (!js.isUndefined(alternateTextNode)) __obj.updateDynamic("alternateTextNode")(alternateTextNode.get.asInstanceOf[js.Any])
    if (arrayNotation != null) __obj.updateDynamic("arrayNotation")(arrayNotation.asInstanceOf[js.Any])
    if (!js.isUndefined(coerce)) __obj.updateDynamic("coerce")(coerce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reversible)) __obj.updateDynamic("reversible")(reversible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sanitize)) __obj.updateDynamic("sanitize")(sanitize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[objecttrueJsonOptions]
  }
}

