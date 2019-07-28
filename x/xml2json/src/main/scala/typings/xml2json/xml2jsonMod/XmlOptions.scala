package typings.xml2json.xml2jsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlOptions extends js.Object {
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
  def apply(sanitize: js.UndefOr[Boolean] = js.undefined): XmlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sanitize)) __obj.updateDynamic("sanitize")(sanitize)
    __obj.asInstanceOf[XmlOptions]
  }
}

