package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "DataTransferItem")
@js.native
open class DataTransferItem protected () extends StObject {
  /**
  		 * @param value Custom data stored on this item. Can be retrieved using {@linkcode DataTransferItem.value}.
  		 */
  def this(value: Any) = this()
  
  /**
  		 * Try getting the {@link DataTransferFile file} associated with this data transfer item.
  		 *
  		 * Note that the file object is only valid for the scope of the drag and drop operation.
  		 *
  		 * @returns The file for the data transfer or `undefined` if the item is either not a file or the
  		 * file data cannot be accessed.
  		 */
  def asFile(): js.UndefOr[DataTransferFile] = js.native
  
  /**
  		 * Get a string representation of this item.
  		 *
  		 * If {@linkcode DataTransferItem.value} is an object, this returns the result of json stringifying {@linkcode DataTransferItem.value} value.
  		 */
  def asString(): Thenable[String] = js.native
  
  /**
  		 * Custom data stored on this item.
  		 *
  		 * You can use `value` to share data across operations. The original object can be retrieved so long as the extension that
  		 * created the `DataTransferItem` runs in the same extension host.
  		 */
  val value: Any = js.native
}
