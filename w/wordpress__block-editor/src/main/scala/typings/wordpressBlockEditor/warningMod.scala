package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactFragment
import typings.react.mod.ReactNode
import typings.wordpressBlockEditor.anon.OnClick
import typings.wordpressBlockEditor.warningMod.Warning.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warningMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/warning", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Warning {
    
    trait Props extends StObject {
      
      var actions: js.UndefOr[ReactFragment] = js.undefined
      
      var children: ReactNode
      
      var className: js.UndefOr[String] = js.undefined
      
      var secondaryActions: js.UndefOr[js.Array[OnClick]] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setActions(value: ReactFragment): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
        
        inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
        
        inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setSecondaryActions(value: js.Array[OnClick]): Self = StObject.set(x, "secondaryActions", value.asInstanceOf[js.Any])
        
        inline def setSecondaryActionsUndefined: Self = StObject.set(x, "secondaryActions", js.undefined)
        
        inline def setSecondaryActionsVarargs(value: OnClick*): Self = StObject.set(x, "secondaryActions", js.Array(value :_*))
      }
    }
  }
}
