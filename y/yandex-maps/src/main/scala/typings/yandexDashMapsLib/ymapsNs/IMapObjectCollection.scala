package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- yandexDashMapsLib.ymapsNs.ICustomizable because var conflicts: events. Inlined options */ trait IMapObjectCollection
  extends ICollection
     with IParentOnMap {
  var options: IOptionManager
}

object IMapObjectCollection {
  @scala.inline
  def apply(
    add: js.Function1[js.Object, IMapObjectCollection],
    events: IEventManager,
    getIterator: js.Function0[IIterator],
    getMap: js.Function0[Map],
    options: IOptionManager,
    remove: js.Function1[js.Object, IMapObjectCollection]
  ): IMapObjectCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("getIterator")(getIterator)
    __obj.updateDynamic("getMap")(getMap)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[IMapObjectCollection]
  }
}

