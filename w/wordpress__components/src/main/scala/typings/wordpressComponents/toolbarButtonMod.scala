package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.wordpressComponents.anon.PartialProps
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import typings.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import typings.wordpressComponents.toolbarButtonMod.ToolbarButton.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarButtonMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/toolbar-button", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object ToolbarButton {
    
    /* Inlined parent @wordpress/components.@wordpress/components/dropdown-menu.default.Control */
    /* Inlined parent std.Pick<@wordpress/components.@wordpress/components/icon-button.default.Props, 'shortcut'> */
    trait Props extends StObject {
      
      /**
        * Anything to add into the containing element after the button.
        */
      var children: js.UndefOr[ReactNode] = js.undefined
      
      /**
        * `className` for the button element.
        */
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * `className` for the container.
        */
      var containerClassName: js.UndefOr[String] = js.undefined
      
      /**
        * Any additional props to pass down to `IconButton`.
        */
      var extraProps: js.UndefOr[PartialProps] = js.undefined
      
      /**
        * Dashicon icon slug.
        */
      var icon: Icon
      
      /**
        * Describes whether or not the button is active.
        */
      var isActive: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Describes whether or not the control is disabled.
        */
      var isDisabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Function to invoke when the option is selected.
        */
      def onClick(): Unit
      
      var shortcut: js.UndefOr[ShortcutType] = js.undefined
      
      /**
        * Subscript text to add to the button.
        */
      var subscript: js.UndefOr[String] = js.undefined
      
      /**
        * Human-readable title for the control.
        */
      var title: String
    }
    object Props {
      
      @scala.inline
      def apply(icon: Icon, onClick: () => Unit, title: String): Props = {
        val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
        
        @scala.inline
        def setExtraProps(value: PartialProps): Self = StObject.set(x, "extraProps", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExtraPropsUndefined: Self = StObject.set(x, "extraProps", js.undefined)
        
        @scala.inline
        def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
        
        @scala.inline
        def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
        
        @scala.inline
        def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
        
        @scala.inline
        def setShortcut(value: ShortcutType): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
        
        @scala.inline
        def setSubscript(value: String): Self = StObject.set(x, "subscript", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubscriptUndefined: Self = StObject.set(x, "subscript", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
  }
}
