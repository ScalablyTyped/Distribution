package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleOnSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/ToggleOnSmall", JSImport.Default)
  @js.native
  val default: FC[ToggleOnSmallProps] = js.native
  
  trait ToggleOnSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ToggleOnSmallProps {
    
    inline def apply(): ToggleOnSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleOnSmallProps]
    }
    
    extension [Self <: ToggleOnSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ToggleOnSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `toggleOnSmallMod.foo` */
  override def _to: FC[ToggleOnSmallProps] = default
}
