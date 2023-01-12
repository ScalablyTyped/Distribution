package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsParameterProperty
  extends StObject
     with Node
     with HasSpan
     with HasDecorator {
  
  var accessibility: js.UndefOr[Accessibility] = js.undefined
  
  var `override`: Boolean
  
  var param: TsParameterPropertyParameter
  
  var readonly: Boolean
  
  @JSName("type")
  var type_TsParameterProperty: typings.swcCore.swcCoreStrings.TsParameterProperty
}
object TsParameterProperty {
  
  inline def apply(`override`: Boolean, param: TsParameterPropertyParameter, readonly: Boolean, span: Span): TsParameterProperty = {
    val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsParameterProperty")
    __obj.asInstanceOf[TsParameterProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsParameterProperty] (val x: Self) extends AnyVal {
    
    inline def setAccessibility(value: Accessibility): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setParam(value: TsParameterPropertyParameter): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsParameterProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
