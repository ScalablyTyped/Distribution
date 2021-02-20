package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeJsonrpc.mod.RequestHandler
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentColor
import typings.vscodeLanguageserverTypes.mod.Color
import typings.vscodeLanguageserverTypes.mod.ColorInformation
import typings.vscodeLanguageserverTypes.mod.ColorPresentation
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolColorProviderMod {
  
  object ColorPresentationRequest {
    
    type HandlerSignature = RequestHandler[ColorPresentationParams, js.Array[ColorPresentation], Unit]
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.colorProvider", "ColorPresentationRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        ColorPresentationParams, 
        js.Array[ColorPresentation], 
        js.Array[ColorPresentation], 
        Unit, 
        WorkDoneProgressOptions with TextDocumentRegistrationOptions
      ] = js.native
  }
  
  object DocumentColorRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.colorProvider", "DocumentColorRequest.method")
    @js.native
    val method: textDocumentSlashdocumentColor = js.native
    
    /** @deprecated Use DocumentColorRequest.type */
    @JSImport("vscode-languageserver-protocol/lib/protocol.colorProvider", "DocumentColorRequest.resultType")
    @js.native
    val resultType: ProgressType[js.Array[ColorInformation]] = js.native
    
    type HandlerSignature = RequestHandler[DocumentColorParams, js.Array[ColorInformation], Unit]
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.colorProvider", "DocumentColorRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        DocumentColorParams, 
        js.Array[ColorInformation], 
        js.Array[ColorInformation], 
        Unit, 
        DocumentColorRegistrationOptions
      ] = js.native
  }
  
  @js.native
  trait ColorPresentationParams
    extends WorkDoneProgressParams
       with PartialResultParams {
    
    /**
      * The color to request presentations for.
      */
    var color: Color = js.native
    
    /**
      * The range where the color would be inserted. Serves as a context.
      */
    var range: Range = js.native
    
    /**
      * The text document.
      */
    var textDocument: TextDocumentIdentifier = js.native
  }
  object ColorPresentationParams {
    
    @scala.inline
    def apply(color: Color, range: Range, textDocument: TextDocumentIdentifier): ColorPresentationParams = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorPresentationParams]
    }
    
    @scala.inline
    implicit class ColorPresentationParamsMutableBuilder[Self <: ColorPresentationParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DocumentColorClientCapabilities extends StObject {
    
    /**
      * Whether implementation supports dynamic registration. If this is set to `true`
      * the client supports the new `DocumentColorRegistrationOptions` return value
      * for the corresponding server capability as well.
      */
    var dynamicRegistration: js.UndefOr[Boolean] = js.native
  }
  object DocumentColorClientCapabilities {
    
    @scala.inline
    def apply(): DocumentColorClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentColorClientCapabilities]
    }
    
    @scala.inline
    implicit class DocumentColorClientCapabilitiesMutableBuilder[Self <: DocumentColorClientCapabilities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    }
  }
  
  type DocumentColorOptions = WorkDoneProgressOptions
  
  @js.native
  trait DocumentColorParams
    extends WorkDoneProgressParams
       with PartialResultParams {
    
    /**
      * The text document.
      */
    var textDocument: TextDocumentIdentifier = js.native
  }
  object DocumentColorParams {
    
    @scala.inline
    def apply(textDocument: TextDocumentIdentifier): DocumentColorParams = {
      val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentColorParams]
    }
    
    @scala.inline
    implicit class DocumentColorParamsMutableBuilder[Self <: DocumentColorParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DocumentColorRegistrationOptions
    extends TextDocumentRegistrationOptions
       with StaticRegistrationOptions
       with WorkDoneProgressOptions
  object DocumentColorRegistrationOptions {
    
    @scala.inline
    def apply(): DocumentColorRegistrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentColorRegistrationOptions]
    }
  }
}
