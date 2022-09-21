package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadySecureStopServiceRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enumerates PlayReady secure stop service requests. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadySecureStopIterable")
@js.native
open class PlayReadySecureStopIterable protected ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadySecureStopIterable {
  /**
    * Initializes a new instance of the PlayReadySecureStopIterable class.
    * @param publisherCertBytes The raw binary body of the publisher certificate.
    */
  def this(publisherCertBytes: js.Array[Double]) = this()
  
  /**
    * Returns an iterator that iterates over the items in the PlayReady secure stop collection.
    * @return The PlayReady secure stop iterator.
    */
  /* CompleteClass */
  override def first(): IIterator[IPlayReadySecureStopServiceRequest] = js.native
}
