package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsDesktopMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Desktop", JSImport.Default)
  @js.native
  val default: FC[DesktopProps] = js.native
  
  trait DesktopProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DesktopProps {
    
    inline def apply(): DesktopProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DesktopProps]
    }
    
    extension [Self <: DesktopProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DesktopProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsDesktopMod.foo` */
  override def _to: FC[DesktopProps] = default
}
