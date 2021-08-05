package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.anon.ItemsIPlayReadySecureStopServiceRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides for iteration of the IPlayReadySecureStopServiceRequest interface. */
trait PlayReadySecureStopIterator extends StObject {
  
  /** Gets the current item in the PlayReady secure stop collection. */
  var current: IPlayReadySecureStopServiceRequest
  
  /**
    * Retrieves all items in the PlayReady secure stop collection.
    */
  def getMany(): ItemsIPlayReadySecureStopServiceRequest
  
  /** Gets a value that indicates whether there is a current item or the iterator is at the end of the PlayReady secure stop collection. */
  var hasCurrent: Boolean
  
  /**
    * Advances the enumerator to the next item in the collection.
    * @return true if the iterator refers to a valid item that is in the collection or false if the iterator is at the end of the collection.
    */
  def moveNext(): Boolean
}
object PlayReadySecureStopIterator {
  
  inline def apply(
    current: IPlayReadySecureStopServiceRequest,
    getMany: () => ItemsIPlayReadySecureStopServiceRequest,
    hasCurrent: Boolean,
    moveNext: () => Boolean
  ): PlayReadySecureStopIterator = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = js.Any.fromFunction0(getMany), hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[PlayReadySecureStopIterator]
  }
  
  extension [Self <: PlayReadySecureStopIterator](x: Self) {
    
    inline def setCurrent(value: IPlayReadySecureStopServiceRequest): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setGetMany(value: () => ItemsIPlayReadySecureStopServiceRequest): Self = StObject.set(x, "getMany", js.Any.fromFunction0(value))
    
    inline def setHasCurrent(value: Boolean): Self = StObject.set(x, "hasCurrent", value.asInstanceOf[js.Any])
    
    inline def setMoveNext(value: () => Boolean): Self = StObject.set(x, "moveNext", js.Any.fromFunction0(value))
  }
}
