package typings.xstyledSystem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CssProperty extends js.Object {
  
  var cssProperty: String | js.Array[String] = js.native
  
  var key: js.UndefOr[js.Any] = js.native
  
  var prop: String | js.Array[String] = js.native
  
  var themeGet: js.UndefOr[js.Any] = js.native
  
  var transform: js.UndefOr[js.Any] = js.native
}
object CssProperty {
  
  @scala.inline
  def apply(cssProperty: String | js.Array[String], prop: String | js.Array[String]): CssProperty = {
    val __obj = js.Dynamic.literal(cssProperty = cssProperty.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssProperty]
  }
  
  @scala.inline
  implicit class CssPropertyOps[Self <: CssProperty] (val x: Self) extends AnyVal {
    
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
    def setCssPropertyVarargs(value: String*): Self = this.set("cssProperty", js.Array(value :_*))
    
    @scala.inline
    def setCssProperty(value: String | js.Array[String]): Self = this.set("cssProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropVarargs(value: String*): Self = this.set("prop", js.Array(value :_*))
    
    @scala.inline
    def setProp(value: String | js.Array[String]): Self = this.set("prop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setThemeGet(value: js.Any): Self = this.set("themeGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeGet: Self = this.set("themeGet", js.undefined)
    
    @scala.inline
    def setTransform(value: js.Any): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
