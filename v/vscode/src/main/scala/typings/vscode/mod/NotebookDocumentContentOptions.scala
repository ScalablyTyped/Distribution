package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookDocumentContentOptions extends StObject {
  
  /**
    * Controls if a cell metadata property change event will trigger notebook document content
    * change events and if it will be used in the diff editor, defaults to false. If the
    * content provider doesn't persist a metadata property in the file document, it should be
    * set to true.
    */
  var transientCellMetadata: js.UndefOr[StringDictionary[js.UndefOr[Boolean]]] = js.undefined
  
  /**
    * Controls if a document metadata property change event will trigger notebook document
    * content change event and if it will be used in the diff editor, defaults to false. If the
    * content provider doesn't persist a metadata property in the file document, it should be
    * set to true.
    */
  var transientDocumentMetadata: js.UndefOr[StringDictionary[js.UndefOr[Boolean]]] = js.undefined
  
  /**
    * Controls if output change events will trigger notebook document content change events and
    * if it will be used in the diff editor, defaults to false. If the content provider doesn't
    * persist the outputs in the file document, this should be set to true.
    */
  var transientOutputs: js.UndefOr[Boolean] = js.undefined
}
object NotebookDocumentContentOptions {
  
  inline def apply(): NotebookDocumentContentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookDocumentContentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotebookDocumentContentOptions] (val x: Self) extends AnyVal {
    
    inline def setTransientCellMetadata(value: StringDictionary[js.UndefOr[Boolean]]): Self = StObject.set(x, "transientCellMetadata", value.asInstanceOf[js.Any])
    
    inline def setTransientCellMetadataUndefined: Self = StObject.set(x, "transientCellMetadata", js.undefined)
    
    inline def setTransientDocumentMetadata(value: StringDictionary[js.UndefOr[Boolean]]): Self = StObject.set(x, "transientDocumentMetadata", value.asInstanceOf[js.Any])
    
    inline def setTransientDocumentMetadataUndefined: Self = StObject.set(x, "transientDocumentMetadata", js.undefined)
    
    inline def setTransientOutputs(value: Boolean): Self = StObject.set(x, "transientOutputs", value.asInstanceOf[js.Any])
    
    inline def setTransientOutputsUndefined: Self = StObject.set(x, "transientOutputs", js.undefined)
  }
}
