package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIterator extends js.Object {
  def getNext(): js.Object | scala.Null
}

object IIterator {
  @scala.inline
  def apply(getNext: js.Function0[js.Object | scala.Null]): IIterator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getNext")(getNext)
    __obj.asInstanceOf[IIterator]
  }
}

