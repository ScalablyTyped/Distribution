package typings.vscodeLanguageclient.libCommonClientMod

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotshowDocumentMod.ShowDocumentParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotshowDocumentMod.ShowDocumentRequest.HandlerSignature
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotshowDocumentMod.ShowDocumentResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _WindowMiddleware extends StObject {
  
  var showDocument: js.UndefOr[
    js.ThisFunction2[
      /* this */ Unit, 
      /* params */ ShowDocumentParams, 
      /* next */ HandlerSignature, 
      js.Promise[ShowDocumentResult]
    ]
  ] = js.undefined
}
object _WindowMiddleware {
  
  inline def apply(): _WindowMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_WindowMiddleware]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: _WindowMiddleware] (val x: Self) extends AnyVal {
    
    inline def setShowDocument(
      value: js.ThisFunction2[
          /* this */ Unit, 
          /* params */ ShowDocumentParams, 
          /* next */ HandlerSignature, 
          js.Promise[ShowDocumentResult]
        ]
    ): Self = StObject.set(x, "showDocument", value.asInstanceOf[js.Any])
    
    inline def setShowDocumentUndefined: Self = StObject.set(x, "showDocument", js.undefined)
  }
}
