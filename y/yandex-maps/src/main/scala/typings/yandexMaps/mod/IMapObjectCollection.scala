package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.yandexMaps.mod.IEventEmitter because Already inherited
- typings.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ trait IMapObjectCollection
  extends StObject
     with ICollection
     with IParentOnMap {
  
  var options: IOptionManager
}
object IMapObjectCollection {
  
  inline def apply(
    add: js.Object => IMapObjectCollection,
    events: IEventManager[js.Object],
    getIterator: () => IIterator,
    getMap: () => Map_,
    options: IOptionManager,
    remove: js.Object => IMapObjectCollection
  ): IMapObjectCollection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), events = events.asInstanceOf[js.Any], getIterator = js.Any.fromFunction0(getIterator), getMap = js.Any.fromFunction0(getMap), options = options.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[IMapObjectCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMapObjectCollection] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: IOptionManager): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
