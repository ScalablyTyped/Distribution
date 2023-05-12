package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressComponents.baseControlMod.BaseControl.ControlProps
import typings.wordpressComponents.toggleControlMod.ToggleControl.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleControlMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/toggle-control", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object ToggleControl {
    
    trait Props
      extends StObject
         with ControlProps {
      
      /**
        * If checked is `true` the toggle will be checked. If checked is
        * `false` the toggle will be unchecked. If no value is passed the
        * toggle will be unchecked.
        */
      var checked: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If disabled, the toggle will be grayed out and won't be available
        * for user interaction.
        */
      var disabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A function that receives the checked state as input.
        */
      var onChange: js.UndefOr[js.Function1[/* isChecked */ Boolean, Unit]] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
        
        inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
        
        inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        inline def setOnChange(value: /* isChecked */ Boolean => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
        
        inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      }
    }
  }
}
