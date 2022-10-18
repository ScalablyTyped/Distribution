package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.componentsBlockIconMod.BlockIcon.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsBlockIconMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/block-icon", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object BlockIcon {
    
    trait Props extends StObject {
      
      var className: js.UndefOr[String] = js.undefined
      
      var icon: /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/components.@wordpress/components/icon.Icon.Props<any>['icon'] */ js.Any
      
      var showColors: js.UndefOr[Boolean] = js.undefined
    }
    object Props {
      
      inline def apply(
        icon: /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/components.@wordpress/components/icon.Icon.Props<any>['icon'] */ js.Any
      ): Props = {
        val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setIcon(
          value: /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/components.@wordpress/components/icon.Icon.Props<any>['icon'] */ js.Any
        ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setShowColors(value: Boolean): Self = StObject.set(x, "showColors", value.asInstanceOf[js.Any])
        
        inline def setShowColorsUndefined: Self = StObject.set(x, "showColors", js.undefined)
      }
    }
  }
}
