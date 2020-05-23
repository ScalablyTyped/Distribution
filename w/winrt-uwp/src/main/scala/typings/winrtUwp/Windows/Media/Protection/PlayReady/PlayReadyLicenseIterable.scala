package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes the PlayReadyLicense class iterator. */
trait PlayReadyLicenseIterable extends js.Object {
  /**
    * Returns an iterator that iterates over the items in the PlayReady license collection.
    * @return The PlayReady license iterator.
    */
  def first(): IIterator[IPlayReadyLicense]
}

object PlayReadyLicenseIterable {
  @scala.inline
  def apply(first: () => IIterator[IPlayReadyLicense]): PlayReadyLicenseIterable = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first))
    __obj.asInstanceOf[PlayReadyLicenseIterable]
  }
}

