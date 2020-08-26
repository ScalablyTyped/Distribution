package typings.tinymce.mod.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait i18n extends js.Object {
  var rtl: Boolean = js.native
  def add(code: String, items: js.Array[js.Object]): Unit = js.native
  def getCode(): String = js.native
  def setCode(newCode: String): Unit = js.native
  def translate(text: String): String = js.native
}

object i18n {
  @scala.inline
  def apply(
    add: (String, js.Array[js.Object]) => Unit,
    getCode: () => String,
    rtl: Boolean,
    setCode: String => Unit,
    translate: String => String
  ): i18n = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), getCode = js.Any.fromFunction0(getCode), rtl = rtl.asInstanceOf[js.Any], setCode = js.Any.fromFunction1(setCode), translate = js.Any.fromFunction1(translate))
    __obj.asInstanceOf[i18n]
  }
  @scala.inline
  implicit class i18nOps[Self <: i18n] (val x: Self) extends AnyVal {
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
    def setAdd(value: (String, js.Array[js.Object]) => Unit): Self = this.set("add", js.Any.fromFunction2(value))
    @scala.inline
    def setGetCode(value: () => String): Self = this.set("getCode", js.Any.fromFunction0(value))
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetCode(value: String => Unit): Self = this.set("setCode", js.Any.fromFunction1(value))
    @scala.inline
    def setTranslate(value: String => String): Self = this.set("translate", js.Any.fromFunction1(value))
  }
  
}

