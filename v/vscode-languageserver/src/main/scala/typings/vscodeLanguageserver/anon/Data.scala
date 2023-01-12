package typings.vscodeLanguageserver.anon

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  /**
    * The cell data has changed, excluding its
    * text content which is reported via
    * `textContentChanged`.
    */
  var data: js.Array[Old]
  
  /**
    * The text content of a cell has changed.
    * The actual text is available via the `Notebooks`
    * text document manager.
    */
  var textContent: js.Array[NotebookCell]
}
object Data {
  
  inline def apply(data: js.Array[Old], textContent: js.Array[NotebookCell]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[Old]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Old*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setTextContent(value: js.Array[NotebookCell]): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
    
    inline def setTextContentVarargs(value: NotebookCell*): Self = StObject.set(x, "textContent", js.Array(value*))
  }
}
