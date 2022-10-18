package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wordpressBlockEditor.componentsUrlPopoverMod.URLPopover.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsUrlPopoverMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/url-popover", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object URLPopover {
    
    trait Props
      extends StObject
         with typings.wordpressComponents.popoverMod.Popover.Props {
      
      var additionalControls: js.UndefOr[ReactNode] = js.undefined
      
      /**
        * Callback used to return the React Elements that will be rendered inside the settings
        * drawer. When this function is provided, a toggle button will be rendered in the popover
        * that allows the user to open and close the settings drawer.
        */
      var renderSettings: js.UndefOr[js.Function0[Element]] = js.undefined
    }
    object Props {
      
      inline def apply(Props: typings.wordpressComponents.popoverMod.Popover.Props): Props = {
        val __obj = js.Dynamic.literal()
        js.Dynamic.global.Object.assign(__obj, Props)
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setAdditionalControls(value: ReactNode): Self = StObject.set(x, "additionalControls", value.asInstanceOf[js.Any])
        
        inline def setAdditionalControlsUndefined: Self = StObject.set(x, "additionalControls", js.undefined)
        
        inline def setRenderSettings(value: () => Element): Self = StObject.set(x, "renderSettings", js.Any.fromFunction0(value))
        
        inline def setRenderSettingsUndefined: Self = StObject.set(x, "renderSettings", js.undefined)
      }
    }
  }
}
