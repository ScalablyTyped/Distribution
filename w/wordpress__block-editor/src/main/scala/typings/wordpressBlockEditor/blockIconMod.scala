package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.blockIconMod.BlockIcon.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockIconMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/block-icon", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object BlockIcon {
    
    @js.native
    trait Props extends StObject {
      
      var className: js.UndefOr[String] = js.native
      
      var icon: /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/components.@wordpress/components/icon.Icon.Props<any>['icon'] */ js.Any = js.native
      
      var showColors: js.UndefOr[Boolean] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(
        icon: /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/components.@wordpress/components/icon.Icon.Props<any>['icon'] */ js.Any
      ): Props = {
        val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setIcon(
          value: /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/components.@wordpress/components/icon.Icon.Props<any>['icon'] */ js.Any
        ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowColors(value: Boolean): Self = StObject.set(x, "showColors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowColorsUndefined: Self = StObject.set(x, "showColors", js.undefined)
      }
    }
  }
}
