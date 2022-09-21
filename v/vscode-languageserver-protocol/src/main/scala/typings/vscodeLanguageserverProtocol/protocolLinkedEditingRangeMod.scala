package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.connectionMod.RequestHandler
import typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashlinkedEditingRange
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolLinkedEditingRangeMod {
  
  object LinkedEditingRangeRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.linkedEditingRange", "LinkedEditingRangeRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.linkedEditingRange", "LinkedEditingRangeRequest.method")
    @js.native
    val method: textDocumentSlashlinkedEditingRange = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.linkedEditingRange", "LinkedEditingRangeRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        LinkedEditingRangeParams, 
        LinkedEditingRanges | Null, 
        Unit, 
        Unit, 
        LinkedEditingRangeRegistrationOptions
      ] = js.native
    
    type HandlerSignature = RequestHandler[LinkedEditingRangeParams, LinkedEditingRanges | Null, Unit]
  }
  
  trait LinkedEditingRangeClientCapabilities extends StObject {
    
    /**
      * Whether implementation supports dynamic registration. If this is set to `true`
      * the client supports the new `(TextDocumentRegistrationOptions & StaticRegistrationOptions)`
      * return value for the corresponding server capability as well.
      */
    var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  }
  object LinkedEditingRangeClientCapabilities {
    
    inline def apply(): LinkedEditingRangeClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkedEditingRangeClientCapabilities]
    }
    
    extension [Self <: LinkedEditingRangeClientCapabilities](x: Self) {
      
      inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
      
      inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    }
  }
  
  type LinkedEditingRangeOptions = WorkDoneProgressOptions
  
  trait LinkedEditingRangeParams
    extends StObject
       with TextDocumentPositionParams
       with WorkDoneProgressParams
  object LinkedEditingRangeParams {
    
    inline def apply(position: Position, textDocument: TextDocumentIdentifier): LinkedEditingRangeParams = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkedEditingRangeParams]
    }
  }
  
  trait LinkedEditingRangeRegistrationOptions
    extends StObject
       with TextDocumentRegistrationOptions
       with WorkDoneProgressOptions
       with StaticRegistrationOptions
  object LinkedEditingRangeRegistrationOptions {
    
    inline def apply(): LinkedEditingRangeRegistrationOptions = {
      val __obj = js.Dynamic.literal(documentSelector = null)
      __obj.asInstanceOf[LinkedEditingRangeRegistrationOptions]
    }
  }
  
  trait LinkedEditingRanges extends StObject {
    
    /**
      * A list of ranges that can be edited together. The ranges must have
      * identical length and contain identical text content. The ranges cannot overlap.
      */
    var ranges: js.Array[Range]
    
    /**
      * An optional word pattern (regular expression) that describes valid contents for
      * the given ranges. If no pattern is provided, the client configuration's word
      * pattern will be used.
      */
    var wordPattern: js.UndefOr[String] = js.undefined
  }
  object LinkedEditingRanges {
    
    inline def apply(ranges: js.Array[Range]): LinkedEditingRanges = {
      val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkedEditingRanges]
    }
    
    extension [Self <: LinkedEditingRanges](x: Self) {
      
      inline def setRanges(value: js.Array[Range]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesVarargs(value: Range*): Self = StObject.set(x, "ranges", js.Array(value*))
      
      inline def setWordPattern(value: String): Self = StObject.set(x, "wordPattern", value.asInstanceOf[js.Any])
      
      inline def setWordPatternUndefined: Self = StObject.set(x, "wordPattern", js.undefined)
    }
  }
}
