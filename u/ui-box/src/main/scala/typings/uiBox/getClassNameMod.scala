package typings.uiBox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getClassNameMod {
  
  @JSImport("ui-box/dist/src/get-class-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(propertyInfo: PropertyInfo, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(propertyInfo.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getClassNamePrefix(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassNamePrefix")().asInstanceOf[String]
  
  @scala.inline
  def setClassNamePrefix(prefix: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setClassNamePrefix")(prefix.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
    
    @scala.inline
    def apply(): PropertyInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropertyInfo]
    }
    
    @scala.inline
    implicit class PropertyInfoMutableBuilder[Self <: PropertyInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComplexValue(value: Boolean): Self = StObject.set(x, "complexValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComplexValueUndefined: Self = StObject.set(x, "complexValue", js.undefined)
      
      @scala.inline
      def setCssName(value: String): Self = StObject.set(x, "cssName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssNameUndefined: Self = StObject.set(x, "cssName", js.undefined)
      
      @scala.inline
      def setDefaultUnit(value: String): Self = StObject.set(x, "defaultUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUnitUndefined: Self = StObject.set(x, "defaultUnit", js.undefined)
      
      @scala.inline
      def setIsPrefixed(value: Boolean): Self = StObject.set(x, "isPrefixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPrefixedUndefined: Self = StObject.set(x, "isPrefixed", js.undefined)
      
      @scala.inline
      def setJsName(value: String): Self = StObject.set(x, "jsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsNameUndefined: Self = StObject.set(x, "jsName", js.undefined)
      
      @scala.inline
      def setSafeValue(value: Boolean): Self = StObject.set(x, "safeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeValueUndefined: Self = StObject.set(x, "safeValue", js.undefined)
    }
  }
}
