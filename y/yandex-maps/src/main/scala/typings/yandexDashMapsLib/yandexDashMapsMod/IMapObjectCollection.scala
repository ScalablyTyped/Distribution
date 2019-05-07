package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- yandexDashMapsLib.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ trait IMapObjectCollection
  extends ICollection
     with IParentOnMap {
  var options: IOptionManager
}

object IMapObjectCollection {
  @scala.inline
  def apply(
    add: js.Object => IMapObjectCollection,
    events: IEventManager,
    getIterator: () => IIterator,
    getMap: () => Map,
    options: IOptionManager,
    remove: js.Object => IMapObjectCollection
  ): IMapObjectCollection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), events = events, getIterator = js.Any.fromFunction0(getIterator), getMap = js.Any.fromFunction0(getMap), options = options, remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[IMapObjectCollection]
  }
}

