package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enumerates PlayReady secure stop service requests. */
@js.native
trait PlayReadySecureStopIterable extends js.Object {
  
  /**
    * Returns an iterator that iterates over the items in the PlayReady secure stop collection.
    * @return The PlayReady secure stop iterator.
    */
  def first(): IIterator[IPlayReadySecureStopServiceRequest] = js.native
}
object PlayReadySecureStopIterable {
  
  @scala.inline
  def apply(first: () => IIterator[IPlayReadySecureStopServiceRequest]): PlayReadySecureStopIterable = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first))
    __obj.asInstanceOf[PlayReadySecureStopIterable]
  }
  
  @scala.inline
  implicit class PlayReadySecureStopIterableOps[Self <: PlayReadySecureStopIterable] (val x: Self) extends AnyVal {
    
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
    def setFirst(value: () => IIterator[IPlayReadySecureStopServiceRequest]): Self = this.set("first", js.Any.fromFunction0(value))
  }
}
