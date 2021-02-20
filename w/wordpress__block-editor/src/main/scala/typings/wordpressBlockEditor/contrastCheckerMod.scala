package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.contrastCheckerMod.ContrastChecker.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contrastCheckerMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/contrast-checker", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object ContrastChecker {
    
    @js.native
    trait Props extends StObject {
      
      var backgroundColor: js.UndefOr[String] = js.native
      
      var children: js.UndefOr[scala.Nothing] = js.native
      
      var fallbackBackgroundColor: js.UndefOr[String] = js.native
      
      var fallbackTextColor: js.UndefOr[String] = js.native
      
      var fontSize: js.UndefOr[Double] = js.native
      
      var isLargeText: js.UndefOr[Boolean] = js.native
      
      var textColor: js.UndefOr[String] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
        
        @scala.inline
        def setFallbackBackgroundColor(value: String): Self = StObject.set(x, "fallbackBackgroundColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFallbackBackgroundColorUndefined: Self = StObject.set(x, "fallbackBackgroundColor", js.undefined)
        
        @scala.inline
        def setFallbackTextColor(value: String): Self = StObject.set(x, "fallbackTextColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFallbackTextColorUndefined: Self = StObject.set(x, "fallbackTextColor", js.undefined)
        
        @scala.inline
        def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
        
        @scala.inline
        def setIsLargeText(value: Boolean): Self = StObject.set(x, "isLargeText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsLargeTextUndefined: Self = StObject.set(x, "isLargeText", js.undefined)
        
        @scala.inline
        def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      }
    }
  }
}
