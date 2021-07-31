package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.std.Record
import typings.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts.Props
import typings.wordpressComponents.wordpressComponentsBooleans.`true`
import typings.wordpressComponents.wordpressComponentsStrings.keydown
import typings.wordpressComponents.wordpressComponentsStrings.keypress
import typings.wordpressComponents.wordpressComponentsStrings.keyup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardShortcutsMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/keyboard-shortcuts", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object KeyboardShortcuts {
    
    trait BaseProps extends StObject {
      
      /**
        * By default, a callback will not be invoked if the key combination
        * occurs in an editable field. Pass `bindGlobal` as `true` if the key
        * events should be observed globally, including within editable fields.
        */
      var bindGlobal: js.UndefOr[Boolean] = js.undefined
      
      /**
        * By default, a callback is invoked in response to the `keydown` event.
        * To override this, pass `eventName` with the name of a specific keyboard
        * event.
        */
      var eventName: js.UndefOr[keydown | keypress | keyup] = js.undefined
      
      /**
        * An object of shortcut bindings, where each key is a keyboard
        * combination, the value of which is the callback to be invoked when
        * the key combination is pressed.
        *
        * NOTE: The value of each shortcut should be a consistent function
        * reference, not an anonymous function. Otherwise, the callback will
        * not be correctly unbound when the component unmounts.
        *
        * NOTE: The `KeyboardShortcuts` component will not update to reflect a
        * changed `shortcuts` prop. If you need to change shortcuts, mount a
        * separate `KeyboardShortcuts` element, which can be achieved by
        * assigning a unique `key` prop.
        */
      var shortcuts: Record[String, js.Function0[Unit]]
    }
    object BaseProps {
      
      @scala.inline
      def apply(shortcuts: Record[String, js.Function0[Unit]]): BaseProps = {
        val __obj = js.Dynamic.literal(shortcuts = shortcuts.asInstanceOf[js.Any])
        __obj.asInstanceOf[BaseProps]
      }
      
      @scala.inline
      implicit class BasePropsMutableBuilder[Self <: BaseProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBindGlobal(value: Boolean): Self = StObject.set(x, "bindGlobal", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBindGlobalUndefined: Self = StObject.set(x, "bindGlobal", js.undefined)
        
        @scala.inline
        def setEventName(value: keydown | keypress | keyup): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
        
        @scala.inline
        def setShortcuts(value: Record[String, js.Function0[Unit]]): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts.PropsWithChildren
      - typings.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts.PropsWithoutChildren
    */
    trait Props extends StObject
    object Props {
      
      @scala.inline
      def PropsWithChildren(shortcuts: Record[String, js.Function0[Unit]]): typings.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts.PropsWithChildren = {
        val __obj = js.Dynamic.literal(shortcuts = shortcuts.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts.PropsWithChildren]
      }
      
      @scala.inline
      def PropsWithoutChildren(shortcuts: Record[String, js.Function0[Unit]]): typings.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts.PropsWithoutChildren = {
        val __obj = js.Dynamic.literal(bindGlobal = true, shortcuts = shortcuts.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts.PropsWithoutChildren]
      }
    }
    
    trait PropsWithChildren
      extends StObject
         with BaseProps
         with Props {
      
      var children: ReactNode
    }
    object PropsWithChildren {
      
      @scala.inline
      def apply(shortcuts: Record[String, js.Function0[Unit]]): PropsWithChildren = {
        val __obj = js.Dynamic.literal(shortcuts = shortcuts.asInstanceOf[js.Any])
        __obj.asInstanceOf[PropsWithChildren]
      }
      
      @scala.inline
      implicit class PropsWithChildrenMutableBuilder[Self <: PropsWithChildren] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      }
    }
    
    trait PropsWithoutChildren
      extends StObject
         with BaseProps
         with Props {
      
      @JSName("bindGlobal")
      var bindGlobal_PropsWithoutChildren: `true`
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
    }
    object PropsWithoutChildren {
      
      @scala.inline
      def apply(shortcuts: Record[String, js.Function0[Unit]]): PropsWithoutChildren = {
        val __obj = js.Dynamic.literal(bindGlobal = true, shortcuts = shortcuts.asInstanceOf[js.Any])
        __obj.asInstanceOf[PropsWithoutChildren]
      }
      
      @scala.inline
      implicit class PropsWithoutChildrenMutableBuilder[Self <: PropsWithoutChildren] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBindGlobal(value: `true`): Self = StObject.set(x, "bindGlobal", value.asInstanceOf[js.Any])
      }
    }
  }
}
