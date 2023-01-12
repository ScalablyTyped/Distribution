package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.wordpressComponents.panelMod.Panel.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/panel", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Panel {
    
    trait Props extends StObject {
      
      var children: ReactNode
      
      /**
        * The class that will be added with `components-panel`. If no
        * `className` is passed only `components-panel__body` and `is-opened`
        * is used.
        */
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * Title of the `Panel`. Text will be rendered inside an `<h2>` tag.
        */
      var header: js.UndefOr[String] = js.undefined
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
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
        
        inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      }
    }
  }
}
