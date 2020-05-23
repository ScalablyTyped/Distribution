package typings.winrt.Windows.Foundation.Collections

import typings.winrt.anon.Items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIterator[T] extends js.Object {
  var current: T
  var hasCurrent: Boolean
  def getMany(): Items[T]
  def moveNext(): Boolean
}

object IIterator {
  @scala.inline
  def apply[T](current: T, getMany: () => Items[T], hasCurrent: Boolean, moveNext: () => Boolean): IIterator[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = js.Any.fromFunction0(getMany), hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[IIterator[T]]
  }
}

