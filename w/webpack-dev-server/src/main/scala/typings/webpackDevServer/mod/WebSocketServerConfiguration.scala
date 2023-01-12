package typings.webpackDevServer.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSocketServerConfiguration extends StObject {
  
  var options: js.UndefOr[Record[String, Any]] = js.undefined
  
  var `type`: js.UndefOr[String | js.Function] = js.undefined
}
object WebSocketServerConfiguration {
  
  inline def apply(): WebSocketServerConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebSocketServerConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebSocketServerConfiguration] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: Record[String, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setType(value: String | js.Function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
