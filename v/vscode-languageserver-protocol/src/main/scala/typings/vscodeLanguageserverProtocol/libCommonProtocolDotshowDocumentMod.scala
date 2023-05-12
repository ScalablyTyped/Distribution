package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.libCommonConnectionMod.HandlerResult
import typings.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.windowSlashshowDocument
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolDotshowDocumentMod {
  
  object ShowDocumentRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.showDocument", "ShowDocumentRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.showDocument", "ShowDocumentRequest.method")
    @js.native
    val method: windowSlashshowDocument = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.showDocument", "ShowDocumentRequest.type")
    @js.native
    val `type`: ProtocolRequestType[ShowDocumentParams, ShowDocumentResult, Unit, Unit, Unit] = js.native
    
    type HandlerSignature = RequestHandler[ShowDocumentParams, ShowDocumentResult, Unit]
    
    type MiddlewareSignature = js.Function2[
        /* params */ ShowDocumentParams, 
        /* next */ HandlerSignature, 
        HandlerResult[ShowDocumentResult, Unit]
      ]
  }
  
  trait ShowDocumentClientCapabilities extends StObject {
    
    /**
      * The client has support for the showDocument
      * request.
      */
    var support: Boolean
  }
  object ShowDocumentClientCapabilities {
    
    inline def apply(support: Boolean): ShowDocumentClientCapabilities = {
      val __obj = js.Dynamic.literal(support = support.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowDocumentClientCapabilities]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShowDocumentClientCapabilities] (val x: Self) extends AnyVal {
      
      inline def setSupport(value: Boolean): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShowDocumentParams extends StObject {
    
    /**
      * Indicates to show the resource in an external program.
      * To show, for example, `https://code.visualstudio.com/`
      * in the default WEB browser set `external` to `true`.
      */
    var external: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional selection range if the document is a text
      * document. Clients might ignore the property if an
      * external program is started or the file is not a text
      * file.
      */
    var selection: js.UndefOr[Range] = js.undefined
    
    /**
      * An optional property to indicate whether the editor
      * showing the document should take focus or not.
      * Clients might ignore this property if an external
      * program is started.
      */
    var takeFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The uri to show.
      */
    var uri: URI
  }
  object ShowDocumentParams {
    
    inline def apply(uri: URI): ShowDocumentParams = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowDocumentParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShowDocumentParams] (val x: Self) extends AnyVal {
      
      inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setSelection(value: Range): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      inline def setTakeFocus(value: Boolean): Self = StObject.set(x, "takeFocus", value.asInstanceOf[js.Any])
      
      inline def setTakeFocusUndefined: Self = StObject.set(x, "takeFocus", js.undefined)
      
      inline def setUri(value: URI): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShowDocumentResult extends StObject {
    
    /**
      * A boolean indicating if the show was successful.
      */
    var success: Boolean
  }
  object ShowDocumentResult {
    
    inline def apply(success: Boolean): ShowDocumentResult = {
      val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowDocumentResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShowDocumentResult] (val x: Self) extends AnyVal {
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}
