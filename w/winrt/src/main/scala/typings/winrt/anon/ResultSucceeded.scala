package typings.winrt.anon

import typings.winrt.Windows.Data.Json.JsonArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultSucceeded extends StObject {
  
  var result: JsonArray
  
  var succeeded: Boolean
}
object ResultSucceeded {
  
  inline def apply(result: JsonArray, succeeded: Boolean): ResultSucceeded = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSucceeded]
  }
  
  extension [Self <: ResultSucceeded](x: Self) {
    
    inline def setResult(value: JsonArray): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
