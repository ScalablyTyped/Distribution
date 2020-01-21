package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.AnonItemsReturnValueIPlayReadySecureStopServiceRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides for iteration of the IPlayReadySecureStopServiceRequest interface. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadySecureStopIterator")
@js.native
abstract class PlayReadySecureStopIterator () extends js.Object {
  /** Gets the current item in the PlayReady secure stop collection. */
  var current: IPlayReadySecureStopServiceRequest = js.native
  /** Gets a value that indicates whether there is a current item or the iterator is at the end of the PlayReady secure stop collection. */
  var hasCurrent: Boolean = js.native
  /**
    * Retrieves all items in the PlayReady secure stop collection.
    */
  def getMany(): AnonItemsReturnValueIPlayReadySecureStopServiceRequest = js.native
  /**
    * Advances the enumerator to the next item in the collection.
    * @return true if the iterator refers to a valid item that is in the collection or false if the iterator is at the end of the collection.
    */
  def moveNext(): Boolean = js.native
}

