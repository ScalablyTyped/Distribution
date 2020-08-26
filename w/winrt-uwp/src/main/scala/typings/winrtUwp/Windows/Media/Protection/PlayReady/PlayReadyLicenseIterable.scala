package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes the PlayReadyLicense class iterator. */
@js.native
trait PlayReadyLicenseIterable extends js.Object {
  /**
    * Returns an iterator that iterates over the items in the PlayReady license collection.
    * @return The PlayReady license iterator.
    */
  def first(): IIterator[IPlayReadyLicense] = js.native
}

object PlayReadyLicenseIterable {
  @scala.inline
  def apply(first: () => IIterator[IPlayReadyLicense]): PlayReadyLicenseIterable = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first))
    __obj.asInstanceOf[PlayReadyLicenseIterable]
  }
  @scala.inline
  implicit class PlayReadyLicenseIterableOps[Self <: PlayReadyLicenseIterable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFirst(value: () => IIterator[IPlayReadyLicense]): Self = this.set("first", js.Any.fromFunction0(value))
  }
  
}

