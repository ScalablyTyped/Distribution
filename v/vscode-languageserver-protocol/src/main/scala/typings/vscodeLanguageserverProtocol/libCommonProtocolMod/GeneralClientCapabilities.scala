package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.anon.Cancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneralClientCapabilities extends StObject {
  
  /**
    * Client capabilities specific to the client's markdown parser.
    *
    * @since 3.16.0
    */
  var markdown: js.UndefOr[MarkdownClientCapabilities] = js.undefined
  
  /**
    * The position encodings supported by the client. Client and server
    * have to agree on the same position encoding to ensure that offsets
    * (e.g. character position in a line) are interpreted the same on both
    * sides.
    *
    * To keep the protocol backwards compatible the following applies: if
    * the value 'utf-16' is missing from the array of position encodings
    * servers can assume that the client supports UTF-16. UTF-16 is
    * therefore a mandatory encoding.
    *
    * If omitted it defaults to ['utf-16'].
    *
    * Implementation considerations: since the conversion from one encoding
    * into another requires the content of the file / line the conversion
    * is best done where the file is read which is usually on the server
    * side.
    *
    * @since 3.17.0
    */
  var positionEncodings: js.UndefOr[js.Array[PositionEncodingKind]] = js.undefined
  
  /**
    * Client capabilities specific to regular expressions.
    *
    * @since 3.16.0
    */
  var regularExpressions: js.UndefOr[RegularExpressionsClientCapabilities] = js.undefined
  
  /**
    * Client capability that signals how the client
    * handles stale requests (e.g. a request
    * for which the client will not process the response
    * anymore since the information is outdated).
    *
    * @since 3.17.0
    */
  var staleRequestSupport: js.UndefOr[Cancel] = js.undefined
}
object GeneralClientCapabilities {
  
  inline def apply(): GeneralClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneralClientCapabilities]
  }
  
  extension [Self <: GeneralClientCapabilities](x: Self) {
    
    inline def setMarkdown(value: MarkdownClientCapabilities): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
    
    inline def setMarkdownUndefined: Self = StObject.set(x, "markdown", js.undefined)
    
    inline def setPositionEncodings(value: js.Array[PositionEncodingKind]): Self = StObject.set(x, "positionEncodings", value.asInstanceOf[js.Any])
    
    inline def setPositionEncodingsUndefined: Self = StObject.set(x, "positionEncodings", js.undefined)
    
    inline def setPositionEncodingsVarargs(value: PositionEncodingKind*): Self = StObject.set(x, "positionEncodings", js.Array(value*))
    
    inline def setRegularExpressions(value: RegularExpressionsClientCapabilities): Self = StObject.set(x, "regularExpressions", value.asInstanceOf[js.Any])
    
    inline def setRegularExpressionsUndefined: Self = StObject.set(x, "regularExpressions", js.undefined)
    
    inline def setStaleRequestSupport(value: Cancel): Self = StObject.set(x, "staleRequestSupport", value.asInstanceOf[js.Any])
    
    inline def setStaleRequestSupportUndefined: Self = StObject.set(x, "staleRequestSupport", js.undefined)
  }
}
