package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressComponents.menuMod.NavigableMenu.Props
import typings.wordpressComponents.wordpressComponentsStrings.both
import typings.wordpressComponents.wordpressComponentsStrings.horizontal
import typings.wordpressComponents.wordpressComponentsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/navigable-container/menu", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object NavigableMenu {
    
    trait Props
      extends StObject
         with typings.wordpressComponents.tabbableMod.TabbableContainer.Props {
      
      /**
        * The orientation of the menu.
        * @defaultValue "vertical"
        */
      var orientation: js.UndefOr[vertical | horizontal | both] = js.undefined
    }
    object Props {
      
      inline def apply(Props: typings.wordpressComponents.tabbableMod.TabbableContainer.Props): Props = {
        val __obj = js.Dynamic.literal()
        js.Dynamic.global.Object.assign(__obj, Props)
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setOrientation(value: vertical | horizontal | both): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
        
        inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      }
    }
  }
}
