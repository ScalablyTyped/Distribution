package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains properties for the MediaStreamSample . */
@JSGlobal("Windows.Media.Core.MediaStreamSamplePropertySet")
@js.native
abstract class MediaStreamSamplePropertySet ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.MediaStreamSamplePropertySet {
  
  /** Removes all items from the property set. */
  /* CompleteClass */
  override def clear(): Unit = js.native
  
  /**
    * Returns an iterator to enumerate the items in the property set.
    * @return The iterator. The current position of the iterator is index 0, or the end of the property set if the property set is empty.
    */
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[js.Any, js.Any]] = js.native
  
  /**
    * Gets an immutable view of the property set.
    * @return The immutable view.
    */
  /* CompleteClass */
  override def getView(): IMapView[String, js.Any] = js.native
  
  /**
    * Indicates if the specified key exists in the property set.
    * @param key The key to check.
    * @return true if the key exists; otherwise, false.
    */
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  
  /**
    * Adds the specified key and value to the property set.
    * @param key The key to add.
    * @param value The value of the key.
    * @return True if the method replaces a value that already exists for the key; false if this is a new key.
    */
  /* CompleteClass */
  override def insert(key: String, value: js.Any): Boolean = js.native
  
  /**
    * Retrieves the value for the specified key.
    * @param key The key to retrieve the value for.
    * @return The value, if an item with the specified key exists; otherwise, null.
    */
  /* CompleteClass */
  override def lookup(key: String): js.Any = js.native
  
  /**
    * Removes an item from the property set.
    * @param key The key to remove.
    */
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
  
  /** Gets the number of items contained in the property set. */
  /* CompleteClass */
  var size: Double = js.native
}
