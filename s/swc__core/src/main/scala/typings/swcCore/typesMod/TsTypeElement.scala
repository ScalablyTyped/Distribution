package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.typesMod.TsCallSignatureDeclaration
  - typings.swcCore.typesMod.TsConstructSignatureDeclaration
  - typings.swcCore.typesMod.TsPropertySignature
  - typings.swcCore.typesMod.TsGetterSignature
  - typings.swcCore.typesMod.TsSetterSignature
  - typings.swcCore.typesMod.TsMethodSignature
  - typings.swcCore.typesMod.TsIndexSignature
*/
trait TsTypeElement extends StObject
object TsTypeElement {
  
  inline def TsCallSignatureDeclaration(params: js.Array[TsFnParameter], span: Span): typings.swcCore.typesMod.TsCallSignatureDeclaration = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsCallSignatureDeclaration")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsCallSignatureDeclaration]
  }
  
  inline def TsConstructSignatureDeclaration(params: js.Array[TsFnParameter], span: Span): typings.swcCore.typesMod.TsConstructSignatureDeclaration = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConstructSignatureDeclaration")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsConstructSignatureDeclaration]
  }
  
  inline def TsGetterSignature(computed: Boolean, key: Expression, optional: Boolean, readonly: Boolean, span: Span): typings.swcCore.typesMod.TsGetterSignature = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsGetterSignature")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsGetterSignature]
  }
  
  inline def TsIndexSignature(params: js.Array[TsFnParameter], readonly: Boolean, span: Span, static: Boolean): typings.swcCore.typesMod.TsIndexSignature = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsIndexSignature")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsIndexSignature]
  }
  
  inline def TsMethodSignature(
    computed: Boolean,
    key: Expression,
    optional: Boolean,
    params: js.Array[TsFnParameter],
    readonly: Boolean,
    span: Span
  ): typings.swcCore.typesMod.TsMethodSignature = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsMethodSignature")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsMethodSignature]
  }
  
  inline def TsPropertySignature(
    computed: Boolean,
    key: Expression,
    optional: Boolean,
    params: js.Array[TsFnParameter],
    readonly: Boolean,
    span: Span
  ): typings.swcCore.typesMod.TsPropertySignature = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsPropertySignature")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsPropertySignature]
  }
  
  inline def TsSetterSignature(
    computed: Boolean,
    key: Expression,
    optional: Boolean,
    param: TsFnParameter,
    readonly: Boolean,
    span: Span
  ): typings.swcCore.typesMod.TsSetterSignature = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsSetterSignature")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsSetterSignature]
  }
}
