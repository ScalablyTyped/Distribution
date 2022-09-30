package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcWasm.mod.TsCallSignatureDeclaration
  - typings.swcWasm.mod.TsConstructSignatureDeclaration
  - typings.swcWasm.mod.TsPropertySignature
  - typings.swcWasm.mod.TsGetterSignature
  - typings.swcWasm.mod.TsSetterSignature
  - typings.swcWasm.mod.TsMethodSignature
  - typings.swcWasm.mod.TsIndexSignature
*/
trait TsTypeElement extends StObject
object TsTypeElement {
  
  inline def TsCallSignatureDeclaration(params: js.Array[TsFnParameter], span: Span): typings.swcWasm.mod.TsCallSignatureDeclaration = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsCallSignatureDeclaration")
    __obj.asInstanceOf[typings.swcWasm.mod.TsCallSignatureDeclaration]
  }
  
  inline def TsConstructSignatureDeclaration(params: js.Array[TsFnParameter], span: Span): typings.swcWasm.mod.TsConstructSignatureDeclaration = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConstructSignatureDeclaration")
    __obj.asInstanceOf[typings.swcWasm.mod.TsConstructSignatureDeclaration]
  }
  
  inline def TsGetterSignature(computed: Boolean, key: Expression, optional: Boolean, readonly: Boolean, span: Span): typings.swcWasm.mod.TsGetterSignature = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsGetterSignature")
    __obj.asInstanceOf[typings.swcWasm.mod.TsGetterSignature]
  }
  
  inline def TsIndexSignature(params: js.Array[TsFnParameter], readonly: Boolean, span: Span, static: Boolean): typings.swcWasm.mod.TsIndexSignature = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsIndexSignature")
    __obj.asInstanceOf[typings.swcWasm.mod.TsIndexSignature]
  }
  
  inline def TsMethodSignature(
    computed: Boolean,
    key: Expression,
    optional: Boolean,
    params: js.Array[TsFnParameter],
    readonly: Boolean,
    span: Span
  ): typings.swcWasm.mod.TsMethodSignature = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsMethodSignature")
    __obj.asInstanceOf[typings.swcWasm.mod.TsMethodSignature]
  }
  
  inline def TsPropertySignature(
    computed: Boolean,
    key: Expression,
    optional: Boolean,
    params: js.Array[TsFnParameter],
    readonly: Boolean,
    span: Span
  ): typings.swcWasm.mod.TsPropertySignature = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsPropertySignature")
    __obj.asInstanceOf[typings.swcWasm.mod.TsPropertySignature]
  }
  
  inline def TsSetterSignature(
    computed: Boolean,
    key: Expression,
    optional: Boolean,
    param: TsFnParameter,
    readonly: Boolean,
    span: Span
  ): typings.swcWasm.mod.TsSetterSignature = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsSetterSignature")
    __obj.asInstanceOf[typings.swcWasm.mod.TsSetterSignature]
  }
}
