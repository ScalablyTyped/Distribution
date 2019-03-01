package typings
package winrtLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIterator[T] extends js.Object {
  var current: T
  var hasCurrent: scala.Boolean
  def getMany(): winrtLib.Anon_Items[T]
  def moveNext(): scala.Boolean
}

object IIterator {
  @scala.inline
  def apply[T](
    current: T,
    getMany: js.Function0[winrtLib.Anon_Items[T]],
    hasCurrent: scala.Boolean,
    moveNext: js.Function0[scala.Boolean]
  ): IIterator[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    __obj.updateDynamic("getMany")(getMany)
    __obj.updateDynamic("hasCurrent")(hasCurrent)
    __obj.updateDynamic("moveNext")(moveNext)
    __obj.asInstanceOf[IIterator[T]]
  }
}

