package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashcolorPresentation
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentColor
import typings.vscodeLanguageserverTypes.mod.Color
import typings.vscodeLanguageserverTypes.mod.ColorInformation
import typings.vscodeLanguageserverTypes.mod.ColorPresentation
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolDotcolorProviderMod {
  
  object ColorPresentationRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.colorProvider", "ColorPresentationRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.colorProvider", "ColorPresentationRequest.method")
    @js.native
    val method: textDocumentSlashcolorPresentation = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.colorProvider", "ColorPresentationRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        ColorPresentationParams, 
        js.Array[ColorPresentation], 
        js.Array[ColorPresentation], 
        Unit, 
        WorkDoneProgressOptions & TextDocumentRegistrationOptions
      ] = js.native
    
    type HandlerSignature = RequestHandler[ColorPresentationParams, js.Array[ColorPresentation], Unit]
  }
  
  object DocumentColorRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.colorProvider", "DocumentColorRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.colorProvider", "DocumentColorRequest.method")
    @js.native
    val method: textDocumentSlashdocumentColor = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.colorProvider", "DocumentColorRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        DocumentColorParams, 
        js.Array[ColorInformation], 
        js.Array[ColorInformation], 
        Unit, 
        DocumentColorRegistrationOptions
      ] = js.native
    
    type HandlerSignature = RequestHandler[DocumentColorParams, js.Array[ColorInformation], Unit]
  }
  
  trait ColorPresentationParams
    extends StObject
       with WorkDoneProgressParams
       with PartialResultParams {
    
    /**
      * The color to request presentations for.
      */
    var color: Color
    
    /**
      * The range where the color would be inserted. Serves as a context.
      */
    var range: Range
    
    /**
      * The text document.
      */
    var textDocument: TextDocumentIdentifier
  }
  object ColorPresentationParams {
    
    inline def apply(color: Color, range: Range, textDocument: TextDocumentIdentifier): ColorPresentationParams = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorPresentationParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorPresentationParams] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    }
  }
  
  trait DocumentColorClientCapabilities extends StObject {
    
    /**
      * Whether implementation supports dynamic registration. If this is set to `true`
      * the client supports the new `DocumentColorRegistrationOptions` return value
      * for the corresponding server capability as well.
      */
    var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  }
  object DocumentColorClientCapabilities {
    
    inline def apply(): DocumentColorClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentColorClientCapabilities]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocumentColorClientCapabilities] (val x: Self) extends AnyVal {
      
      inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
      
      inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    }
  }
  
  type DocumentColorOptions = WorkDoneProgressOptions
  
  trait DocumentColorParams
    extends StObject
       with WorkDoneProgressParams
       with PartialResultParams {
    
    /**
      * The text document.
      */
    var textDocument: TextDocumentIdentifier
  }
  object DocumentColorParams {
    
    inline def apply(textDocument: TextDocumentIdentifier): DocumentColorParams = {
      val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentColorParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocumentColorParams] (val x: Self) extends AnyVal {
      
      inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    }
  }
  
  trait DocumentColorRegistrationOptions
    extends StObject
       with TextDocumentRegistrationOptions
       with StaticRegistrationOptions
       with WorkDoneProgressOptions
  object DocumentColorRegistrationOptions {
    
    inline def apply(): DocumentColorRegistrationOptions = {
      val __obj = js.Dynamic.literal(documentSelector = null)
      __obj.asInstanceOf[DocumentColorRegistrationOptions]
    }
  }
}
