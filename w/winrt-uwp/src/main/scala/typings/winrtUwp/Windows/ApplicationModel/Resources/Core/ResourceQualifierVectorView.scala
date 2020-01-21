package typings.winrtUwp.Windows.ApplicationModel.Resources.Core

import typings.std.Array
import typings.winrtUwp.AnonIndex
import typings.winrtUwp.AnonItemsReturnValueNumberResourceQualifier
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An unchangeable view into a vector of ResourceQualifier objects. */
@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierVectorView")
@js.native
abstract class ResourceQualifierVectorView () extends Array[ResourceQualifier] {
  /** Gets the number of ResourceQualifier objects in the view. */
  var size: Double = js.native
  /**
    * Returns an iterator to enumerate the items in the view.
    * @return The iterator. The current position of the iterator is index 0, or the end of the view if the view is empty.
    */
  def first(): IIterator[ResourceQualifier] = js.native
  /**
    * Returns the ResourceQualifier at the specified index in the view.
    * @param index The zero-based index of the ResourceQualifier in the view to return.
    * @return The ResourceQualifier at the specified index.
    */
  def getAt(index: Double): ResourceQualifier = js.native
  /**
    * Returns the ResourceQualifier objects that start at the specified index in the view.
    * @param startIndex The zero-based index of the start of the objects in the view to return.
    */
  def getMany(startIndex: Double): AnonItemsReturnValueNumberResourceQualifier = js.native
  def indexOf(value: ResourceQualifier, extra: js.Any*): AnonIndex = js.native
  /* hack */
  @JSName("indexOf")
  def indexOf_Double(searchElement: ResourceQualifier): Double = js.native
}

