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
  def apply[T](first: js.Function0[IIterator[T]]): IIterable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("first")(first)
    __obj.asInstanceOf[IIterable[T]]
  }
}

