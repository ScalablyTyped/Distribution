package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.anon.ItemsIPlayReadyDomain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides for iteration of the PlayReadyDomain class. */
trait PlayReadyDomainIterator extends js.Object {
  /** Gets the current item in the PlayReady domain collection. */
  var current: IPlayReadyDomain
  /** Gets a value that indicates whether there is a current item or the iterator is at the end of the PlayReady domain collection. */
  var hasCurrent: Boolean
  /**
    * Retrieves all items in the PlayReady domain collection.
    */
  def getMany(): ItemsIPlayReadyDomain
  /**
    * Advances the enumerator to the next item in the collection.
    * @return true if the iterator refers to a valid item that is in the collection or false if the iterator is at the end of the collection.
    */
  def moveNext(): Boolean
}

object PlayReadyDomainIterator {
  @scala.inline
  def apply(
    current: IPlayReadyDomain,
    getMany: () => ItemsIPlayReadyDomain,
    hasCurrent: Boolean,
    moveNext: () => Boolean
  ): PlayReadyDomainIterator = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = js.Any.fromFunction0(getMany), hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[PlayReadyDomainIterator]
  }
}

