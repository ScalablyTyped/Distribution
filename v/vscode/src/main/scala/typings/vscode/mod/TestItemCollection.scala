package typings.vscode.mod

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestItemCollection
  extends StObject
     with Iterable[js.Tuple2[/* id */ String, /* testItem */ TestItem]] {
  
  /**
    * Adds the test item to the children. If an item with the same ID already
    * exists, it'll be replaced.
    * @param item Item to add.
    */
  def add(item: TestItem): Unit = js.native
  
  /**
    * Removes a single test item from the collection.
    * @param itemId Item ID to delete.
    */
  def delete(itemId: String): Unit = js.native
  
  /**
    * Iterate over each entry in this collection.
    *
    * @param callback Function to execute for each entry.
    * @param thisArg The `this` context used when invoking the handler function.
    */
  def forEach(callback: js.Function2[/* item */ TestItem, /* collection */ this.type, Any]): Unit = js.native
  def forEach(callback: js.Function2[/* item */ TestItem, /* collection */ this.type, Any], thisArg: Any): Unit = js.native
  
  /**
    * Efficiently gets a test item by ID, if it exists, in the children.
    * @param itemId Item ID to get.
    * @returns The found item or undefined if it does not exist.
    */
  def get(itemId: String): js.UndefOr[TestItem] = js.native
  
  /**
    * Replaces the items stored by the collection.
    * @param items Items to store.
    */
  def replace(items: js.Array[TestItem]): Unit = js.native
  
  /**
    * Gets the number of items in the collection.
    */
  val size: Double = js.native
}
