package typings.winrtUwp.Windows.Foundation.Collections

import typings.std.Array
import typings.winrtUwp.anon.Index
import typings.winrtUwp.anon.Items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an immutable view into a vector. */
@js.native
trait IVectorView[T]
  extends Array[T]
     with IIterable[T] {
  
  /**
    * Returns the item at the specified index in the vector view.
    * @param index The zero-based index of the item.
    * @return The item at the specified index.
    */
  def getAt(index: Double): T = js.native
  
  /**
    * Retrieves the items that start at the specified index in the vector view.
    * @param startIndex The zero-based index of the start of the items in the vector view.
    */
  def getMany(startIndex: Double): Items[T] = js.native
  
  def indexOf(value: T, extra: js.Any*): Index = js.native
  /* hack */
  @JSName("indexOf")
  def indexOf_Double(searchElement: T): Double = js.native
  
  /** Gets the number of items in the vector view. */
  var size: Double = js.native
}
