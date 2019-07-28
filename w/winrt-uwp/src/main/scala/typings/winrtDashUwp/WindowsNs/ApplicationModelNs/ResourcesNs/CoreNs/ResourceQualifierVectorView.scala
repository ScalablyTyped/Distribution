package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import typings.std.Array
import typings.winrtDashUwp.Anon_Index
import typings.winrtDashUwp.Anon_ItemsReturnValueNumberResourceQualifier
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IIterator
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
  def getMany(startIndex: Double): Anon_ItemsReturnValueNumberResourceQualifier = js.native
  def indexOf(value: ResourceQualifier, extra: js.Any*): Anon_Index = js.native
  /**
    * Returns the index of a specified ResourceQualifier in the view.
    * @param value The ResourceQualifier to find in the set.
    */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: ResourceQualifier): Anon_Index = js.native
}

