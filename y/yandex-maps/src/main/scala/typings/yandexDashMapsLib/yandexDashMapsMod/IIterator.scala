package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIterator extends js.Object {
  def getNext(): js.Object | scala.Null
}

object IIterator {
  @scala.inline
  def apply(getNext: () => js.Object | scala.Null): IIterator = {
    val __obj = js.Dynamic.literal(getNext = js.Any.fromFunction0(getNext))
  
    __obj.asInstanceOf[IIterator]
  }
}

