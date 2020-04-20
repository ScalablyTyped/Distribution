package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIterator extends js.Object {
  def getNext(): js.Object | Null
}

object IIterator {
  @scala.inline
  def apply(getNext: () => js.Object | Null): IIterator = {
    val __obj = js.Dynamic.literal(getNext = js.Any.fromFunction0(getNext))
    __obj.asInstanceOf[IIterator]
  }
}

