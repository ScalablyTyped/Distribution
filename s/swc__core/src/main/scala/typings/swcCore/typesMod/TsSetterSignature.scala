package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsSetterSignature
  extends StObject
     with Node
     with HasSpan
     with TsTypeElement {
  
  var computed: Boolean
  
  var key: Expression
  
  var optional: Boolean
  
  var param: TsFnParameter
  
  var readonly: Boolean
  
  @JSName("type")
  var type_TsSetterSignature: typings.swcCore.swcCoreStrings.TsSetterSignature
}
object TsSetterSignature {
  
  inline def apply(
    computed: Boolean,
    key: Expression,
    optional: Boolean,
    param: TsFnParameter,
    readonly: Boolean,
    span: Span
  ): TsSetterSignature = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsSetterSignature")
    __obj.asInstanceOf[TsSetterSignature]
  }
  
  extension [Self <: TsSetterSignature](x: Self) {
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setParam(value: TsFnParameter): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsSetterSignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
