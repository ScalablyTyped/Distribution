package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowFunctionExpression
  extends StObject
     with ExpressionBase
     with Expression {
  
  var async: Boolean
  
  var body: BlockStatement | Expression
  
  var generator: Boolean
  
  var params: js.Array[Pattern]
  
  var returnType: js.UndefOr[TsTypeAnnotation] = js.undefined
  
  var typeParameters: js.UndefOr[TsTypeParameterDeclaration] = js.undefined
  
  @JSName("type")
  var type_ArrowFunctionExpression: typings.swcCore.swcCoreStrings.ArrowFunctionExpression
}
object ArrowFunctionExpression {
  
  inline def apply(
    async: Boolean,
    body: BlockStatement | Expression,
    generator: Boolean,
    params: js.Array[Pattern],
    span: Span
  ): ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[ArrowFunctionExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrowFunctionExpression] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setBody(value: BlockStatement | Expression): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setGenerator(value: Boolean): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[Pattern]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: Pattern*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setReturnType(value: TsTypeAnnotation): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    inline def setType(value: typings.swcCore.swcCoreStrings.ArrowFunctionExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TsTypeParameterDeclaration): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
