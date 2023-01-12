package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsTypeAliasDeclaration
  extends StObject
     with Node
     with HasSpan
     with Declaration {
  
  var declare: Boolean
  
  var id: Identifier
  
  var typeAnnotation: TsType
  
  var typeParams: js.UndefOr[TsTypeParameterDeclaration] = js.undefined
  
  @JSName("type")
  var type_TsTypeAliasDeclaration: typings.swcWasm.swcWasmStrings.TsTypeAliasDeclaration
}
object TsTypeAliasDeclaration {
  
  inline def apply(declare: Boolean, id: Identifier, span: Span, typeAnnotation: TsType): TsTypeAliasDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeAliasDeclaration")
    __obj.asInstanceOf[TsTypeAliasDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsTypeAliasDeclaration] (val x: Self) extends AnyVal {
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setId(value: Identifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsTypeAliasDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TsType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeParams(value: TsTypeParameterDeclaration): Self = StObject.set(x, "typeParams", value.asInstanceOf[js.Any])
    
    inline def setTypeParamsUndefined: Self = StObject.set(x, "typeParams", js.undefined)
  }
}
