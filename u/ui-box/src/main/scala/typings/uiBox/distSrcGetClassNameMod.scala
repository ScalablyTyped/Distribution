package typings.uiBox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGetClassNameMod {
  
  @JSImport("ui-box/dist/src/get-class-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(propertyInfo: PropertyInfo, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(propertyInfo.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(propertyInfo: PropertyInfo, value: String, selector: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(propertyInfo.asInstanceOf[js.Any], value.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getClassNamePrefix(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassNamePrefix")().asInstanceOf[String]
  
  inline def setClassNamePrefix(prefix: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setClassNamePrefix")(prefix.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait PropertyInfo extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var complexValue: js.UndefOr[Boolean] = js.undefined
    
    var cssName: js.UndefOr[String] = js.undefined
    
    var defaultUnit: js.UndefOr[String] = js.undefined
    
    var isPrefixed: js.UndefOr[Boolean] = js.undefined
    
    var jsName: js.UndefOr[String] = js.undefined
    
    var safeValue: js.UndefOr[Boolean] = js.undefined
  }
  object PropertyInfo {
    
    inline def apply(): PropertyInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropertyInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PropertyInfo] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComplexValue(value: Boolean): Self = StObject.set(x, "complexValue", value.asInstanceOf[js.Any])
      
      inline def setComplexValueUndefined: Self = StObject.set(x, "complexValue", js.undefined)
      
      inline def setCssName(value: String): Self = StObject.set(x, "cssName", value.asInstanceOf[js.Any])
      
      inline def setCssNameUndefined: Self = StObject.set(x, "cssName", js.undefined)
      
      inline def setDefaultUnit(value: String): Self = StObject.set(x, "defaultUnit", value.asInstanceOf[js.Any])
      
      inline def setDefaultUnitUndefined: Self = StObject.set(x, "defaultUnit", js.undefined)
      
      inline def setIsPrefixed(value: Boolean): Self = StObject.set(x, "isPrefixed", value.asInstanceOf[js.Any])
      
      inline def setIsPrefixedUndefined: Self = StObject.set(x, "isPrefixed", js.undefined)
      
      inline def setJsName(value: String): Self = StObject.set(x, "jsName", value.asInstanceOf[js.Any])
      
      inline def setJsNameUndefined: Self = StObject.set(x, "jsName", js.undefined)
      
      inline def setSafeValue(value: Boolean): Self = StObject.set(x, "safeValue", value.asInstanceOf[js.Any])
      
      inline def setSafeValueUndefined: Self = StObject.set(x, "safeValue", js.undefined)
    }
  }
}
