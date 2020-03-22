package typings.uiBox.styleSheetMod

import typings.std.CSSRule
import typings.std.CSSStyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomStyleSheet extends js.Object {
  var ctr: js.Any
  var injected: js.Any
  var isSpeedy: js.Any
  var maxLength: js.Any
  var sheet: js.UndefOr[js.Any] = js.undefined
  var tags: js.Any
  def _insert(sheet: CSSStyleSheet, rule: String): Unit
  def flush(): Unit
  def getSheet(): js.UndefOr[CSSStyleSheet]
  def inject(): Unit
  def insert(rule: String): Double
  def rules(): js.Array[CSSRule]
  def speedy(bool: Boolean): Unit
}

object CustomStyleSheet {
  @scala.inline
  def apply(
    _insert: (CSSStyleSheet, String) => Unit,
    ctr: js.Any,
    flush: () => Unit,
    getSheet: () => js.UndefOr[CSSStyleSheet],
    inject: () => Unit,
    injected: js.Any,
    insert: String => Double,
    isSpeedy: js.Any,
    maxLength: js.Any,
    rules: () => js.Array[CSSRule],
    speedy: Boolean => Unit,
    tags: js.Any,
    sheet: js.Any = null
  ): CustomStyleSheet = {
    val __obj = js.Dynamic.literal(_insert = js.Any.fromFunction2(_insert), ctr = ctr.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), getSheet = js.Any.fromFunction0(getSheet), inject = js.Any.fromFunction0(inject), injected = injected.asInstanceOf[js.Any], insert = js.Any.fromFunction1(insert), isSpeedy = isSpeedy.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], rules = js.Any.fromFunction0(rules), speedy = js.Any.fromFunction1(speedy), tags = tags.asInstanceOf[js.Any])
    if (sheet != null) __obj.updateDynamic("sheet")(sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomStyleSheet]
  }
}

