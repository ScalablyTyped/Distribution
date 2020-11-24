package typings.uiBox.styleSheetMod

import typings.std.CSSRule
import typings.std.CSSStyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomStyleSheet extends js.Object {
  
  def _insert(sheet: CSSStyleSheet, rule: String): Unit = js.native
  
  var ctr: js.Any = js.native
  
  def flush(): Unit = js.native
  
  def getSheet(): js.UndefOr[CSSStyleSheet] = js.native
  
  def inject(): Unit = js.native
  
  var injected: js.Any = js.native
  
  def insert(rule: String): Double = js.native
  
  var isSpeedy: js.Any = js.native
  
  var maxLength: js.Any = js.native
  
  def rules(): js.Array[CSSRule] = js.native
  
  var sheet: js.Any = js.native
  
  def speedy(bool: Boolean): Unit = js.native
  
  var tags: js.Any = js.native
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
    sheet: js.Any,
    speedy: Boolean => Unit,
    tags: js.Any
  ): CustomStyleSheet = {
    val __obj = js.Dynamic.literal(_insert = js.Any.fromFunction2(_insert), ctr = ctr.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), getSheet = js.Any.fromFunction0(getSheet), inject = js.Any.fromFunction0(inject), injected = injected.asInstanceOf[js.Any], insert = js.Any.fromFunction1(insert), isSpeedy = isSpeedy.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], rules = js.Any.fromFunction0(rules), sheet = sheet.asInstanceOf[js.Any], speedy = js.Any.fromFunction1(speedy), tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomStyleSheet]
  }
  
  @scala.inline
  implicit class CustomStyleSheetOps[Self <: CustomStyleSheet] (val x: Self) extends AnyVal {
    
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
    def set_insert(value: (CSSStyleSheet, String) => Unit): Self = this.set("_insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCtr(value: js.Any): Self = this.set("ctr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlush(value: () => Unit): Self = this.set("flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSheet(value: () => js.UndefOr[CSSStyleSheet]): Self = this.set("getSheet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInject(value: () => Unit): Self = this.set("inject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInjected(value: js.Any): Self = this.set("injected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsert(value: String => Double): Self = this.set("insert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsSpeedy(value: js.Any): Self = this.set("isSpeedy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLength(value: js.Any): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(value: () => js.Array[CSSRule]): Self = this.set("rules", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSheet(value: js.Any): Self = this.set("sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedy(value: Boolean => Unit): Self = this.set("speedy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTags(value: js.Any): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
}
