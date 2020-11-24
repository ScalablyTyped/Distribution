package typings.w3cCssTypedObjectModelLevel1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSStyleRule extends js.Object {
  
  val styleMap: StylePropertyMap = js.native
}
object CSSStyleRule {
  
  @scala.inline
  def apply(styleMap: StylePropertyMap): CSSStyleRule = {
    val __obj = js.Dynamic.literal(styleMap = styleMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSStyleRule]
  }
  
  @scala.inline
  implicit class CSSStyleRuleOps[Self <: CSSStyleRule] (val x: Self) extends AnyVal {
    
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
    def setStyleMap(value: StylePropertyMap): Self = this.set("styleMap", value.asInstanceOf[js.Any])
  }
}
