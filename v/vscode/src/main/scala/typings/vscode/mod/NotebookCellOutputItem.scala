package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "NotebookCellOutputItem")
@js.native
open class NotebookCellOutputItem protected () extends StObject {
  /**
  		 * Create a new notebook cell output item.
  		 *
  		 * @param data The value of the output item.
  		 * @param mime The mime type of the output item.
  		 */
  def this(data: js.typedarray.Uint8Array, mime: String) = this()
  
  /**
  		 * The data of this output item. Must always be an array of unsigned 8-bit integers.
  		 */
  var data: js.typedarray.Uint8Array = js.native
  
  /**
  		 * The mime type which determines how the {@linkcode NotebookCellOutputItem.data data}-property
  		 * is interpreted.
  		 *
  		 * Notebooks have built-in support for certain mime-types, extensions can add support for new
  		 * types and override existing types.
  		 */
  var mime: String = js.native
}
/* static members */
object NotebookCellOutputItem {
  
  @JSImport("vscode", "NotebookCellOutputItem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Factory function to create a `NotebookCellOutputItem` that uses
  		 * uses the `application/vnd.code.notebook.error` mime type.
  		 *
  		 * @param value An error object.
  		 * @returns A new output item object.
  		 */
  inline def error(value: js.Error): NotebookCellOutputItem = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(value.asInstanceOf[js.Any]).asInstanceOf[NotebookCellOutputItem]
  
  /**
  		 * Factory function to create a `NotebookCellOutputItem` from
  		 * a JSON object.
  		 *
  		 * *Note* that this function is not expecting "stringified JSON" but
  		 * an object that can be stringified. This function will throw an error
  		 * when the passed value cannot be JSON-stringified.
  		 *
  		 * @param value A JSON-stringifyable value.
  		 * @param mime Optional MIME type, defaults to `application/json`
  		 * @returns A new output item object.
  		 */
  inline def json(value: Any): NotebookCellOutputItem = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(value.asInstanceOf[js.Any]).asInstanceOf[NotebookCellOutputItem]
  inline def json(value: Any, mime: String): NotebookCellOutputItem = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(value.asInstanceOf[js.Any], mime.asInstanceOf[js.Any])).asInstanceOf[NotebookCellOutputItem]
  
  /**
  		 * Factory function to create a `NotebookCellOutputItem` that uses
  		 * uses the `application/vnd.code.notebook.stderr` mime type.
  		 *
  		 * @param value A string.
  		 * @returns A new output item object.
  		 */
  inline def stderr(value: String): NotebookCellOutputItem = ^.asInstanceOf[js.Dynamic].applyDynamic("stderr")(value.asInstanceOf[js.Any]).asInstanceOf[NotebookCellOutputItem]
  
  /**
  		 * Factory function to create a `NotebookCellOutputItem` that uses
  		 * uses the `application/vnd.code.notebook.stdout` mime type.
  		 *
  		 * @param value A string.
  		 * @returns A new output item object.
  		 */
  inline def stdout(value: String): NotebookCellOutputItem = ^.asInstanceOf[js.Dynamic].applyDynamic("stdout")(value.asInstanceOf[js.Any]).asInstanceOf[NotebookCellOutputItem]
  
  /**
  		 * Factory function to create a `NotebookCellOutputItem` from a string.
  		 *
  		 * *Note* that an UTF-8 encoder is used to create bytes for the string.
  		 *
  		 * @param value A string.
  		 * @param mime Optional MIME type, defaults to `text/plain`.
  		 * @returns A new output item object.
  		 */
  inline def text(value: String): NotebookCellOutputItem = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(value.asInstanceOf[js.Any]).asInstanceOf[NotebookCellOutputItem]
  inline def text(value: String, mime: String): NotebookCellOutputItem = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(value.asInstanceOf[js.Any], mime.asInstanceOf[js.Any])).asInstanceOf[NotebookCellOutputItem]
}
