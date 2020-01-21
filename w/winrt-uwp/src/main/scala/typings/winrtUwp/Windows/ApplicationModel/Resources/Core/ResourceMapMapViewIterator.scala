package typings.winrtUwp.Windows.ApplicationModel.Resources.Core

import typings.winrtUwp.AnonItemsReturnValueAny
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports iteration over a ResourceMapMapView object. */
@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapMapViewIterator")
@js.native
abstract class ResourceMapMapViewIterator () extends js.Object {
  /** Gets the current item in the ResourceMapMapView . */
  var current: IKeyValuePair[String, ResourceMap] = js.native
  /** Gets a value that indicates whether there is a current item, or whether the iterator is at the end of the ResourceMapMapView . */
  var hasCurrent: Boolean = js.native
  /**
    * Returns all the items in the ResourceMapMapView .
    */
  def getMany(): AnonItemsReturnValueAny = js.native
  /**
    * Moves the iterator forward to the next item and returns HasCurrent .
    * @return TRUE if the iterator refers to a valid item that is in the map view, and otherwise FALSE.
    */
  def moveNext(): Boolean = js.native
}

