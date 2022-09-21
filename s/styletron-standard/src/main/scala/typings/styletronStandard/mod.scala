package typings.styletronStandard

import org.scalablytyped.runtime.TopLevel
import typings.styletronStandard.styleTypesMod.FontFace
import typings.styletronStandard.styleTypesMod.KeyframesObject
import typings.styletronStandard.styleTypesMod.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("styletron-standard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def driver(style: StyleObject, styletron: StandardEngine): String = (^.asInstanceOf[js.Dynamic].applyDynamic("driver")(style.asInstanceOf[js.Any], styletron.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getInitialStyle(): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialStyle")().asInstanceOf[StyleObject]
  
  inline def renderDeclarativeRules(style: StyleObject, styletron: StandardEngine): StyleObject = (^.asInstanceOf[js.Dynamic].applyDynamic("renderDeclarativeRules")(style.asInstanceOf[js.Any], styletron.asInstanceOf[js.Any])).asInstanceOf[StyleObject]
  
  trait StandardEngine extends StObject {
    
    def renderFontFace(fontFace: FontFace): String
    
    def renderKeyframes(keyframes: KeyframesObject): String
    
    def renderStyle(style: StyleObject): String
  }
  object StandardEngine {
    
    inline def apply(
      renderFontFace: FontFace => String,
      renderKeyframes: KeyframesObject => String,
      renderStyle: StyleObject => String
    ): StandardEngine = {
      val __obj = js.Dynamic.literal(renderFontFace = js.Any.fromFunction1(renderFontFace), renderKeyframes = js.Any.fromFunction1(renderKeyframes), renderStyle = js.Any.fromFunction1(renderStyle))
      __obj.asInstanceOf[StandardEngine]
    }
    
    extension [Self <: StandardEngine](x: Self) {
      
      inline def setRenderFontFace(value: FontFace => String): Self = StObject.set(x, "renderFontFace", js.Any.fromFunction1(value))
      
      inline def setRenderKeyframes(value: KeyframesObject => String): Self = StObject.set(x, "renderKeyframes", js.Any.fromFunction1(value))
      
      inline def setRenderStyle(value: StyleObject => String): Self = StObject.set(x, "renderStyle", js.Any.fromFunction1(value))
    }
  }
  
  type StyleObject = Properties & typings.styletronStandard.styletronStandardStrings.StyleObject & TopLevel[Any]
}
