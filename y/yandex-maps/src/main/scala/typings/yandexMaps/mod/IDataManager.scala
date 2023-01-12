package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataManager
  extends StObject
     with IEventEmitter {
  
  def get(path: String, defaultValue: js.Object): js.Object
}
object IDataManager {
  
  inline def apply(events: IEventManager[js.Object], get: (String, js.Object) => js.Object): IDataManager = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[IDataManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDataManager] (val x: Self) extends AnyVal {
    
    inline def setGet(value: (String, js.Object) => js.Object): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
  }
}
