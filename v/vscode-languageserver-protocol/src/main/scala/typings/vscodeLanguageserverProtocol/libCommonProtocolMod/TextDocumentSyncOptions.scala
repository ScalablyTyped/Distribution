package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentSyncOptions extends StObject {
  
  /**
    * Change notifications are sent to the server. See TextDocumentSyncKind.None, TextDocumentSyncKind.Full
    * and TextDocumentSyncKind.Incremental. If omitted it defaults to TextDocumentSyncKind.None.
    */
  var change: js.UndefOr[TextDocumentSyncKind] = js.undefined
  
  /**
    * Open and close notifications are sent to the server. If omitted open close notification should not
    * be sent.
    */
  var openClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If present save notifications are sent to the server. If omitted the notification should not be
    * sent.
    */
  var save: js.UndefOr[Boolean | SaveOptions] = js.undefined
  
  /**
    * If present will save notifications are sent to the server. If omitted the notification should not be
    * sent.
    */
  var willSave: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If present will save wait until requests are sent to the server. If omitted the request should not be
    * sent.
    */
  var willSaveWaitUntil: js.UndefOr[Boolean] = js.undefined
}
object TextDocumentSyncOptions {
  
  inline def apply(): TextDocumentSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDocumentSyncOptions]
  }
  
  extension [Self <: TextDocumentSyncOptions](x: Self) {
    
    inline def setChange(value: TextDocumentSyncKind): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setOpenClose(value: Boolean): Self = StObject.set(x, "openClose", value.asInstanceOf[js.Any])
    
    inline def setOpenCloseUndefined: Self = StObject.set(x, "openClose", js.undefined)
    
    inline def setSave(value: Boolean | SaveOptions): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    inline def setWillSave(value: Boolean): Self = StObject.set(x, "willSave", value.asInstanceOf[js.Any])
    
    inline def setWillSaveUndefined: Self = StObject.set(x, "willSave", js.undefined)
    
    inline def setWillSaveWaitUntil(value: Boolean): Self = StObject.set(x, "willSaveWaitUntil", value.asInstanceOf[js.Any])
    
    inline def setWillSaveWaitUntilUndefined: Self = StObject.set(x, "willSaveWaitUntil", js.undefined)
  }
}
