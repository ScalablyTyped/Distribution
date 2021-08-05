package typings.wordpressEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.wordpressEditor.postVisibilityCheckMod.PostVisibilityCheck.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postVisibilityCheckMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/post-visibility/check", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PostVisibilityCheck {
    
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
      
      def render(props: RenderProps): Element
    }
    object Props {
      
      inline def apply(render: RenderProps => Element): Props = {
        val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setRender(value: RenderProps => Element): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      }
    }
    
    trait RenderProps extends StObject {
      
      var canEdit: Boolean
    }
    object RenderProps {
      
      inline def apply(canEdit: Boolean): RenderProps = {
        val __obj = js.Dynamic.literal(canEdit = canEdit.asInstanceOf[js.Any])
        __obj.asInstanceOf[RenderProps]
      }
      
      extension [Self <: RenderProps](x: Self) {
        
        inline def setCanEdit(value: Boolean): Self = StObject.set(x, "canEdit", value.asInstanceOf[js.Any])
      }
    }
  }
}
