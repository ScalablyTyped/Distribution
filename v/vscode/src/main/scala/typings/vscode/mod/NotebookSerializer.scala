package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookSerializer extends StObject {
  
  /**
    * Deserialize contents of a notebook file into the notebook data structure.
    *
    * @param content Contents of a notebook file.
    * @param token A cancellation token.
    * @return Notebook data or a thenable that resolves to such.
    */
  def deserializeNotebook(content: js.typedarray.Uint8Array, token: CancellationToken): NotebookData | Thenable[NotebookData]
  
  /**
    * Serialize notebook data into file contents.
    *
    * @param data A notebook data structure.
    * @param token A cancellation token.
    * @returns An array of bytes or a thenable that resolves to such.
    */
  def serializeNotebook(data: NotebookData, token: CancellationToken): js.typedarray.Uint8Array | Thenable[js.typedarray.Uint8Array]
}
object NotebookSerializer {
  
  inline def apply(
    deserializeNotebook: (js.typedarray.Uint8Array, CancellationToken) => NotebookData | Thenable[NotebookData],
    serializeNotebook: (NotebookData, CancellationToken) => js.typedarray.Uint8Array | Thenable[js.typedarray.Uint8Array]
  ): NotebookSerializer = {
    val __obj = js.Dynamic.literal(deserializeNotebook = js.Any.fromFunction2(deserializeNotebook), serializeNotebook = js.Any.fromFunction2(serializeNotebook))
    __obj.asInstanceOf[NotebookSerializer]
  }
  
  extension [Self <: NotebookSerializer](x: Self) {
    
    inline def setDeserializeNotebook(value: (js.typedarray.Uint8Array, CancellationToken) => NotebookData | Thenable[NotebookData]): Self = StObject.set(x, "deserializeNotebook", js.Any.fromFunction2(value))
    
    inline def setSerializeNotebook(
      value: (NotebookData, CancellationToken) => js.typedarray.Uint8Array | Thenable[js.typedarray.Uint8Array]
    ): Self = StObject.set(x, "serializeNotebook", js.Any.fromFunction2(value))
  }
}
