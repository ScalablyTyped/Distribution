package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.anon.ItemsIPlayReadyDomain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides for iteration of the PlayReadyDomain class. */
@js.native
trait PlayReadyDomainIterator extends js.Object {
  /** Gets the current item in the PlayReady domain collection. */
  var current: IPlayReadyDomain = js.native
  /** Gets a value that indicates whether there is a current item or the iterator is at the end of the PlayReady domain collection. */
  var hasCurrent: Boolean = js.native
  /**
    * Retrieves all items in the PlayReady domain collection.
    */
  def getMany(): ItemsIPlayReadyDomain = js.native
  /**
    * Advances the enumerator to the next item in the collection.
    * @return true if the iterator refers to a valid item that is in the collection or false if the iterator is at the end of the collection.
    */
  def moveNext(): Boolean = js.native
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
  @scala.inline
  implicit class PlayReadyDomainIteratorOps[Self <: PlayReadyDomainIterator] (val x: Self) extends AnyVal {
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
    def setCurrent(value: IPlayReadyDomain): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetMany(value: () => ItemsIPlayReadyDomain): Self = this.set("getMany", js.Any.fromFunction0(value))
    @scala.inline
    def setHasCurrent(value: Boolean): Self = this.set("hasCurrent", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoveNext(value: () => Boolean): Self = this.set("moveNext", js.Any.fromFunction0(value))
  }
  
}

