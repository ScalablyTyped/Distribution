package typings.vegaTypings.runtimeRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyParam
  extends StObject
     with AccessorParameters
     with BuiltinParameter {
  
  @JSName("$flat")
  var $flat: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$key")
  var $key: js.Array[String]
}
object KeyParam {
  
  inline def apply($key: js.Array[String]): KeyParam = {
    val __obj = js.Dynamic.literal($key = $key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyParam]
  }
  
  extension [Self <: KeyParam](x: Self) {
    
    inline def set$flat(value: Boolean): Self = StObject.set(x, "$flat", value.asInstanceOf[js.Any])
    
    inline def set$flatUndefined: Self = StObject.set(x, "$flat", js.undefined)
    
    inline def set$key(value: js.Array[String]): Self = StObject.set(x, "$key", value.asInstanceOf[js.Any])
    
    inline def set$keyVarargs(value: String*): Self = StObject.set(x, "$key", js.Array(value*))
  }
}
