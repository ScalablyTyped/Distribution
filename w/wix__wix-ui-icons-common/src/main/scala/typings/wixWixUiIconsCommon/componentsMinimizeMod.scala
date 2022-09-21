package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMinimizeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/Minimize", JSImport.Default)
  @js.native
  val default: FC[MinimizeProps] = js.native
  
  trait MinimizeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MinimizeProps {
    
    inline def apply(): MinimizeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinimizeProps]
    }
    
    extension [Self <: MinimizeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MinimizeProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsMinimizeMod.foo` */
  override def _to: FC[MinimizeProps] = default
}
