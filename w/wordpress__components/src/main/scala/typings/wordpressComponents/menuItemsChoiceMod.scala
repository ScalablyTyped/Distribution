package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressComponents.menuItemsChoiceMod.MenuItemsChoice.Props
import typings.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    trait Choice extends StObject {
      
      /**
        * Human-readable label for choice.
        */
      var label: String
      
      /**
        * Optional keyboard sequence to trigger choice with keyboard shortcut
        * (e.g. `ctrl+s`).
        */
      var shortcut: js.UndefOr[ShortcutType] = js.undefined
      
      /**
        * Unique value for choice.
        */
      var value: String
    }
    object Choice {
      
      inline def apply(label: String, value: String): Choice = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Choice]
      }
      
      extension [Self <: Choice](x: Self) {
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setShortcut(value: ShortcutType): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
        
        inline def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    trait Props extends StObject {
      
      /**
        * Array of choices.
        */
      var choices: js.Array[Choice]
      
      /**
        * Callback function to be called with the selected choice when user
        * selects a new choice.
        */
      def onSelect(value: String): Unit
      
      /**
        * Value of currently selected choice (should match a `value` property
        * from a choice in `choices`).
        */
      var value: String
    }
    object Props {
      
      inline def apply(choices: js.Array[Choice], onSelect: String => Unit, value: String): Props = {
        val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect), value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setChoices(value: js.Array[Choice]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
        
        inline def setChoicesVarargs(value: Choice*): Self = StObject.set(x, "choices", js.Array(value :_*))
        
        inline def setOnSelect(value: String => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
}
