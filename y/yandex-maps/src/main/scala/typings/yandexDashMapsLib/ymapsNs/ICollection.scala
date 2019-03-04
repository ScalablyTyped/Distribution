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
    add: js.Function1[js.Object, ICollection],
    events: IEventManager,
    getIterator: js.Function0[IIterator],
    remove: js.Function1[js.Object, ICollection]
  ): ICollection = {
    val __obj = js.Dynamic.literal(add = add, events = events, getIterator = getIterator, remove = remove)
  
    __obj.asInstanceOf[ICollection]
  }
}

