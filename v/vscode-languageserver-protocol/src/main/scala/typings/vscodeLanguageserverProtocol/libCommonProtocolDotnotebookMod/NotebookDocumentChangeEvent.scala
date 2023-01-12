package typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod

import typings.vscodeLanguageserverProtocol.anon.Data
import typings.vscodeLanguageserverTypes.mod.LSPObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookDocumentChangeEvent extends StObject {
  
  /**
    * Changes to cells
    */
  var cells: js.UndefOr[Data] = js.undefined
  
  /**
    * The changed meta data if any.
    *
    * Note: should always be an object literal (e.g. LSPObject)
    */
  var metadata: js.UndefOr[LSPObject] = js.undefined
}
object NotebookDocumentChangeEvent {
  
  inline def apply(): NotebookDocumentChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookDocumentChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotebookDocumentChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setCells(value: Data): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    inline def setMetadata(value: LSPObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
