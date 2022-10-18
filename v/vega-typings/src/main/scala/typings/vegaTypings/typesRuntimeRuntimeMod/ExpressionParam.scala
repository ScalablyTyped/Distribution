package typings.vegaTypings.typesRuntimeRuntimeMod

import typings.std.Record
import typings.vegaTypings.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionParam
  extends StObject
     with AccessorParameters
     with BuiltinParameter {
  
  /**
    * TODO: add support for AST types
    */
  @JSName("$expr")
  var $expr: Code
  
  @JSName("$fields")
  var $fields: js.UndefOr[js.Array[String]] = js.undefined
  
  @JSName("$params")
  var $params: js.UndefOr[Record[String, OperatorParam]] = js.undefined
}
object ExpressionParam {
  
  inline def apply($expr: Code): ExpressionParam = {
    val __obj = js.Dynamic.literal($expr = $expr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionParam]
  }
  
  extension [Self <: ExpressionParam](x: Self) {
    
    inline def set$expr(value: Code): Self = StObject.set(x, "$expr", value.asInstanceOf[js.Any])
    
    inline def set$fields(value: js.Array[String]): Self = StObject.set(x, "$fields", value.asInstanceOf[js.Any])
    
    inline def set$fieldsUndefined: Self = StObject.set(x, "$fields", js.undefined)
    
    inline def set$fieldsVarargs(value: String*): Self = StObject.set(x, "$fields", js.Array(value*))
    
    inline def set$params(value: Record[String, OperatorParam]): Self = StObject.set(x, "$params", value.asInstanceOf[js.Any])
    
    inline def set$paramsUndefined: Self = StObject.set(x, "$params", js.undefined)
  }
}
