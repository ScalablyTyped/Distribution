package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.anon.ItemsIPlayReadyDomain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides for iteration of the PlayReadyDomain class. */
@js.native
trait PlayReadyDomainIterator extends StObject {
  
  /** Gets the current item in the PlayReady domain collection. */
  var current: IPlayReadyDomain = js.native
  
  /**
    * Retrieves all items in the PlayReady domain collection.
    */
  def getMany(): ItemsIPlayReadyDomain = js.native
  
  /** Gets a value that indicates whether there is a current item or the iterator is at the end of the PlayReady domain collection. */
  var hasCurrent: Boolean = js.native
  
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
  implicit class PlayReadyDomainIteratorMutableBuilder[Self <: PlayReadyDomainIterator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: IPlayReadyDomain): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMany(value: () => ItemsIPlayReadyDomain): Self = StObject.set(x, "getMany", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasCurrent(value: Boolean): Self = StObject.set(x, "hasCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveNext(value: () => Boolean): Self = StObject.set(x, "moveNext", js.Any.fromFunction0(value))
  }
}
