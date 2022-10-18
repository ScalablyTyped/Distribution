package typings.vscodeLanguageserver

import typings.vscodeJsonrpc.libCommonDisposableMod.Disposable
import typings.vscodeLanguageserver.libCommonServerMod.Feature
import typings.vscodeLanguageserver.libCommonServerMod.ServerRequestHandler
import typings.vscodeLanguageserver.libCommonServerMod._Languages
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotlinkedEditingRangeMod.LinkedEditingRangeParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotlinkedEditingRangeMod.LinkedEditingRanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonLinkedEditingRangeMod {
  
  @JSImport("vscode-languageserver/lib/common/linkedEditingRange", "LinkedEditingRangeFeature")
  @js.native
  val LinkedEditingRangeFeature: Feature[_Languages, LinkedEditingRangeFeatureShape] = js.native
  
  trait LinkedEditingRangeFeatureShape extends StObject {
    
    /**
      * Installs a handler for the linked editing range request.
      *
      * @param handler The corresponding handler.
      */
    def onLinkedEditingRange(
      handler: ServerRequestHandler[
          LinkedEditingRangeParams, 
          js.UndefOr[LinkedEditingRanges | Null], 
          scala.Nothing, 
          scala.Nothing
        ]
    ): Disposable
  }
  object LinkedEditingRangeFeatureShape {
    
    inline def apply(
      onLinkedEditingRange: ServerRequestHandler[
          LinkedEditingRangeParams, 
          js.UndefOr[LinkedEditingRanges | Null], 
          scala.Nothing, 
          scala.Nothing
        ] => Disposable
    ): LinkedEditingRangeFeatureShape = {
      val __obj = js.Dynamic.literal(onLinkedEditingRange = js.Any.fromFunction1(onLinkedEditingRange))
      __obj.asInstanceOf[LinkedEditingRangeFeatureShape]
    }
    
    extension [Self <: LinkedEditingRangeFeatureShape](x: Self) {
      
      inline def setOnLinkedEditingRange(
        value: ServerRequestHandler[
              LinkedEditingRangeParams, 
              js.UndefOr[LinkedEditingRanges | Null], 
              scala.Nothing, 
              scala.Nothing
            ] => Disposable
      ): Self = StObject.set(x, "onLinkedEditingRange", js.Any.fromFunction1(value))
    }
  }
}
