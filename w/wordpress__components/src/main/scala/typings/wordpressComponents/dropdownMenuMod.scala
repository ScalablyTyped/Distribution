package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import typings.wordpressComponents.dropdownMenuMod.DropdownMenu.Props
import typings.wordpressComponents.dropdownMod.Dropdown.RenderProps
import typings.wordpressComponents.popoverMod.Popover.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMenuMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/dropdown-menu", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object DropdownMenu {
    
    trait BaseProps extends StObject {
      
      /**
        * A class name to apply to the dropdown wrapper element.
        */
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * The Dashicon icon slug to be shown in the collapsed menu button.
        * @defaultValue "menu"
        */
      var icon: js.UndefOr[Icon] = js.undefined
      
      /**
        * A human-readable label to present as accessibility text on the
        * focused collapsed menu button.
        */
      var label: String
      
      /**
        * A human-readable label to present as accessibility text on the
        * expanded menu container.
        * @defaultValue value of `label`
        */
      var menuLabel: js.UndefOr[String] = js.undefined
      
      /**
        * The direction in which the menu should open. Specify y- and x-axis
        * as a space-separated string.
        * @defaultValue "top center"
        */
      var position: js.UndefOr[Position] = js.undefined
    }
    object BaseProps {
      
      inline def apply(label: String): BaseProps = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[BaseProps]
      }
      
      extension [Self <: BaseProps](x: Self) {
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setMenuLabel(value: String): Self = StObject.set(x, "menuLabel", value.asInstanceOf[js.Any])
        
        inline def setMenuLabelUndefined: Self = StObject.set(x, "menuLabel", js.undefined)
        
        inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      }
    }
    
    trait Control extends StObject {
      
      /**
        * Dashicon icon slug.
        */
      var icon: Icon
      
      /**
        * Describes whether or not the control is disabled.
        */
      var isDisabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Function to invoke when the option is selected.
        */
      def onClick(): Unit
      
      /**
        * Human-readable title for the control.
        */
      var title: String
    }
    object Control {
      
      inline def apply(icon: Icon, onClick: () => Unit, title: String): Control = {
        val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[Control]
      }
      
      extension [Self <: Control](x: Self) {
        
        inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
        
        inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
        
        inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithChildren
      - typings.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithControls
    */
    trait Props extends StObject
    object Props {
      
      inline def PropsWithChildren(children: RenderProps => Element, label: String): typings.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithChildren = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithChildren]
      }
      
      inline def PropsWithControls(controls: js.Array[Control], label: String): typings.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithControls = {
        val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithControls]
      }
    }
    
    trait PropsWithChildren
      extends StObject
         with BaseProps
         with Props {
      
      /**
        * A function render prop which should return an element or elements
        * valid for use in a `DropdownMenu`: `MenuItem`, `MenuItemsChoice`, or
        * `MenuGroup`.
        */
      def children(props: RenderProps): Element
      
      var controls: js.UndefOr[scala.Nothing] = js.undefined
    }
    object PropsWithChildren {
      
      inline def apply(children: RenderProps => Element, label: String): PropsWithChildren = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[PropsWithChildren]
      }
      
      extension [Self <: PropsWithChildren](x: Self) {
        
        inline def setChildren(value: RenderProps => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      }
    }
    
    trait PropsWithControls
      extends StObject
         with BaseProps
         with Props {
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
      
      /**
        * An array of objects describing the options to be shown in the
        * expanded menu.
        */
      var controls: js.Array[Control]
    }
    object PropsWithControls {
      
      inline def apply(controls: js.Array[Control], label: String): PropsWithControls = {
        val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[PropsWithControls]
      }
      
      extension [Self <: PropsWithControls](x: Self) {
        
        inline def setControls(value: js.Array[Control]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
        
        inline def setControlsVarargs(value: Control*): Self = StObject.set(x, "controls", js.Array(value :_*))
      }
    }
  }
}
