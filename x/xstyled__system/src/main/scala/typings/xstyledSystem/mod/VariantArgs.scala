package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariantArgs extends StObject {
  
  var default: js.UndefOr[String | Double] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var prop: js.UndefOr[String] = js.undefined
  
  var variants: js.UndefOr[js.Object] = js.undefined
}
object VariantArgs {
  
  @scala.inline
  def apply(): VariantArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariantArgs]
  }
  
  @scala.inline
  implicit class VariantArgsMutableBuilder[Self <: VariantArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: String | Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Object): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
  }
}
