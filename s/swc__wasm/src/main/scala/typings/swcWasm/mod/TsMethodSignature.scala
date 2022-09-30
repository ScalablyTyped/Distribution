package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsMethodSignature
  extends StObject
     with Node
     with HasSpan
     with TsTypeElement {
  
  var computed: Boolean
  
  var key: Expression
  
  var optional: Boolean
  
  var params: js.Array[TsFnParameter]
  
  var readonly: Boolean
  
  var typeAnn: js.UndefOr[TsTypeAnnotation] = js.undefined
  
  var typeParams: js.UndefOr[TsTypeParameterDeclaration] = js.undefined
  
  @JSName("type")
  var type_TsMethodSignature: typings.swcWasm.swcWasmStrings.TsMethodSignature
}
object TsMethodSignature {
  
  inline def apply(
    computed: Boolean,
    key: Expression,
    optional: Boolean,
    params: js.Array[TsFnParameter],
    readonly: Boolean,
    span: Span
  ): TsMethodSignature = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsMethodSignature")
    __obj.asInstanceOf[TsMethodSignature]
  }
  
  extension [Self <: TsMethodSignature](x: Self) {
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[TsFnParameter]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: TsFnParameter*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsMethodSignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnn(value: TsTypeAnnotation): Self = StObject.set(x, "typeAnn", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnUndefined: Self = StObject.set(x, "typeAnn", js.undefined)
    
    inline def setTypeParams(value: TsTypeParameterDeclaration): Self = StObject.set(x, "typeParams", value.asInstanceOf[js.Any])
    
    inline def setTypeParamsUndefined: Self = StObject.set(x, "typeParams", js.undefined)
  }
}
