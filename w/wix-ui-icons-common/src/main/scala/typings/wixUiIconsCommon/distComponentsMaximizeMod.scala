package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsMaximizeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Maximize", JSImport.Default)
  @js.native
  val default: FC[MaximizeProps] = js.native
  
  trait MaximizeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MaximizeProps {
    
    inline def apply(): MaximizeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaximizeProps]
    }
    
    extension [Self <: MaximizeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MaximizeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distComponentsMaximizeMod.foo` */
  override def _to: FC[MaximizeProps] = default
}
