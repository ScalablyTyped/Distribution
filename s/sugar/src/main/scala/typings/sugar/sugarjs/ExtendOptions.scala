package typings.sugar.sugarjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendOptions extends StObject {
  
  var enhance: js.UndefOr[Boolean] = js.undefined
  
  var enhanceArray: js.UndefOr[Boolean] = js.undefined
  
  var enhanceString: js.UndefOr[Boolean] = js.undefined
  
  var except: js.UndefOr[typings.sugar.Array[java.lang.String | NativeConstructor]] = js.undefined
  
  var methods: js.UndefOr[typings.sugar.Array[java.lang.String]] = js.undefined
  
  var namespaces: js.UndefOr[typings.sugar.Array[NativeConstructor]] = js.undefined
  
  var objectPrototype: js.UndefOr[Boolean] = js.undefined
}
object ExtendOptions {
  
  @scala.inline
  def apply(): ExtendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendOptions]
  }
  
  @scala.inline
  implicit class ExtendOptionsMutableBuilder[Self <: ExtendOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnhance(value: Boolean): Self = StObject.set(x, "enhance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhanceArray(value: Boolean): Self = StObject.set(x, "enhanceArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhanceArrayUndefined: Self = StObject.set(x, "enhanceArray", js.undefined)
    
    @scala.inline
    def setEnhanceString(value: Boolean): Self = StObject.set(x, "enhanceString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhanceStringUndefined: Self = StObject.set(x, "enhanceString", js.undefined)
    
    @scala.inline
    def setEnhanceUndefined: Self = StObject.set(x, "enhance", js.undefined)
    
    @scala.inline
    def setExcept(value: typings.sugar.Array[java.lang.String | NativeConstructor]): Self = StObject.set(x, "except", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptUndefined: Self = StObject.set(x, "except", js.undefined)
    
    @scala.inline
    def setMethods(value: typings.sugar.Array[java.lang.String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    @scala.inline
    def setNamespaces(value: typings.sugar.Array[NativeConstructor]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
    
    @scala.inline
    def setObjectPrototype(value: Boolean): Self = StObject.set(x, "objectPrototype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectPrototypeUndefined: Self = StObject.set(x, "objectPrototype", js.undefined)
  }
}
