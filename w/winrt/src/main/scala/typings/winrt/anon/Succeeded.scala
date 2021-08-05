package typings.winrt.anon

import typings.winrt.Windows.Data.Json.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Succeeded extends StObject {
  
  var result: JsonObject
  
  var succeeded: Boolean
}
object Succeeded {
  
  inline def apply(result: JsonObject, succeeded: Boolean): Succeeded = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Succeeded]
  }
  
  extension [Self <: Succeeded](x: Self) {
    
    inline def setResult(value: JsonObject): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
