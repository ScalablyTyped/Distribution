package typings.winrtUwp.Windows.Storage.Search

import typings.std.Array
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.anon.Index
import typings.winrtUwp.anon.ItemsSortEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the sorting criteria of the query results as a collection of SortEntry objects. */
@js.native
trait SortEntryVector
  extends StObject
     with Array[SortEntry] {
  
  /**
    * Appends a sort entry to the end of the collection.
    * @param value The sort entry to append to the collection.
    */
  def append(value: SortEntry): Unit = js.native
  
  /** Removes all sort entries from the collection. */
  def clear(): Unit = js.native
  
  /**
    * Retrieves an iterator that iterates through the sort entries in the collection.
    * @return The iterator.
    */
  def first(): IIterator[SortEntry] = js.native
  
  /**
    * Retrieves the sort entry at the specified index in the collection.
    * @param index The zero-based index of the sort entry to retrieve.
    * @return The sort entry at the specified index.
    */
  def getAt(index: Double): SortEntry = js.native
  
  /**
    * Retrieves the sort entries that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the sort entries in the collection to retrieve.
    */
  def getMany(startIndex: Double): ItemsSortEntry = js.native
  
  /**
    * Retrieves an immutable view of the collection of sort entries.
    * @return The view of the collection.
    */
  def getView(): IVectorView[SortEntry] = js.native
  
  def indexOf(value: SortEntry, extra: js.Any*): Index = js.native
  /* hack */
  @JSName("indexOf")
  def indexOf_Double(searchElement: SortEntry): Double = js.native
  
  /**
    * Inserts a sort entry into the collection at a specified index.
    * @param index The zero-based index of the location to insert the sort entry.
    * @param value The sort entry to insert.
    */
  def insertAt(index: Double, value: SortEntry): Unit = js.native
  
  /**
    * Removes the sort entry at the specified index in the collection.
    * @param index The zero-based index of the sort entry to remove.
    */
  def removeAt(index: Double): Unit = js.native
  
  /** Removes the last sort entry from the collection. */
  def removeAtEnd(): Unit = js.native
  
  /**
    * Replaces all sort entries in the collection with the specified sort entries.
    * @param items The collection of sort entries to put in the vector.
    */
  def replaceAll(items: SortEntry): Unit = js.native
  
  /**
    * Sets the sort entry at the specified index of the collection.
    * @param index The zero-based index of the location at which to set the sort entry.
    * @param value The sort entry.
    */
  def setAt(index: Double, value: SortEntry): Unit = js.native
  
  /** Gets the number of sort entries in the collection. */
  var size: Double = js.native
}
