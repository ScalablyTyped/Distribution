package typings.vscodeLanguageserver

import typings.vscodeLanguageserver.libCommonServerMod.Feature
import typings.vscodeLanguageserver.libCommonServerMod._RemoteWindow
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotshowDocumentMod.ShowDocumentParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotshowDocumentMod.ShowDocumentResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonShowDocumentMod {
  
  @JSImport("vscode-languageserver/lib/common/showDocument", "ShowDocumentFeature")
  @js.native
  val ShowDocumentFeature: Feature[_RemoteWindow, ShowDocumentFeatureShape] = js.native
  
  trait ShowDocumentFeatureShape extends StObject {
    
    def showDocument(params: ShowDocumentParams): js.Promise[ShowDocumentResult]
  }
  object ShowDocumentFeatureShape {
    
    inline def apply(showDocument: ShowDocumentParams => js.Promise[ShowDocumentResult]): ShowDocumentFeatureShape = {
      val __obj = js.Dynamic.literal(showDocument = js.Any.fromFunction1(showDocument))
      __obj.asInstanceOf[ShowDocumentFeatureShape]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShowDocumentFeatureShape] (val x: Self) extends AnyVal {
      
      inline def setShowDocument(value: ShowDocumentParams => js.Promise[ShowDocumentResult]): Self = StObject.set(x, "showDocument", js.Any.fromFunction1(value))
    }
  }
}
