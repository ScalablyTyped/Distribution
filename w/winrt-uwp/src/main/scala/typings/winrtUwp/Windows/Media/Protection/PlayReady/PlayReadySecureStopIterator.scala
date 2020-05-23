package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.anon.ItemsIPlayReadySecureStopServiceRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides for iteration of the IPlayReadySecureStopServiceRequest interface. */
trait PlayReadySecureStopIterator extends js.Object {
  /** Gets the current item in the PlayReady secure stop collection. */
  var current: IPlayReadySecureStopServiceRequest
  /** Gets a value that indicates whether there is a current item or the iterator is at the end of the PlayReady secure stop collection. */
  var hasCurrent: Boolean
  /**
    * Retrieves all items in the PlayReady secure stop collection.
    */
  def getMany(): ItemsIPlayReadySecureStopServiceRequest
  /**
    * Advances the enumerator to the next item in the collection.
    * @return true if the iterator refers to a valid item that is in the collection or false if the iterator is at the end of the collection.
    */
  def moveNext(): Boolean
}

object PlayReadySecureStopIterator {
  @scala.inline
  def apply(
    current: IPlayReadySecureStopServiceRequest,
    getMany: () => ItemsIPlayReadySecureStopServiceRequest,
    hasCurrent: Boolean,
    moveNext: () => Boolean
  ): PlayReadySecureStopIterator = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = js.Any.fromFunction0(getMany), hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[PlayReadySecureStopIterator]
  }
}

