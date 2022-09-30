package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.typesMod.Constructor
  - typings.swcCore.typesMod.ClassMethod
  - typings.swcCore.typesMod.PrivateMethod
  - typings.swcCore.typesMod.ClassProperty
  - typings.swcCore.typesMod.PrivateProperty
  - typings.swcCore.typesMod.TsIndexSignature
  - typings.swcCore.typesMod.EmptyStatement
  - typings.swcCore.typesMod.StaticBlock
*/
trait ClassMember extends StObject
object ClassMember {
  
  inline def ClassMethod(
    function: Fn,
    isAbstract: Boolean,
    isOptional: Boolean,
    isOverride: Boolean,
    isStatic: Boolean,
    key: PropertyName,
    kind: MethodKind,
    span: Span
  ): typings.swcCore.typesMod.ClassMethod = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any], isAbstract = isAbstract.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], isOverride = isOverride.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassMethod")
    __obj.asInstanceOf[typings.swcCore.typesMod.ClassMethod]
  }
  
  inline def ClassProperty(
    declare: Boolean,
    definite: Boolean,
    isAbstract: Boolean,
    isOptional: Boolean,
    isOverride: Boolean,
    isStatic: Boolean,
    key: PropertyName,
    readonly: Boolean,
    span: Span
  ): typings.swcCore.typesMod.ClassProperty = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], definite = definite.asInstanceOf[js.Any], isAbstract = isAbstract.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], isOverride = isOverride.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassProperty")
    __obj.asInstanceOf[typings.swcCore.typesMod.ClassProperty]
  }
  
  inline def Constructor(isOptional: Boolean, key: PropertyName, params: js.Array[TsParameterProperty | Param], span: Span): typings.swcCore.typesMod.Constructor = {
    val __obj = js.Dynamic.literal(isOptional = isOptional.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Constructor")
    __obj.asInstanceOf[typings.swcCore.typesMod.Constructor]
  }
  
  inline def EmptyStatement(span: Span): typings.swcCore.typesMod.EmptyStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EmptyStatement")
    __obj.asInstanceOf[typings.swcCore.typesMod.EmptyStatement]
  }
  
  inline def PrivateMethod(
    function: Fn,
    isAbstract: Boolean,
    isOptional: Boolean,
    isOverride: Boolean,
    isStatic: Boolean,
    key: PrivateName,
    kind: MethodKind,
    span: Span
  ): typings.swcCore.typesMod.PrivateMethod = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any], isAbstract = isAbstract.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], isOverride = isOverride.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PrivateMethod")
    __obj.asInstanceOf[typings.swcCore.typesMod.PrivateMethod]
  }
  
  inline def PrivateProperty(
    definite: Boolean,
    isOptional: Boolean,
    isOverride: Boolean,
    isStatic: Boolean,
    key: PrivateName,
    readonly: Boolean,
    span: Span
  ): typings.swcCore.typesMod.PrivateProperty = {
    val __obj = js.Dynamic.literal(definite = definite.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], isOverride = isOverride.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PrivateProperty")
    __obj.asInstanceOf[typings.swcCore.typesMod.PrivateProperty]
  }
  
  inline def StaticBlock(body: BlockStatement, span: Span): typings.swcCore.typesMod.StaticBlock = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StaticBlock")
    __obj.asInstanceOf[typings.swcCore.typesMod.StaticBlock]
  }
  
  inline def TsIndexSignature(params: js.Array[TsFnParameter], readonly: Boolean, span: Span, static: Boolean): typings.swcCore.typesMod.TsIndexSignature = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsIndexSignature")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsIndexSignature]
  }
}
