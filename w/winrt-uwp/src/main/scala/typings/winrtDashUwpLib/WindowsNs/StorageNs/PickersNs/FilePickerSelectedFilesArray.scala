package typings
package winrtDashUwpLib.WindowsNs.StorageNs.PickersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of storage files that the user has selected by using a file picker. */
@JSGlobal("Windows.Storage.Pickers.FilePickerSelectedFilesArray")
@js.native
abstract class FilePickerSelectedFilesArray ()
  extends stdLib.Array[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] {
  /** Gets the number of StorageFile objects in the collection. */
  var size: scala.Double = js.native
  /**
    * Retrieves an iterator that iterates through the collection of StorageFile objects that represent selected files.
    * @return The iterator.
    */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
  /**
    * Returns the StorageFile object at the specified index in the collection.
    * @param index The zero-based index of the object to retrieve.
    * @return The object at the specified index.
    */
  def getAt(index: scala.Double): winrtDashUwpLib.WindowsNs.StorageNs.StorageFile = js.native
  /**
    * Retrieves the StorageFile objects that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the objects in the collection to return.
    */
  def getMany(startIndex: scala.Double): winrtDashUwpLib.Anon_ItemsReturnValueNumberStorageFile = js.native
  def indexOf(value: winrtDashUwpLib.WindowsNs.StorageNs.StorageFile, extra: js.Any*): winrtDashUwpLib.Anon_Index = js.native
  /**
    * Retrieves the index of a specified StorageFile object in the collection.
    * @param value The object to find in the collection.
    */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: winrtDashUwpLib.WindowsNs.StorageNs.StorageFile): winrtDashUwpLib.Anon_Index = js.native
}

