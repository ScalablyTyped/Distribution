package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectWatchOptionItem
  extends StObject
     with WatchOptions[Boolean] {
  
  var handler: (WatchCallback[Any, Any]) | String
}
object ObjectWatchOptionItem {
  
  inline def apply(handler: (WatchCallback[Any, Any]) | String): ObjectWatchOptionItem = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectWatchOptionItem]
  }
  
  extension [Self <: ObjectWatchOptionItem](x: Self) {
    
    inline def setHandler(value: (WatchCallback[Any, Any]) | String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerFunction3(value: (Any, Any, /* onCleanup */ OnCleanup) => Any): Self = StObject.set(x, "handler", js.Any.fromFunction3(value))
  }
}
