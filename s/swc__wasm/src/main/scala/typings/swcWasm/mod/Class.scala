package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Class
  extends StObject
     with HasSpan
     with HasDecorator {
  
  var body: js.Array[ClassMember]
  
  var implements: js.Array[TsExpressionWithTypeArguments]
  
  var isAbstract: Boolean
  
  var superClass: js.UndefOr[Expression] = js.undefined
  
  var superTypeParams: js.UndefOr[TsTypeParameterInstantiation] = js.undefined
  
  var typeParams: js.UndefOr[TsTypeParameterDeclaration] = js.undefined
}
object Class {
  
  inline def apply(
    body: js.Array[ClassMember],
    implements: js.Array[TsExpressionWithTypeArguments],
    isAbstract: Boolean,
    span: Span
  ): Class = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any], isAbstract = isAbstract.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Class] (val x: Self) extends AnyVal {
    
    inline def setBody(value: js.Array[ClassMember]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: ClassMember*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setImplements(value: js.Array[TsExpressionWithTypeArguments]): Self = StObject.set(x, "implements", value.asInstanceOf[js.Any])
    
    inline def setImplementsVarargs(value: TsExpressionWithTypeArguments*): Self = StObject.set(x, "implements", js.Array(value*))
    
    inline def setIsAbstract(value: Boolean): Self = StObject.set(x, "isAbstract", value.asInstanceOf[js.Any])
    
    inline def setSuperClass(value: Expression): Self = StObject.set(x, "superClass", value.asInstanceOf[js.Any])
    
    inline def setSuperClassUndefined: Self = StObject.set(x, "superClass", js.undefined)
    
    inline def setSuperTypeParams(value: TsTypeParameterInstantiation): Self = StObject.set(x, "superTypeParams", value.asInstanceOf[js.Any])
    
    inline def setSuperTypeParamsUndefined: Self = StObject.set(x, "superTypeParams", js.undefined)
    
    inline def setTypeParams(value: TsTypeParameterDeclaration): Self = StObject.set(x, "typeParams", value.asInstanceOf[js.Any])
    
    inline def setTypeParamsUndefined: Self = StObject.set(x, "typeParams", js.undefined)
  }
}
