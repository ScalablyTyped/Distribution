package typings.winrtUwp.Windows.Storage.Pickers

import typings.std.Array
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.anon.Index
import typings.winrtUwp.anon.ItemsStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a collection of storage files that the user has selected by using a file picker. */
@js.native
trait FilePickerSelectedFilesArray
  extends StObject
     with Array[StorageFile] {
  
  /**
    * Retrieves an iterator that iterates through the collection of StorageFile objects that represent selected files.
    * @return The iterator.
    */
  def first(): IIterator[StorageFile] = js.native
  
  /**
    * Returns the StorageFile object at the specified index in the collection.
    * @param index The zero-based index of the object to retrieve.
    * @return The object at the specified index.
    */
  def getAt(index: Double): StorageFile = js.native
  
  /**
    * Retrieves the StorageFile objects that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the objects in the collection to return.
    */
  def getMany(startIndex: Double): ItemsStorageFile = js.native
  
  def indexOf(value: StorageFile, extra: Any*): Index = js.native
  /* hack */
  @JSName("indexOf")
  def indexOf_Double(searchElement: StorageFile): Double = js.native
  
  /** Gets the number of StorageFile objects in the collection. */
  var size: Double = js.native
}
