package typings
package winrtDashUwpLib.WindowsNs.StorageNs.PickersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a random-access collection of file name extensions. */
@JSGlobal("Windows.Storage.Pickers.FileExtensionVector")
@js.native
abstract class FileExtensionVector ()
  extends stdLib.Array[java.lang.String] {
  /** Gets the number of file name extensions in the collection. */
  var size: scala.Double = js.native
  /**
                   * Appends a file name extension to the end of the collection.
                   * @param value The file name extension to append.
                   */
  def append(value: java.lang.String): scala.Unit = js.native
  /** Removes all file name extensions from the collection. */
  def clear(): scala.Unit = js.native
  /**
                   * Retrieves an iterator that iterates through the file name extensions in the collection.
                   * @return The iterator.
                   */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[java.lang.String] = js.native
  /**
                   * Retrieves the file name extension at the specified index in the collection.
                   * @param index The zero-based index of the file name extension to retrieve.
                   * @return The file name extension at the specified index.
                   */
  def getAt(index: scala.Double): java.lang.String = js.native
  /**
                   * Retrieves the file name extensions that start at the specified index in the collection.
                   * @param startIndex The zero-based index of the start of the file name extensions in the collection to retrieve.
                   */
  def getMany(startIndex: scala.Double): winrtDashUwpLib.Anon_ItemsReturnValueArray = js.native
  /**
                   * Retrieves an immutable view of the collection of file name extensions.
                   * @return The view of the collection.
                   */
  def getView(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  def indexOf(value: java.lang.String, extra: js.Any*): winrtDashUwpLib.Anon_Index = js.native
  /**
                   * Retrieves the index of a specified file name extension in the collection.
                   * @param value The file name extension to find in the collection.
                   */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: java.lang.String): winrtDashUwpLib.Anon_Index = js.native
  /**
                   * Inserts a file name extension into a collection at a specified index.
                   * @param index Zero-based index of the location at which to insert the file name extension.
                   * @param value The file name extension to insert.
                   */
  def insertAt(index: scala.Double, value: java.lang.String): scala.Unit = js.native
  /**
                   * Removes the file name extension at the specified index in the collection.
                   * @param index The zero-based index of the file name extension to remove.
                   */
  def removeAt(index: scala.Double): scala.Unit = js.native
  /** Removes the last file name extension from the collection. */
  def removeAtEnd(): scala.Unit = js.native
  /**
                   * Replaces all file name extensions in the collection with the specified file name extensions.
                   * @param items The collection of file name extensions to put in the vector.
                   */
  def replaceAll(items: js.Array[java.lang.String]): scala.Unit = js.native
  /**
                   * Sets the file name extension at the specified index of the collection.
                   * @param index The zero-based index of the location at which to set the file name extension.
                   * @param value The file name extension.
                   */
  def setAt(index: scala.Double, value: java.lang.String): scala.Unit = js.native
}

