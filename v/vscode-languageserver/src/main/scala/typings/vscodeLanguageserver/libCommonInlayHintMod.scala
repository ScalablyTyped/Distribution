package typings.vscodeLanguageserver

import typings.vscodeLanguageserver.anon.Refresh
import typings.vscodeLanguageserver.libCommonServerMod.Feature
import typings.vscodeLanguageserver.libCommonServerMod._Languages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonInlayHintMod {
  
  @JSImport("vscode-languageserver/lib/common/inlayHint", "InlayHintFeature")
  @js.native
  val InlayHintFeature: Feature[_Languages, InlayHintFeatureShape] = js.native
  
  trait InlayHintFeatureShape extends StObject {
    
    var inlayHint: Refresh
  }
  object InlayHintFeatureShape {
    
    inline def apply(inlayHint: Refresh): InlayHintFeatureShape = {
      val __obj = js.Dynamic.literal(inlayHint = inlayHint.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlayHintFeatureShape]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InlayHintFeatureShape] (val x: Self) extends AnyVal {
      
      inline def setInlayHint(value: Refresh): Self = StObject.set(x, "inlayHint", value.asInstanceOf[js.Any])
    }
  }
}
