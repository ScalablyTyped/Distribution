package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleOnMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/ToggleOn", JSImport.Default)
  @js.native
  val default: FC[ToggleOnProps] = js.native
  
  trait ToggleOnProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ToggleOnProps {
    
    inline def apply(): ToggleOnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleOnProps]
    }
    
    extension [Self <: ToggleOnProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ToggleOnProps]
  
  /* This means you don't have to write `default`, but can instead just say `toggleOnMod.foo` */
  override def _to: FC[ToggleOnProps] = default
}
