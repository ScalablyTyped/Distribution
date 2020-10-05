package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICollection extends IEventEmitter {
  def add(`object`: js.Object): this.type = js.native
  def getIterator(): IIterator = js.native
  def remove(`object`: js.Object): this.type = js.native
}

object ICollection {
  @scala.inline
  def apply(
    add: js.Object => ICollection,
    events: IEventManager,
    getIterator: () => IIterator,
    remove: js.Object => ICollection
  ): ICollection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), events = events.asInstanceOf[js.Any], getIterator = js.Any.fromFunction0(getIterator), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[ICollection]
  }
  @scala.inline
  implicit class ICollectionOps[Self <: ICollection] (val x: Self) extends AnyVal {
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
    def setAdd(value: js.Object => ICollection): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setGetIterator(value: () => IIterator): Self = this.set("getIterator", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: js.Object => ICollection): Self = this.set("remove", js.Any.fromFunction1(value))
  }
  
}

