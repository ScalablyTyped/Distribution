package typings.wordpressI18n.createI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I18n extends js.Object {
  /**
    * Retrieve the translation of text.
    */
  var __ : js.Function = js.native
  /**
    * Translates and retrieves the singular or plural form based on the supplied
    * number.
    */
  var _n: js.Function = js.native
  /**
    * Translates and retrieves the singular or plural form based on the supplied
    * number, with gettext context.
    */
  var _nx: js.Function = js.native
  /**
    * Retrieve translated string with gettext context.
    */
  var _x: js.Function = js.native
  /**
    * Check if current locale is RTL.
    */
  var isRTL: js.Function = js.native
  /**
    * Merges locale data into the Tannin instance by domain. Accepts data in a
    * Jed-formatted JSON object shape.
    */
  var setLocaleData: js.Function = js.native
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
  @scala.inline
  implicit class I18nOps[Self <: I18n] (val x: Self) extends AnyVal {
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
    def set__(value: js.Function): Self = this.set("__", value.asInstanceOf[js.Any])
    @scala.inline
    def set_n(value: js.Function): Self = this.set("_n", value.asInstanceOf[js.Any])
    @scala.inline
    def set_nx(value: js.Function): Self = this.set("_nx", value.asInstanceOf[js.Any])
    @scala.inline
    def set_x(value: js.Function): Self = this.set("_x", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRTL(value: js.Function): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetLocaleData(value: js.Function): Self = this.set("setLocaleData", value.asInstanceOf[js.Any])
  }
  
}

