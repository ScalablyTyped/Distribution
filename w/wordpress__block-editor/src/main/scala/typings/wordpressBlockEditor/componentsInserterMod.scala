package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.wordpressBlockEditor.componentsInserterMod.Inserter.Props
import typings.wordpressComponents.dropdownMod.Dropdown.RenderProps
import typings.wordpressComponents.popoverMod.Popover.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsInserterMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/inserter", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Inserter {
    
    /* Inlined parent std.Partial<std.Pick<@wordpress/components.@wordpress/components.Dropdown.Props, 'position' | 'renderToggle'>> */
    trait Props extends StObject {
      
      var clientId: js.UndefOr[String] = js.undefined
      
      var disabled: js.UndefOr[Boolean] = js.undefined
      
      var isAppender: js.UndefOr[Boolean] = js.undefined
      
      var onToggle: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.undefined
      
      var position: js.UndefOr[Position] = js.undefined
      
      var renderToggle: js.UndefOr[js.Function1[/* props */ RenderProps, Element]] = js.undefined
      
      var rootClientId: js.UndefOr[String] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
        
        inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
        
        inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        inline def setIsAppender(value: Boolean): Self = StObject.set(x, "isAppender", value.asInstanceOf[js.Any])
        
        inline def setIsAppenderUndefined: Self = StObject.set(x, "isAppender", js.undefined)
        
        inline def setOnToggle(value: /* isOpen */ Boolean => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
        
        inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
        
        inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setRenderToggle(value: /* props */ RenderProps => Element): Self = StObject.set(x, "renderToggle", js.Any.fromFunction1(value))
        
        inline def setRenderToggleUndefined: Self = StObject.set(x, "renderToggle", js.undefined)
        
        inline def setRootClientId(value: String): Self = StObject.set(x, "rootClientId", value.asInstanceOf[js.Any])
        
        inline def setRootClientIdUndefined: Self = StObject.set(x, "rootClientId", js.undefined)
      }
    }
  }
}
