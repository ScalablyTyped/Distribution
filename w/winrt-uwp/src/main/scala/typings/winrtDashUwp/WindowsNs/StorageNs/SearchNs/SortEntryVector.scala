package typings.winrtDashUwp.WindowsNs.StorageNs.SearchNs

import typings.std.Array
import typings.winrtDashUwp.Anon_Index
import typings.winrtDashUwp.Anon_ItemsReturnValueNumberSortEntry
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IIterator
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the sorting criteria of the query results as a collection of SortEntry objects. */
@JSGlobal("Windows.Storage.Search.SortEntryVector")
@js.native
abstract class SortEntryVector () extends Array[SortEntry] {
  /** Gets the number of sort entries in the collection. */
  var size: Double = js.native
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
  def getMany(startIndex: Double): Anon_ItemsReturnValueNumberSortEntry = js.native
  /**
    * Retrieves an immutable view of the collection of sort entries.
    * @return The view of the collection.
    */
  def getView(): IVectorView[SortEntry] = js.native
  def indexOf(value: SortEntry, extra: js.Any*): Anon_Index = js.native
  /**
    * Retrieves the index of a specified sort entry in the collection.
    * @param value The sort entry to find in the collection.
    */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: SortEntry): Anon_Index = js.native
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
}

