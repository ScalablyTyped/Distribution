package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.componentsContrastCheckerMod.ContrastChecker.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsContrastCheckerMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/contrast-checker", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object ContrastChecker {
    
    trait Props extends StObject {
      
      var backgroundColor: js.UndefOr[String] = js.undefined
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
      
      var fallbackBackgroundColor: js.UndefOr[String] = js.undefined
      
      var fallbackTextColor: js.UndefOr[String] = js.undefined
      
      var fontSize: js.UndefOr[Double] = js.undefined
      
      var isLargeText: js.UndefOr[Boolean] = js.undefined
      
      var textColor: js.UndefOr[String] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
        
        inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
        
        inline def setFallbackBackgroundColor(value: String): Self = StObject.set(x, "fallbackBackgroundColor", value.asInstanceOf[js.Any])
        
        inline def setFallbackBackgroundColorUndefined: Self = StObject.set(x, "fallbackBackgroundColor", js.undefined)
        
        inline def setFallbackTextColor(value: String): Self = StObject.set(x, "fallbackTextColor", value.asInstanceOf[js.Any])
        
        inline def setFallbackTextColorUndefined: Self = StObject.set(x, "fallbackTextColor", js.undefined)
        
        inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
        
        inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
        
        inline def setIsLargeText(value: Boolean): Self = StObject.set(x, "isLargeText", value.asInstanceOf[js.Any])
        
        inline def setIsLargeTextUndefined: Self = StObject.set(x, "isLargeText", js.undefined)
        
        inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
        
        inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      }
    }
  }
}
