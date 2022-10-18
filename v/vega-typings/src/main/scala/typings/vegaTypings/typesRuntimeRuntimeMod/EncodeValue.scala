package typings.vegaTypings.typesRuntimeRuntimeMod

import typings.vegaTypings.anon.Channels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodeValue extends StObject {
  
  /**
    * The keys of the channels are the same as the $output
    */
  @JSName("$expr")
  var $expr: Channels
  
  @JSName("$fields")
  var $fields: js.Array[String]
  
  @JSName("$output")
  var $output: js.Array[String]
}
object EncodeValue {
  
  inline def apply($expr: Channels, $fields: js.Array[String], $output: js.Array[String]): EncodeValue = {
    val __obj = js.Dynamic.literal($expr = $expr.asInstanceOf[js.Any], $fields = $fields.asInstanceOf[js.Any], $output = $output.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeValue]
  }
  
  extension [Self <: EncodeValue](x: Self) {
    
    inline def set$expr(value: Channels): Self = StObject.set(x, "$expr", value.asInstanceOf[js.Any])
    
    inline def set$fields(value: js.Array[String]): Self = StObject.set(x, "$fields", value.asInstanceOf[js.Any])
    
    inline def set$fieldsVarargs(value: String*): Self = StObject.set(x, "$fields", js.Array(value*))
    
    inline def set$output(value: js.Array[String]): Self = StObject.set(x, "$output", value.asInstanceOf[js.Any])
    
    inline def set$outputVarargs(value: String*): Self = StObject.set(x, "$output", js.Array(value*))
  }
}
