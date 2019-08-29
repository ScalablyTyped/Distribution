package typings.xml2json.xml2jsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlOptions extends js.Object {
  /**
    * Ignores all null values.
    */
  var ignoreNull: js.UndefOr[Boolean] = js.undefined
  /**
    * Sanitizes the following characters present in element values (default false):
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
}

object XmlOptions {
  @scala.inline
  def apply(ignoreNull: js.UndefOr[Boolean] = js.undefined, sanitize: js.UndefOr[Boolean] = js.undefined): XmlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreNull)) __obj.updateDynamic("ignoreNull")(ignoreNull)
    if (!js.isUndefined(sanitize)) __obj.updateDynamic("sanitize")(sanitize)
    __obj.asInstanceOf[XmlOptions]
  }
}

