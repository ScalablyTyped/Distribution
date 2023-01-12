package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Constructor
  extends StObject
     with Node
     with HasSpan
     with ClassMember {
  
  var accessibility: js.UndefOr[Accessibility] = js.undefined
  
  var body: js.UndefOr[BlockStatement] = js.undefined
  
  var isOptional: Boolean
  
  var key: PropertyName
  
  var params: js.Array[TsParameterProperty | Param]
  
  @JSName("type")
  var type_Constructor: typings.swcCore.swcCoreStrings.Constructor
}
object Constructor {
  
  inline def apply(isOptional: Boolean, key: PropertyName, params: js.Array[TsParameterProperty | Param], span: Span): Constructor = {
    val __obj = js.Dynamic.literal(isOptional = isOptional.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Constructor")
    __obj.asInstanceOf[Constructor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Constructor] (val x: Self) extends AnyVal {
    
    inline def setAccessibility(value: Accessibility): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    inline def setBody(value: BlockStatement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setIsOptional(value: Boolean): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
    
    inline def setKey(value: PropertyName): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[TsParameterProperty | Param]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: (TsParameterProperty | Param)*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setType(value: typings.swcCore.swcCoreStrings.Constructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
