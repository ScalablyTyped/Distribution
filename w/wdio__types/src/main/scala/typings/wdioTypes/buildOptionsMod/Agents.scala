package typings.wdioTypes.buildOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Agents extends StObject {
  
  var http: js.UndefOr[Any] = js.undefined
  
  var https: js.UndefOr[Any] = js.undefined
}
object Agents {
  
  inline def apply(): Agents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Agents]
  }
  
  extension [Self <: Agents](x: Self) {
    
    inline def setHttp(value: Any): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    inline def setHttps(value: Any): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
  }
}
