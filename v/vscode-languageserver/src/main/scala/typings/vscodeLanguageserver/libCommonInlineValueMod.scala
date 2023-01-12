package typings.vscodeLanguageserver

import typings.vscodeLanguageserver.anon.OnRefresh
import typings.vscodeLanguageserver.libCommonServerMod.Feature
import typings.vscodeLanguageserver.libCommonServerMod._Languages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonInlineValueMod {
  
  @JSImport("vscode-languageserver/lib/common/inlineValue", "InlineValueFeature")
  @js.native
  val InlineValueFeature: Feature[_Languages, InlineValueFeatureShape] = js.native
  
  trait InlineValueFeatureShape extends StObject {
    
    var inlineValue: OnRefresh
  }
  object InlineValueFeatureShape {
    
    inline def apply(inlineValue: OnRefresh): InlineValueFeatureShape = {
      val __obj = js.Dynamic.literal(inlineValue = inlineValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineValueFeatureShape]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InlineValueFeatureShape] (val x: Self) extends AnyVal {
      
      inline def setInlineValue(value: OnRefresh): Self = StObject.set(x, "inlineValue", value.asInstanceOf[js.Any])
    }
  }
}
