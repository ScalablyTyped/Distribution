package typings.vegaTypings.runtimeRuntimeMod

import typings.std.Record
import typings.vegaTypings.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.runtimeRuntimeMod.OperatorParam
  - typings.vegaTypings.runtimeRuntimeMod.KeyParam
  - typings.vegaTypings.runtimeRuntimeMod.ExpressionParam
  - typings.vegaTypings.runtimeRuntimeMod.FieldParam
  - typings.vegaTypings.runtimeRuntimeMod.EncodeParam
  - typings.vegaTypings.runtimeRuntimeMod.CompareParam
  - typings.vegaTypings.runtimeRuntimeMod.ContextParam
  - typings.vegaTypings.runtimeRuntimeMod.SubflowParam
*/
trait BuiltinParameter extends StObject
object BuiltinParameter {
  
  inline def CompareParam($compare: OrArray[String], $order: OrArray[Order]): typings.vegaTypings.runtimeRuntimeMod.CompareParam = {
    val __obj = js.Dynamic.literal($compare = $compare.asInstanceOf[js.Any], $order = $order.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.runtimeRuntimeMod.CompareParam]
  }
  
  inline def ContextParam(): typings.vegaTypings.runtimeRuntimeMod.ContextParam = {
    val __obj = js.Dynamic.literal($context = true)
    __obj.asInstanceOf[typings.vegaTypings.runtimeRuntimeMod.ContextParam]
  }
  
  inline def EncodeParam($encode: Record[String, EncodeValue]): typings.vegaTypings.runtimeRuntimeMod.EncodeParam = {
    val __obj = js.Dynamic.literal($encode = $encode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.runtimeRuntimeMod.EncodeParam]
  }
  
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
  
  inline def SubflowParam($subflow: Subflow): typings.vegaTypings.runtimeRuntimeMod.SubflowParam = {
    val __obj = js.Dynamic.literal($subflow = $subflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.runtimeRuntimeMod.SubflowParam]
  }
}
