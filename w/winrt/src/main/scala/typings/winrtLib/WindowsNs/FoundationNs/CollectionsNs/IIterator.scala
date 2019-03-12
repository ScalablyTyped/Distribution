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
    getMany: () => winrtLib.Anon_Items[T],
    hasCurrent: scala.Boolean,
    moveNext: () => scala.Boolean
  ): IIterator[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = js.Any.fromFunction0(getMany), hasCurrent = hasCurrent, moveNext = js.Any.fromFunction0(moveNext))
  
    __obj.asInstanceOf[IIterator[T]]
  }
}

