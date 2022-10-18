package typings.vegaTypings.typesRuntimeRuntimeMod

import typings.vegaTypings.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.typesRuntimeRuntimeMod.KeyParam
  - typings.vegaTypings.typesRuntimeRuntimeMod.ExpressionParam
  - typings.vegaTypings.typesRuntimeRuntimeMod.FieldParam
  - typings.vegaTypings.typesRuntimeRuntimeMod.OperatorParam
*/
trait AccessorParameters extends StObject
object AccessorParameters {
  
  inline def ExpressionParam($expr: Code): typings.vegaTypings.typesRuntimeRuntimeMod.ExpressionParam = {
    val __obj = js.Dynamic.literal($expr = $expr.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.typesRuntimeRuntimeMod.ExpressionParam]
  }
  
  inline def FieldParam(): typings.vegaTypings.typesRuntimeRuntimeMod.FieldParam = {
    val __obj = js.Dynamic.literal($field = null)
    __obj.asInstanceOf[typings.vegaTypings.typesRuntimeRuntimeMod.FieldParam]
  }
  
  inline def KeyParam($key: js.Array[String]): typings.vegaTypings.typesRuntimeRuntimeMod.KeyParam = {
    val __obj = js.Dynamic.literal($key = $key.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.typesRuntimeRuntimeMod.KeyParam]
  }
  
  inline def OperatorParam($ref: ID): typings.vegaTypings.typesRuntimeRuntimeMod.OperatorParam = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.typesRuntimeRuntimeMod.OperatorParam]
  }
}
