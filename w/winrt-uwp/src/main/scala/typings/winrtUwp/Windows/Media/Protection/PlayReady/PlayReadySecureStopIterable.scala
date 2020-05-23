package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enumerates PlayReady secure stop service requests. */
trait PlayReadySecureStopIterable extends js.Object {
  /**
    * Returns an iterator that iterates over the items in the PlayReady secure stop collection.
    * @return The PlayReady secure stop iterator.
    */
  def first(): IIterator[IPlayReadySecureStopServiceRequest]
}

object PlayReadySecureStopIterable {
  @scala.inline
  def apply(first: () => IIterator[IPlayReadySecureStopServiceRequest]): PlayReadySecureStopIterable = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first))
    __obj.asInstanceOf[PlayReadySecureStopIterable]
  }
}

