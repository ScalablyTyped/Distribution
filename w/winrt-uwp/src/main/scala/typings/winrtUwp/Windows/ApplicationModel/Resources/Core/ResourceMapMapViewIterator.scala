package typings.winrtUwp.Windows.ApplicationModel.Resources.Core

import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.anon.ItemsIKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports iteration over a ResourceMapMapView object. */
trait ResourceMapMapViewIterator extends js.Object {
  /** Gets the current item in the ResourceMapMapView . */
  var current: IKeyValuePair[String, ResourceMap]
  /** Gets a value that indicates whether there is a current item, or whether the iterator is at the end of the ResourceMapMapView . */
  var hasCurrent: Boolean
  /**
    * Returns all the items in the ResourceMapMapView .
    */
  def getMany(): ItemsIKeyValuePair
  /**
    * Moves the iterator forward to the next item and returns HasCurrent .
    * @return TRUE if the iterator refers to a valid item that is in the map view, and otherwise FALSE.
    */
  def moveNext(): Boolean
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
}

