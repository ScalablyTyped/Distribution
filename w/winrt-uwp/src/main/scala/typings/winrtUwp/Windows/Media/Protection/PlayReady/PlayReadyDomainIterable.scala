package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exposes the PlayReady PlayReadyDomain class iterator. */
trait PlayReadyDomainIterable extends StObject {
  
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
  
  @scala.inline
  implicit class PlayReadyDomainIterableMutableBuilder[Self <: PlayReadyDomainIterable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst(value: () => IIterator[IPlayReadyDomain]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
  }
}
