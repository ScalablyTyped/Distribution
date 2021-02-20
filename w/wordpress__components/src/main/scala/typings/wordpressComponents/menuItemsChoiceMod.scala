package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressComponents.menuItemsChoiceMod.MenuItemsChoice.Props
import typings.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemsChoiceMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/menu-items-choice", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object MenuItemsChoice {
    
    @js.native
    trait Choice extends StObject {
      
      /**
        * Human-readable label for choice.
        */
      var label: String = js.native
      
      /**
        * Optional keyboard sequence to trigger choice with keyboard shortcut
        * (e.g. `ctrl+s`).
        */
      var shortcut: js.UndefOr[ShortcutType] = js.native
      
      /**
        * Unique value for choice.
        */
      var value: String = js.native
    }
    object Choice {
      
      @scala.inline
      def apply(label: String, value: String): Choice = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Choice]
      }
      
      @scala.inline
      implicit class ChoiceMutableBuilder[Self <: Choice] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShortcut(value: ShortcutType): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Props extends StObject {
      
      /**
        * Array of choices.
        */
      var choices: js.Array[Choice] = js.native
      
      /**
        * Callback function to be called with the selected choice when user
        * selects a new choice.
        */
      def onSelect(value: String): Unit = js.native
      
      /**
        * Value of currently selected choice (should match a `value` property
        * from a choice in `choices`).
        */
      var value: String = js.native
    }
    object Props {
      
      @scala.inline
      def apply(choices: js.Array[Choice], onSelect: String => Unit, value: String): Props = {
        val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect), value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChoices(value: js.Array[Choice]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChoicesVarargs(value: Choice*): Self = StObject.set(x, "choices", js.Array(value :_*))
        
        @scala.inline
        def setOnSelect(value: String => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
}
