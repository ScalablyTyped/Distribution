package typings.waterline.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends StObject {
  
  var adapters: StringDictionary[Adapter] = js.native
  
  var connections: StringDictionary[Connection] = js.native
}
object Config {
  
  @scala.inline
  def apply(adapters: StringDictionary[Adapter], connections: StringDictionary[Connection]): Config = {
    val __obj = js.Dynamic.literal(adapters = adapters.asInstanceOf[js.Any], connections = connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdapters(value: StringDictionary[Adapter]): Self = StObject.set(x, "adapters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnections(value: StringDictionary[Connection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
  }
}
