package typings.vegaTypings.runtimeRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperatorParam
  extends StObject
     with AccessorParameters
     with BuiltinParameter {
  
  @JSName("$ref")
  var $ref: ID
}
object OperatorParam {
  
  inline def apply($ref: ID): OperatorParam = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperatorParam]
  }
  
  extension [Self <: OperatorParam](x: Self) {
    
    inline def set$ref(value: ID): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
  }
}
