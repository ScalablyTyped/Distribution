package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes an iterator that supports simple iteration over a collection of a specified type. */
trait IIterable[T] extends js.Object {
  /**
    * Returns an iterator for the items in the collection.
    * @return The iterator.
    */
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

