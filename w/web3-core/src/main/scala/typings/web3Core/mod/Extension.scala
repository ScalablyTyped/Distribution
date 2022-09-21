package typings.web3Core.mod

import typings.web3CoreMethod.mod.Method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extension extends StObject {
  
  var methods: js.Array[Method]
  
  var property: js.UndefOr[String] = js.undefined
}
object Extension {
  
  inline def apply(methods: js.Array[Method]): Extension = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  
  extension [Self <: Extension](x: Self) {
    
    inline def setMethods(value: js.Array[Method]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsVarargs(value: Method*): Self = StObject.set(x, "methods", js.Array(value*))
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
  }
}
