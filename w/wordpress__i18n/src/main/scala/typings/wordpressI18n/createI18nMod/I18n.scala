package typings.wordpressI18n.createI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18n extends js.Object {
  /**
    * Retrieve the translation of text.
    */
  var __ : js.Function
  /**
    * Translates and retrieves the singular or plural form based on the supplied
    * number.
    */
  var _n: js.Function
  /**
    * Translates and retrieves the singular or plural form based on the supplied
    * number, with gettext context.
    */
  var _nx: js.Function
  /**
    * Retrieve translated string with gettext context.
    */
  var _x: js.Function
  /**
    * Check if current locale is RTL.
    */
  var isRTL: js.Function
  /**
    * Merges locale data into the Tannin instance by domain. Accepts data in a
    * Jed-formatted JSON object shape.
    */
  var setLocaleData: js.Function
}

object I18n {
  @scala.inline
  def apply(
    __ : js.Function,
    _n: js.Function,
    _nx: js.Function,
    _x: js.Function,
    isRTL: js.Function,
    setLocaleData: js.Function
  ): I18n = {
    val __obj = js.Dynamic.literal(__ = __.asInstanceOf[js.Any], _n = _n.asInstanceOf[js.Any], _nx = _nx.asInstanceOf[js.Any], _x = _x.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], setLocaleData = setLocaleData.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18n]
  }
}

