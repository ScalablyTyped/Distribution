package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressComponents.buttonMod.Button.ButtonProps
import typings.wordpressComponents.clipboardButtonMod.ClipboardButton.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipboardButtonMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/clipboard-button", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object ClipboardButton {
    
    trait Props
      extends StObject
         with ButtonProps {
      
      /**
        * Function to be called when copy starts.
        */
      @JSName("onCopy")
      var onCopy_Props: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /**
        * Function to be called when copy finishes.
        */
      var onFinishCopy: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /**
        * Text to be copied to the clipboard on click.
        */
      var text: String
    }
    object Props {
      
      inline def apply(text: String): Props = {
        val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setOnCopy(value: () => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction0(value))
        
        inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
        
        inline def setOnFinishCopy(value: () => Unit): Self = StObject.set(x, "onFinishCopy", js.Any.fromFunction0(value))
        
        inline def setOnFinishCopyUndefined: Self = StObject.set(x, "onFinishCopy", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      }
    }
  }
}
