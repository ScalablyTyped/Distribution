package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICustomizable
  extends StObject
     with IEventEmitter {
  
  var options: IOptionManager
}
object ICustomizable {
  
  inline def apply(events: IEventManager[js.Object], options: IOptionManager): ICustomizable = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomizable]
  }
  
  extension [Self <: ICustomizable](x: Self) {
    
    inline def setOptions(value: IOptionManager): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
