package typings.tinymce.mod.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait i18n extends js.Object {
  var rtl: Boolean
  def add(code: String, items: js.Array[js.Object]): Unit
  def getCode(): String
  def setCode(newCode: String): Unit
  def translate(text: String): String
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
}

