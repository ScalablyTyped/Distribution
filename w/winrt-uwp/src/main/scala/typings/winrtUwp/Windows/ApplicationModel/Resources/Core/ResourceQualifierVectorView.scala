package typings.winrtUwp.Windows.ApplicationModel.Resources.Core

import typings.std.Array
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.anon.Index
import typings.winrtUwp.anon.ItemsResourceQualifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An unchangeable view into a vector of ResourceQualifier objects. */
@js.native
trait ResourceQualifierVectorView extends Array[ResourceQualifier] {
  
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
  def getMany(startIndex: Double): ItemsResourceQualifier = js.native
  
  def indexOf(value: ResourceQualifier, extra: js.Any*): Index = js.native
  /* hack */
  @JSName("indexOf")
  def indexOf_Double(searchElement: ResourceQualifier): Double = js.native
  
  /** Gets the number of ResourceQualifier objects in the view. */
  var size: Double = js.native
}
