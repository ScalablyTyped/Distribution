package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollection extends IEventEmitter {
  def add(`object`: js.Object): this.type
  def getIterator(): IIterator
  def remove(`object`: js.Object): this.type
}

object ICollection {
  @scala.inline
  def apply(
    add: js.Object => ICollection,
    events: IEventManager,
    getIterator: () => IIterator,
    remove: js.Object => ICollection
  ): ICollection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), events = events, getIterator = js.Any.fromFunction0(getIterator), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[ICollection]
  }
}

