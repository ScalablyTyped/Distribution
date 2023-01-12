package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.wordpressComponents.navigableContainerTabbableMod.TabbableContainer.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigableContainerTabbableMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/navigable-container/tabbable", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object TabbableContainer {
    
    trait Props
      extends StObject
         with HTMLProps[HTMLDivElement] {
      
      @JSName("children")
      var children_Props: ReactNode
      
      /**
        * A boolean which tells the component whether or not to cycle from the
        * end back to the beginning and vice versa.
        * @defaultValue true
        */
      var cycle: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A callback invoked when the menu navigates to one of its children
        * passing the index and child as an argument.
        */
      var onNavigate: js.UndefOr[js.Function2[/* nextIndex */ Double, /* focusedElement */ HTMLElement, Unit]] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setCycle(value: Boolean): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
        
        inline def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
        
        inline def setOnNavigate(value: (/* nextIndex */ Double, /* focusedElement */ HTMLElement) => Unit): Self = StObject.set(x, "onNavigate", js.Any.fromFunction2(value))
        
        inline def setOnNavigateUndefined: Self = StObject.set(x, "onNavigate", js.undefined)
      }
    }
  }
}
