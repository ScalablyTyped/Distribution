package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.anon.ItemsIPlayReadyLicense
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides for iteration of the PlayReadyLicense class. */
@js.native
trait PlayReadyLicenseIterator extends StObject {
  
  /** Gets the current item in the PlayReady license collection. */
  var current: IPlayReadyLicense = js.native
  
  /**
    * Retrieves all items in the PlayReady license collection.
    */
  def getMany(): ItemsIPlayReadyLicense = js.native
  
  /** Gets a value that indicates whether there is a current item or the iterator is at the end of the PlayReady license collection. */
  var hasCurrent: Boolean = js.native
  
  /**
    * Advances the enumerator to the next item in the collection.
    * @return true if the iterator refers to a valid item that is in the collection or false if the iterator is at the end of the collection.
    */
  def moveNext(): Boolean = js.native
}
object PlayReadyLicenseIterator {
  
  @scala.inline
  def apply(
    current: IPlayReadyLicense,
    getMany: () => ItemsIPlayReadyLicense,
    hasCurrent: Boolean,
    moveNext: () => Boolean
  ): PlayReadyLicenseIterator = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = js.Any.fromFunction0(getMany), hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[PlayReadyLicenseIterator]
  }
  
  @scala.inline
  implicit class PlayReadyLicenseIteratorMutableBuilder[Self <: PlayReadyLicenseIterator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: IPlayReadyLicense): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMany(value: () => ItemsIPlayReadyLicense): Self = StObject.set(x, "getMany", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasCurrent(value: Boolean): Self = StObject.set(x, "hasCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveNext(value: () => Boolean): Self = StObject.set(x, "moveNext", js.Any.fromFunction0(value))
  }
}
