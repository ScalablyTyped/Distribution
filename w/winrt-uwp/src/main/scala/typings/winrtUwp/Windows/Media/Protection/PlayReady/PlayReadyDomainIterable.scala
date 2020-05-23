package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes the PlayReady PlayReadyDomain class iterator. */
trait PlayReadyDomainIterable extends js.Object {
  /**
    * Returns an iterator that iterates over the items in the PlayReady domain collection.
    * @return The PlayReady domain iterator.
    */
  def first(): IIterator[IPlayReadyDomain]
}

object PlayReadyDomainIterable {
  @scala.inline
  def apply(first: () => IIterator[IPlayReadyDomain]): PlayReadyDomainIterable = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first))
    __obj.asInstanceOf[PlayReadyDomainIterable]
  }
}

