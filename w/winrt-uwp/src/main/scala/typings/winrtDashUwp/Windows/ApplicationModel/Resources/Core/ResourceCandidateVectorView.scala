package typings.winrtDashUwp.Windows.ApplicationModel.Resources.Core

import typings.std.Array
import typings.winrtDashUwp.Anon_Index
import typings.winrtDashUwp.Anon_ItemsReturnValueNumberResourceCandidate
import typings.winrtDashUwp.Windows.Foundation.Collections.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of ResourceCandidate objects. */
@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceCandidateVectorView")
@js.native
abstract class ResourceCandidateVectorView () extends Array[ResourceCandidate] {
  /** Gets the number of ResourceCandidate objects in the set. */
  var size: Double = js.native
  /**
    * Returns an iterator to enumerate the items in the set of ResourceCandidate objects.
    * @return The iterator. The current position of the iterator is index 0, or the end of the set if the set is empty.
    */
  def first(): IIterator[ResourceCandidate] = js.native
  /**
    * Returns the ResourceCandidate at the specified index in the set.
    * @param index The zero-based index of the ResourceCandidate in the set to return.
    * @return The ResourceCandidate at the specified index.
    */
  def getAt(index: Double): ResourceCandidate = js.native
  /**
    * Returns the ResourceCandidate objects that start at the specified index in the set.
    * @param startIndex The zero-based index of the start of the ResourceCandidate objects in the set to return.
    */
  def getMany(startIndex: Double): Anon_ItemsReturnValueNumberResourceCandidate = js.native
  def indexOf(value: ResourceCandidate, extra: js.Any*): Anon_Index = js.native
  /**
    * Returns the index of a specified ResourceCandidate in the set.
    * @param value The ResourceCandidate to find in the set.
    */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: ResourceCandidate): Anon_Index = js.native
}

