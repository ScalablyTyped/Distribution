package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsDesktopSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/DesktopSmall", JSImport.Default)
  @js.native
  val default: FC[DesktopSmallProps] = js.native
  
  trait DesktopSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DesktopSmallProps {
    
    inline def apply(): DesktopSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DesktopSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DesktopSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DesktopSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsDesktopSmallMod.foo` */
  override def _to: FC[DesktopSmallProps] = default
}
