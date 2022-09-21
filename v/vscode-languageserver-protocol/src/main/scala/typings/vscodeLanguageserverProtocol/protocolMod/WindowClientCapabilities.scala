package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.protocolShowDocumentMod.ShowDocumentClientCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowClientCapabilities extends StObject {
  
  /**
    * Capabilities specific to the showDocument request.
    *
    * @since 3.16.0
    */
  var showDocument: js.UndefOr[ShowDocumentClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the showMessage request.
    *
    * @since 3.16.0
    */
  var showMessage: js.UndefOr[ShowMessageRequestClientCapabilities] = js.undefined
  
  /**
    * It indicates whether the client supports server initiated
    * progress using the `window/workDoneProgress/create` request.
    *
    * The capability also controls Whether client supports handling
    * of progress notifications. If set servers are allowed to report a
    * `workDoneProgress` property in the request specific server
    * capabilities.
    *
    * @since 3.15.0
    */
  var workDoneProgress: js.UndefOr[Boolean] = js.undefined
}
object WindowClientCapabilities {
  
  inline def apply(): WindowClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowClientCapabilities]
  }
  
  extension [Self <: WindowClientCapabilities](x: Self) {
    
    inline def setShowDocument(value: ShowDocumentClientCapabilities): Self = StObject.set(x, "showDocument", value.asInstanceOf[js.Any])
    
    inline def setShowDocumentUndefined: Self = StObject.set(x, "showDocument", js.undefined)
    
    inline def setShowMessage(value: ShowMessageRequestClientCapabilities): Self = StObject.set(x, "showMessage", value.asInstanceOf[js.Any])
    
    inline def setShowMessageUndefined: Self = StObject.set(x, "showMessage", js.undefined)
    
    inline def setWorkDoneProgress(value: Boolean): Self = StObject.set(x, "workDoneProgress", value.asInstanceOf[js.Any])
    
    inline def setWorkDoneProgressUndefined: Self = StObject.set(x, "workDoneProgress", js.undefined)
  }
}
