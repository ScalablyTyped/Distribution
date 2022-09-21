package typings.webpackDevServer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerConfiguration extends StObject {
  
  var options: js.UndefOr[ServerOptions] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ServerConfiguration {
  
  inline def apply(): ServerConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerConfiguration]
  }
  
  extension [Self <: ServerConfiguration](x: Self) {
    
    inline def setOptions(value: ServerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
