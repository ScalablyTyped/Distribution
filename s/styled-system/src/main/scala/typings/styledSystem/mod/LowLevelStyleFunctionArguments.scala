package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LowLevelStyleFunctionArguments[N, S] extends js.Object {
  
  var alias: js.UndefOr[String] = js.native
  
  var cssProperty: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var prop: String = js.native
  
  // new v5 api
  var properties: js.UndefOr[js.Array[String]] = js.native
  
  var scale: js.UndefOr[S] = js.native
  
  var transformValue: js.UndefOr[js.Function2[/* n */ N, /* scale */ js.UndefOr[S], _]] = js.native
}
object LowLevelStyleFunctionArguments {
  
  @scala.inline
  def apply[N, S](prop: String): LowLevelStyleFunctionArguments[N, S] = {
    val __obj = js.Dynamic.literal(prop = prop.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowLevelStyleFunctionArguments[N, S]]
  }
  
  @scala.inline
  implicit class LowLevelStyleFunctionArgumentsOps[Self <: LowLevelStyleFunctionArguments[_, _], N, S] (val x: Self with (LowLevelStyleFunctionArguments[N, S])) extends AnyVal {
    
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
    def setProp(value: String): Self = this.set("prop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setCssProperty(value: String): Self = this.set("cssProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssProperty: Self = this.set("cssProperty", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: String*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setScale(value: S): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setTransformValue(value: (/* n */ N, /* scale */ js.UndefOr[S]) => _): Self = this.set("transformValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTransformValue: Self = this.set("transformValue", js.undefined)
  }
}
