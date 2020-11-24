package typings.winrtUwp.Windows.ApplicationModel.Resources.Core

import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.anon.ItemsIKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Supports iteration over a ResourceMapMapView object. */
@js.native
trait ResourceMapMapViewIterator extends js.Object {
  
  /** Gets the current item in the ResourceMapMapView . */
  var current: IKeyValuePair[String, ResourceMap] = js.native
  
  /**
    * Returns all the items in the ResourceMapMapView .
    */
  def getMany(): ItemsIKeyValuePair = js.native
  
  /** Gets a value that indicates whether there is a current item, or whether the iterator is at the end of the ResourceMapMapView . */
  var hasCurrent: Boolean = js.native
  
  /**
    * Moves the iterator forward to the next item and returns HasCurrent .
    * @return TRUE if the iterator refers to a valid item that is in the map view, and otherwise FALSE.
    */
  def moveNext(): Boolean = js.native
}
object ResourceMapMapViewIterator {
  
  @scala.inline
  def apply(
    current: IKeyValuePair[String, ResourceMap],
    getMany: () => ItemsIKeyValuePair,
    hasCurrent: Boolean,
    moveNext: () => Boolean
  ): ResourceMapMapViewIterator = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = js.Any.fromFunction0(getMany), hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[ResourceMapMapViewIterator]
  }
  
  @scala.inline
  implicit class ResourceMapMapViewIteratorOps[Self <: ResourceMapMapViewIterator] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: IKeyValuePair[String, ResourceMap]): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMany(value: () => ItemsIKeyValuePair): Self = this.set("getMany", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasCurrent(value: Boolean): Self = this.set("hasCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveNext(value: () => Boolean): Self = this.set("moveNext", js.Any.fromFunction0(value))
  }
}
