package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exposes the PlayReady PlayReadyDomain class iterator. */
@js.native
trait PlayReadyDomainIterable extends js.Object {
  
  /**
    * Returns an iterator that iterates over the items in the PlayReady domain collection.
    * @return The PlayReady domain iterator.
    */
  def first(): IIterator[IPlayReadyDomain] = js.native
}
object PlayReadyDomainIterable {
  
  @scala.inline
  def apply(first: () => IIterator[IPlayReadyDomain]): PlayReadyDomainIterable = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first))
    __obj.asInstanceOf[PlayReadyDomainIterable]
  }
  
  @scala.inline
  implicit class PlayReadyDomainIterableOps[Self <: PlayReadyDomainIterable] (val x: Self) extends AnyVal {
    
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
    def setFirst(value: () => IIterator[IPlayReadyDomain]): Self = this.set("first", js.Any.fromFunction0(value))
  }
}
