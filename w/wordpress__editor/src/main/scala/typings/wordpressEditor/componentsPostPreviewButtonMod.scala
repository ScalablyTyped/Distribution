package typings.wordpressEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressEditor.componentsPostPreviewButtonMod.PostPreviewButton.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsPostPreviewButtonMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/post-preview-button", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PostPreviewButton {
    
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
      
      var forceIsAutosaveable: js.UndefOr[Boolean] = js.undefined
      
      var forcePreviewLink: js.UndefOr[String] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        inline def setForceIsAutosaveable(value: Boolean): Self = StObject.set(x, "forceIsAutosaveable", value.asInstanceOf[js.Any])
        
        inline def setForceIsAutosaveableUndefined: Self = StObject.set(x, "forceIsAutosaveable", js.undefined)
        
        inline def setForcePreviewLink(value: String): Self = StObject.set(x, "forcePreviewLink", value.asInstanceOf[js.Any])
        
        inline def setForcePreviewLinkUndefined: Self = StObject.set(x, "forcePreviewLink", js.undefined)
      }
    }
  }
}
