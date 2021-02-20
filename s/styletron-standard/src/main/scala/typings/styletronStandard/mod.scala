package typings.styletronStandard

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("styletron-standard", "driver")
  @js.native
  def driver(style: StyleObject, styletron: StandardEngine): String = js.native
  
  @JSImport("styletron-standard", "getInitialStyle")
  @js.native
  def getInitialStyle(): StyleObject = js.native
  
  @JSImport("styletron-standard", "renderDeclarativeRules")
  @js.native
  def renderDeclarativeRules(style: StyleObject, styletrong: StandardEngine): StyleObject = js.native
  
  type FontFace = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.AtRule.FontFace */ js.Any
  
  /* Inlined styletron-standard.styletron-standard.KeyframesPercentageObject & {  from :styletron-standard.styletron-standard.Properties | undefined,   to :styletron-standard.styletron-standard.Properties | undefined} */
  @js.native
  trait KeyframesObject extends /* key */ StringDictionary[Properties] {
    
    var from: js.UndefOr[Properties] = js.native
    
    var to: js.UndefOr[Properties] = js.native
  }
  object KeyframesObject {
    
    @scala.inline
    def apply(): KeyframesObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyframesObject]
    }
    
    @scala.inline
    implicit class KeyframesObjectMutableBuilder[Self <: KeyframesObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: Properties): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setTo(value: Properties): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  type KeyframesPercentageObject = StringDictionary[Properties]
  
  type Properties = typings.csstype.mod.Properties[String | Double]
  
  @js.native
  trait StandardEngine extends StObject {
    
    def renderFontFace(fontFace: FontFace): String = js.native
    
    def renderKeyframes(keyframes: KeyframesObject): String = js.native
    
    def renderStyle(style: StyleObject): String = js.native
  }
  object StandardEngine {
    
    @scala.inline
    def apply(
      renderFontFace: FontFace => String,
      renderKeyframes: KeyframesObject => String,
      renderStyle: StyleObject => String
    ): StandardEngine = {
      val __obj = js.Dynamic.literal(renderFontFace = js.Any.fromFunction1(renderFontFace), renderKeyframes = js.Any.fromFunction1(renderKeyframes), renderStyle = js.Any.fromFunction1(renderStyle))
      __obj.asInstanceOf[StandardEngine]
    }
    
    @scala.inline
    implicit class StandardEngineMutableBuilder[Self <: StandardEngine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRenderFontFace(value: FontFace => String): Self = StObject.set(x, "renderFontFace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderKeyframes(value: KeyframesObject => String): Self = StObject.set(x, "renderKeyframes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderStyle(value: StyleObject => String): Self = StObject.set(x, "renderStyle", js.Any.fromFunction1(value))
    }
  }
  
  type StyleObject = Properties with typings.styletronStandard.styletronStandardStrings.StyleObject with TopLevel[js.Any]
}
