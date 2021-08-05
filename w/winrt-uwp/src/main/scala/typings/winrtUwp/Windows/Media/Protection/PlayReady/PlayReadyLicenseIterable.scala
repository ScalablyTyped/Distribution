package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exposes the PlayReadyLicense class iterator. */
trait PlayReadyLicenseIterable extends StObject {
  
  /**
    * Returns an iterator that iterates over the items in the PlayReady license collection.
    * @return The PlayReady license iterator.
    */
  def first(): IIterator[IPlayReadyLicense]
}
object PlayReadyLicenseIterable {
  
  inline def apply(first: () => IIterator[IPlayReadyLicense]): PlayReadyLicenseIterable = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first))
    __obj.asInstanceOf[PlayReadyLicenseIterable]
  }
  
  extension [Self <: PlayReadyLicenseIterable](x: Self) {
    
    inline def setFirst(value: () => IIterator[IPlayReadyLicense]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
  }
}
