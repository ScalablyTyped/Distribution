package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.yandexMaps.mod.IEventEmitter because Already inherited
- typings.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @js.native
trait IMapObjectCollection
  extends ICollection
     with IParentOnMap {
  var options: IOptionManager = js.native
}

object IMapObjectCollection {
  @scala.inline
  def apply(
    add: js.Object => IMapObjectCollection,
    events: IEventManager,
    getIterator: () => IIterator,
    getMap: () => Map_,
    options: IOptionManager,
    remove: js.Object => IMapObjectCollection
  ): IMapObjectCollection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), events = events.asInstanceOf[js.Any], getIterator = js.Any.fromFunction0(getIterator), getMap = js.Any.fromFunction0(getMap), options = options.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[IMapObjectCollection]
  }
  @scala.inline
  implicit class IMapObjectCollectionOps[Self <: IMapObjectCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOptions(value: IOptionManager): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

