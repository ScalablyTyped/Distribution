package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fn
  extends StObject
     with HasSpan
     with HasDecorator {
  
  var async: Boolean
  
  var body: js.UndefOr[BlockStatement] = js.undefined
  
  var generator: Boolean
  
  var params: js.Array[Param]
  
  var returnType: js.UndefOr[TsTypeAnnotation] = js.undefined
  
  var typeParameters: js.UndefOr[TsTypeParameterDeclaration] = js.undefined
}
object Fn {
  
  inline def apply(async: Boolean, generator: Boolean, params: js.Array[Param], span: Span): Fn = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fn] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setBody(value: BlockStatement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setGenerator(value: Boolean): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[Param]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: Param*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setReturnType(value: TsTypeAnnotation): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    inline def setTypeParameters(value: TsTypeParameterDeclaration): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
