package typings.winrtUwp.global.Windows.Storage.Pickers

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of display names mapped to the associated file types (extensions). Each element in this collection maps a display name to a corresponding collection of file name extensions. The key is a single string, the value is a list/vector of strings representing one or more extension choices. */
@JSGlobal("Windows.Storage.Pickers.FilePickerFileTypesOrderedMap")
@js.native
abstract class FilePickerFileTypesOrderedMap ()
  extends typings.winrtUwp.Windows.Storage.Pickers.FilePickerFileTypesOrderedMap {
  /** Gets the number of items in the mapped collection of display names and associated file types. */
  /* CompleteClass */
  override var size: Double = js.native
  /** Removes all display names and associated file name extensions from the collection. */
  /* CompleteClass */
  override def clear(): Unit = js.native
  /**
    * Retrieves an iterator that iterates through the display names and associated file types in the collection.
    * @return The iterator.
    */
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[_, _]] = js.native
  /**
    * Returns an immutable view of the collection of display names and associated file types.
    * @return The view of the collection.
    */
  /* CompleteClass */
  override def getView(): IMapView[String, IVector[String]] = js.native
  /**
    * Determines whether the mapped collection of display names and associated file types contains the specified key.
    * @param key The key.
    * @return True if the key is found; otherwise, false.
    */
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  /**
    * Inserts or replaces an item in the mapped collection of display names and associated file types.
    * @param key The key associated with the item to insert.
    * @param value The item to insert.
    * @return true if an item with the specified key is an existing item and was replaced; otherwise false.
    */
  /* CompleteClass */
  override def insert(key: String, value: IVector[String]): Boolean = js.native
  /**
    * Returns the item at the specified key in the mapped collection of display names and associated file types.
    * @param key The key to use to locate the item.
    * @return The item associated with the specified key.
    */
  /* CompleteClass */
  override def lookup(key: String): IVector[String] = js.native
  /**
    * Removes an item from the mapped collection of display names and associated file types.
    * @param key The key associated with the item to remove.
    */
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
}

