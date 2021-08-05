package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureHelpParams
  extends StObject
     with TextDocumentPositionParams
     with WorkDoneProgressParams {
  
  /**
    * The signature help context. This is only available if the client specifies
    * to send this using the client capability `textDocument.signatureHelp.contextSupport === true`
    *
    * @since 3.15.0
    */
  var context: js.UndefOr[SignatureHelpContext] = js.undefined
}
object SignatureHelpParams {
  
  inline def apply(position: Position, textDocument: TextDocumentIdentifier): SignatureHelpParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpParams]
  }
  
  extension [Self <: SignatureHelpParams](x: Self) {
    
    inline def setContext(value: SignatureHelpContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
  }
}
