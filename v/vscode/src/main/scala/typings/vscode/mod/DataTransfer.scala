package typings.vscode.mod

import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "DataTransfer")
@js.native
open class DataTransfer ()
  extends StObject
     with Iterable[js.Tuple2[/* mimeType */ String, /* item */ DataTransferItem]] {
  
  /**
  		 * Allows iteration through the data transfer items.
  		 *
  		 * @param callbackfn Callback for iteration through the data transfer items.
  		 * @param thisArg The `this` context used when invoking the handler function.
  		 */
  def forEach(
    callbackfn: js.Function3[/* item */ DataTransferItem, /* mimeType */ String, /* dataTransfer */ this.type, Unit]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* item */ DataTransferItem, /* mimeType */ String, /* dataTransfer */ this.type, Unit],
    thisArg: Any
  ): Unit = js.native
  
  /**
  		 * Retrieves the data transfer item for a given mime type.
  		 *
  		 * @param mimeType The mime type to get the data transfer item for, such as `text/plain` or `image/png`.
  		 * Mimes type look ups are case-insensitive.
  		 *
  		 * Special mime types:
  		 * - `text/uri-list` — A string with `toString()`ed Uris separated by `\r\n`. To specify a cursor position in the file,
  		 * set the Uri's fragment to `L3,5`, where 3 is the line number and 5 is the column number.
  		 */
  def get(mimeType: String): js.UndefOr[DataTransferItem] = js.native
  
  /**
  		 * Get a new iterator with the `[mime, item]` pairs for each element in this data transfer.
  		 */
  @JSName(js.Symbol.iterator)
  var iterator_DataTransfer: js.Function0[IterableIterator[js.Tuple2[/* mimeType */ String, /* item */ DataTransferItem]]] = js.native
  
  /**
  		 * Sets a mime type to data transfer item mapping.
  		 *
  		 * @param mimeType The mime type to set the data for. Mimes types stored in lower case, with case-insensitive looks up.
  		 * @param value The data transfer item for the given mime type.
  		 */
  def set(mimeType: String, value: DataTransferItem): Unit = js.native
}
