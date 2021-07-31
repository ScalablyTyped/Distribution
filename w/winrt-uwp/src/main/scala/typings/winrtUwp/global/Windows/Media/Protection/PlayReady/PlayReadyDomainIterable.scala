package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadyDomain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exposes the PlayReady PlayReadyDomain class iterator. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyDomainIterable")
@js.native
class PlayReadyDomainIterable protected ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyDomainIterable {
  /**
    * Initializes a new instance of the PlayReadyDomainIterable class using the domain account identifier.
    * @param domainAccountId The domain account identifier.
    */
  def this(domainAccountId: String) = this()
  
  /**
    * Returns an iterator that iterates over the items in the PlayReady domain collection.
    * @return The PlayReady domain iterator.
    */
  /* CompleteClass */
  override def first(): IIterator[IPlayReadyDomain] = js.native
}
