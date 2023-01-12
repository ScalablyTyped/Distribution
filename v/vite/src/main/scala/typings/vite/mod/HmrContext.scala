package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HmrContext extends StObject {
  
  var file: String
  
  var modules: js.Array[ModuleNode]
  
  def read(): String | js.Promise[String]
  
  var server: ViteDevServer
  
  var timestamp: Double
}
object HmrContext {
  
  inline def apply(
    file: String,
    modules: js.Array[ModuleNode],
    read: () => String | js.Promise[String],
    server: ViteDevServer,
    timestamp: Double
  ): HmrContext = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], read = js.Any.fromFunction0(read), server = server.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[HmrContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HmrContext] (val x: Self) extends AnyVal {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setModules(value: js.Array[ModuleNode]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesVarargs(value: ModuleNode*): Self = StObject.set(x, "modules", js.Array(value*))
    
    inline def setRead(value: () => String | js.Promise[String]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    
    inline def setServer(value: ViteDevServer): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
