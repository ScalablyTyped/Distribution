package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressComponents.shortcutMod.Shortcut.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shortcutMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/shortcut", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Shortcut {
    
    @js.native
    trait Props extends StObject {
      
      var className: js.UndefOr[String] = js.native
      
      var shortcut: js.UndefOr[ShortcutType] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setShortcut(value: ShortcutType): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
      }
    }
    
    @js.native
    trait ShortcutObj extends StObject {
      
      /**
        * Optional `aria-label` for the `<span>` element.
        */
      var ariaLabel: js.UndefOr[String] = js.native
      
      /**
        * The visible text.
        */
      var display: String = js.native
    }
    object ShortcutObj {
      
      @scala.inline
      def apply(display: String): ShortcutObj = {
        val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any])
        __obj.asInstanceOf[ShortcutObj]
      }
      
      @scala.inline
      implicit class ShortcutObjMutableBuilder[Self <: ShortcutObj] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
        
        @scala.inline
        def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      }
    }
    
    type ShortcutType = String | ShortcutObj
  }
}
