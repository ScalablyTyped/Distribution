package typings.waterline.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var adapters: StringDictionary[Adapter]
  
  var connections: StringDictionary[Connection]
}
object Config {
  
  inline def apply(adapters: StringDictionary[Adapter], connections: StringDictionary[Connection]): Config = {
    val __obj = js.Dynamic.literal(adapters = adapters.asInstanceOf[js.Any], connections = connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setAdapters(value: StringDictionary[Adapter]): Self = StObject.set(x, "adapters", value.asInstanceOf[js.Any])
    
    inline def setConnections(value: StringDictionary[Connection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
  }
}
