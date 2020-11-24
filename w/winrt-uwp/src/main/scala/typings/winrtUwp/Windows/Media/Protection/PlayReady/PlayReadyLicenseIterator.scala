package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.anon.ItemsIPlayReadyLicense
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides for iteration of the PlayReadyLicense class. */
@js.native
trait PlayReadyLicenseIterator extends js.Object {
  
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
  implicit class PlayReadyLicenseIteratorOps[Self <: PlayReadyLicenseIterator] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: IPlayReadyLicense): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMany(value: () => ItemsIPlayReadyLicense): Self = this.set("getMany", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasCurrent(value: Boolean): Self = this.set("hasCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveNext(value: () => Boolean): Self = this.set("moveNext", js.Any.fromFunction0(value))
  }
}
