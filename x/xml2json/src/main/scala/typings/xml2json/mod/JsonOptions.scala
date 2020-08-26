package typings.xml2json.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonOptions extends js.Object {
  /**
    * Changes the default textNode property from $t to _t when option is set to true.
    * Alternatively a string can be specified which will override $t to what ever the string is.
    */
  var alternateTextNode: js.UndefOr[Boolean] = js.native
  /**
    * XML child nodes are always treated as arrays.
    * You can specify a selective array of nodes for this to apply to instead of the whole document.
    */
  var arrayNotation: js.UndefOr[Boolean | js.Array[String]] = js.native
  /**
    * Makes type coercion.
    * i.e.: numbers and booleans present in attributes and element values are converted from string to its correspondent data types.
    * Coerce can be optionally defined as an object with specific methods of coercion based on attribute name or tag name, with fallback to default coercion.
    */
  var coerce: js.UndefOr[Boolean] = js.native
  /**
    * Returns a Javascript object instead of a JSON string.
    */
  // object?: boolean; // This is now overloaded in the toJson method
  /**
    * Makes the JSON reversible to XML.
    * xml2json tranforms CDATA content to JSON, but it doesn't generate a reversible structure.
    */
  var reversible: js.UndefOr[Boolean] = js.native
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
  var sanitize: js.UndefOr[Boolean] = js.native
  /**
    * Removes leading and trailing whitespaces as well as line terminators in element values.
    * Defaults to true.
    */
  var trim: js.UndefOr[Boolean] = js.native
}

object JsonOptions {
  @scala.inline
  def apply(): JsonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonOptions]
  }
  @scala.inline
  implicit class JsonOptionsOps[Self <: JsonOptions] (val x: Self) extends AnyVal {
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
    def setAlternateTextNode(value: Boolean): Self = this.set("alternateTextNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternateTextNode: Self = this.set("alternateTextNode", js.undefined)
    @scala.inline
    def setArrayNotationVarargs(value: String*): Self = this.set("arrayNotation", js.Array(value :_*))
    @scala.inline
    def setArrayNotation(value: Boolean | js.Array[String]): Self = this.set("arrayNotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayNotation: Self = this.set("arrayNotation", js.undefined)
    @scala.inline
    def setCoerce(value: Boolean): Self = this.set("coerce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoerce: Self = this.set("coerce", js.undefined)
    @scala.inline
    def setReversible(value: Boolean): Self = this.set("reversible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReversible: Self = this.set("reversible", js.undefined)
    @scala.inline
    def setSanitize(value: Boolean): Self = this.set("sanitize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSanitize: Self = this.set("sanitize", js.undefined)
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
  }
  
}

