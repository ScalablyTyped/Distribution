package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashselectionRange
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.SelectionRange
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolDotselectionRangeMod {
  
  object SelectionRangeRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.selectionRange", "SelectionRangeRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.selectionRange", "SelectionRangeRequest.method")
    @js.native
    val method: textDocumentSlashselectionRange = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.selectionRange", "SelectionRangeRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        SelectionRangeParams, 
        js.Array[SelectionRange] | Null, 
        js.Array[SelectionRange], 
        Unit, 
        SelectionRangeRegistrationOptions
      ] = js.native
    
    type HandlerSignature = RequestHandler[SelectionRangeParams, js.Array[SelectionRange] | Null, Unit]
  }
  
  trait SelectionRangeClientCapabilities extends StObject {
    
    /**
      * Whether implementation supports dynamic registration for selection range providers. If this is set to `true`
      * the client supports the new `SelectionRangeRegistrationOptions` return value for the corresponding server
      * capability as well.
      */
    var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  }
  object SelectionRangeClientCapabilities {
    
    inline def apply(): SelectionRangeClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionRangeClientCapabilities]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionRangeClientCapabilities] (val x: Self) extends AnyVal {
      
      inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
      
      inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    }
  }
  
  type SelectionRangeOptions = WorkDoneProgressOptions
  
  trait SelectionRangeParams
    extends StObject
       with WorkDoneProgressParams
       with PartialResultParams {
    
    /**
      * The positions inside the text document.
      */
    var positions: js.Array[Position]
    
    /**
      * The text document.
      */
    var textDocument: TextDocumentIdentifier
  }
  object SelectionRangeParams {
    
    inline def apply(positions: js.Array[Position], textDocument: TextDocumentIdentifier): SelectionRangeParams = {
      val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionRangeParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionRangeParams] (val x: Self) extends AnyVal {
      
      inline def setPositions(value: js.Array[Position]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      inline def setPositionsVarargs(value: Position*): Self = StObject.set(x, "positions", js.Array(value*))
      
      inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectionRangeRegistrationOptions
    extends StObject
       with WorkDoneProgressOptions
       with TextDocumentRegistrationOptions
       with StaticRegistrationOptions
  object SelectionRangeRegistrationOptions {
    
    inline def apply(): SelectionRangeRegistrationOptions = {
      val __obj = js.Dynamic.literal(documentSelector = null)
      __obj.asInstanceOf[SelectionRangeRegistrationOptions]
    }
  }
}
