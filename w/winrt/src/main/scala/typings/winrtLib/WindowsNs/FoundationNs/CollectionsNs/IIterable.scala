package typings
package winrtLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIterable[T] extends js.Object {
  def first(): IIterator[T]
}

object IIterable {
  @scala.inline
  def apply[T](first: () => IIterator[T]): IIterable[T] = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first))
  
    __obj.asInstanceOf[IIterable[T]]
  }
}

