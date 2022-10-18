package typings.vegaTypings.typesRuntimeRuntimeMod

import typings.std.Record
import typings.vegaTypings.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.typesRuntimeRuntimeMod.OperatorParam
  - typings.vegaTypings.typesRuntimeRuntimeMod.KeyParam
  - typings.vegaTypings.typesRuntimeRuntimeMod.ExpressionParam
  - typings.vegaTypings.typesRuntimeRuntimeMod.FieldParam
  - typings.vegaTypings.typesRuntimeRuntimeMod.EncodeParam
  - typings.vegaTypings.typesRuntimeRuntimeMod.CompareParam
  - typings.vegaTypings.typesRuntimeRuntimeMod.ContextParam
  - typings.vegaTypings.typesRuntimeRuntimeMod.SubflowParam
*/
trait BuiltinParameter extends StObject
object BuiltinParameter {
  
  inline def CompareParam($compare: OrArray[String], $order: OrArray[Order]): typings.vegaTypings.typesRuntimeRuntimeMod.CompareParam = {
    val __obj = js.Dynamic.literal($compare = $compare.asInstanceOf[js.Any], $order = $order.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.typesRuntimeRuntimeMod.CompareParam]
  }
  
  inline def ContextParam(): typings.vegaTypings.typesRuntimeRuntimeMod.ContextParam = {
    val __obj = js.Dynamic.literal($context = true)
    __obj.asInstanceOf[typings.vegaTypings.typesRuntimeRuntimeMod.ContextParam]
  }
  
  inline def EncodeParam($encode: Record[String, EncodeValue]): typings.vegaTypings.typesRuntimeRuntimeMod.EncodeParam = {
    val __obj = js.Dynamic.literal($encode = $encode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.typesRuntimeRuntimeMod.EncodeParam]
  }
  
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
  
  inline def SubflowParam($subflow: Subflow): typings.vegaTypings.typesRuntimeRuntimeMod.SubflowParam = {
    val __obj = js.Dynamic.literal($subflow = $subflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.typesRuntimeRuntimeMod.SubflowParam]
  }
}
