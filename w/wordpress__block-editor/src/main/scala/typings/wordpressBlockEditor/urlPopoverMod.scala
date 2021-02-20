package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wordpressBlockEditor.urlPopoverMod.URLPopover.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlPopoverMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/url-popover", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object URLPopover {
    
    @js.native
    trait Props
      extends typings.wordpressComponents.popoverMod.Popover.Props {
      
      var additionalControls: js.UndefOr[ReactNode] = js.native
      
      /**
        * Callback used to return the React Elements that will be rendered inside the settings
        * drawer. When this function is provided, a toggle button will be rendered in the popover
        * that allows the user to open and close the settings drawer.
        */
      var renderSettings: js.UndefOr[js.Function0[Element]] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(Props: typings.wordpressComponents.popoverMod.Popover.Props): Props = {
        val __obj = js.Dynamic.literal()
        js.Dynamic.global.Object.assign(__obj, Props)
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdditionalControls(value: ReactNode): Self = StObject.set(x, "additionalControls", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAdditionalControlsUndefined: Self = StObject.set(x, "additionalControls", js.undefined)
        
        @scala.inline
        def setRenderSettings(value: () => Element): Self = StObject.set(x, "renderSettings", js.Any.fromFunction0(value))
        
        @scala.inline
        def setRenderSettingsUndefined: Self = StObject.set(x, "renderSettings", js.undefined)
      }
    }
  }
}
