package typings.styletronStandard

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("styletron-standard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def driver(style: StyleObject, styletron: StandardEngine): String = (^.asInstanceOf[js.Dynamic].applyDynamic("driver")(style.asInstanceOf[js.Any], styletron.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getInitialStyle(): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialStyle")().asInstanceOf[StyleObject]
  
  @scala.inline
  def renderDeclarativeRules(style: StyleObject, styletrong: StandardEngine): StyleObject = (^.asInstanceOf[js.Dynamic].applyDynamic("renderDeclarativeRules")(style.asInstanceOf[js.Any], styletrong.asInstanceOf[js.Any])).asInstanceOf[StyleObject]
  
  type FontFace = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.AtRule.FontFace */ js.Any
  
  trait KeyframesObject
    extends StObject
       with KeyframesPercentageObject {
    
    var from: js.UndefOr[Properties] = js.undefined
    
    var to: js.UndefOr[Properties] = js.undefined
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
  
  trait StandardEngine extends StObject {
    
    def renderFontFace(fontFace: FontFace): String
    
    def renderKeyframes(keyframes: KeyframesObject): String
    
    def renderStyle(style: StyleObject): String
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
  
  type StyleObject = Properties & typings.styletronStandard.styletronStandardStrings.StyleObject & TopLevel[js.Any]
}
