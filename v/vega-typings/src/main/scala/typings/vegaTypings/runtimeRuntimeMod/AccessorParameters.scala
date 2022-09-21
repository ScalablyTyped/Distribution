package typings.vegaTypings.runtimeRuntimeMod

import typings.vegaTypings.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.runtimeRuntimeMod.KeyParam
  - typings.vegaTypings.runtimeRuntimeMod.ExpressionParam
  - typings.vegaTypings.runtimeRuntimeMod.FieldParam
  - typings.vegaTypings.runtimeRuntimeMod.OperatorParam
*/
trait AccessorParameters extends StObject
object AccessorParameters {
  
  inline def ExpressionParam($expr: Code): typings.vegaTypings.runtimeRuntimeMod.ExpressionParam = {
    val __obj = js.Dynamic.literal($expr = $expr.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.runtimeRuntimeMod.ExpressionParam]
  }
  
  inline def FieldParam(): typings.vegaTypings.runtimeRuntimeMod.FieldParam = {
    val __obj = js.Dynamic.literal($field = null)
    __obj.asInstanceOf[typings.vegaTypings.runtimeRuntimeMod.FieldParam]
  }
  
  inline def KeyParam($key: js.Array[String]): typings.vegaTypings.runtimeRuntimeMod.KeyParam = {
    val __obj = js.Dynamic.literal($key = $key.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.runtimeRuntimeMod.KeyParam]
  }
  
  inline def OperatorParam($ref: ID): typings.vegaTypings.runtimeRuntimeMod.OperatorParam = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.runtimeRuntimeMod.OperatorParam]
  }
}
