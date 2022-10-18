package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadySecureStopServiceRequest
import typings.winrtUwp.anon.ItemsIPlayReadySecureStopServiceRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides for iteration of the IPlayReadySecureStopServiceRequest interface. */
/* note: abstract class */ @JSGlobal("Windows.Media.Protection.PlayReady.PlayReadySecureStopIterator")
@js.native
open class PlayReadySecureStopIterator ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadySecureStopIterator {
  
  /** Gets the current item in the PlayReady secure stop collection. */
  /* CompleteClass */
  var current: IPlayReadySecureStopServiceRequest = js.native
  
  /**
    * Retrieves all items in the PlayReady secure stop collection.
    */
  /* CompleteClass */
  override def getMany(): ItemsIPlayReadySecureStopServiceRequest = js.native
  
  /** Gets a value that indicates whether there is a current item or the iterator is at the end of the PlayReady secure stop collection. */
  /* CompleteClass */
  var hasCurrent: Boolean = js.native
  
  /**
    * Advances the enumerator to the next item in the collection.
    * @return true if the iterator refers to a valid item that is in the collection or false if the iterator is at the end of the collection.
    */
  /* CompleteClass */
  override def moveNext(): Boolean = js.native
}
