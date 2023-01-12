package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsInterfaceDeclaration
  extends StObject
     with Node
     with HasSpan
     with Declaration
     with DefaultDecl {
  
  var body: TsInterfaceBody
  
  var declare: Boolean
  
  var `extends`: js.Array[TsExpressionWithTypeArguments]
  
  var id: Identifier
  
  var typeParams: js.UndefOr[TsTypeParameterDeclaration] = js.undefined
  
  @JSName("type")
  var type_TsInterfaceDeclaration: typings.swcCore.swcCoreStrings.TsInterfaceDeclaration
}
object TsInterfaceDeclaration {
  
  inline def apply(
    body: TsInterfaceBody,
    declare: Boolean,
    `extends`: js.Array[TsExpressionWithTypeArguments],
    id: Identifier,
    span: Span
  ): TsInterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsInterfaceDeclaration")
    __obj.asInstanceOf[TsInterfaceDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsInterfaceDeclaration] (val x: Self) extends AnyVal {
    
    inline def setBody(value: TsInterfaceBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setExtends(value: js.Array[TsExpressionWithTypeArguments]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsVarargs(value: TsExpressionWithTypeArguments*): Self = StObject.set(x, "extends", js.Array(value*))
    
    inline def setId(value: Identifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsInterfaceDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParams(value: TsTypeParameterDeclaration): Self = StObject.set(x, "typeParams", value.asInstanceOf[js.Any])
    
    inline def setTypeParamsUndefined: Self = StObject.set(x, "typeParams", js.undefined)
  }
}
