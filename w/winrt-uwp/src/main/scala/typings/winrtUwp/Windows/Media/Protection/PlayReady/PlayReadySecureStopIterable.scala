package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enumerates PlayReady secure stop service requests. */
trait PlayReadySecureStopIterable extends StObject {
  
  /**
    * Returns an iterator that iterates over the items in the PlayReady secure stop collection.
    * @return The PlayReady secure stop iterator.
    */
  def first(): IIterator[IPlayReadySecureStopServiceRequest]
}
object PlayReadySecureStopIterable {
  
  inline def apply(first: () => IIterator[IPlayReadySecureStopServiceRequest]): PlayReadySecureStopIterable = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first))
    __obj.asInstanceOf[PlayReadySecureStopIterable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayReadySecureStopIterable] (val x: Self) extends AnyVal {
    
    inline def setFirst(value: () => IIterator[IPlayReadySecureStopServiceRequest]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
  }
}
