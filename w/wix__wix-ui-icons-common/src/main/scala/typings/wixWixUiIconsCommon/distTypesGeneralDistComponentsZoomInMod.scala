package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsZoomInMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ZoomIn", JSImport.Default)
  @js.native
  val default: FC[ZoomInProps] = js.native
  
  trait ZoomInProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ZoomInProps {
    
    inline def apply(): ZoomInProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomInProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZoomInProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ZoomInProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsZoomInMod.foo` */
  override def _to: FC[ZoomInProps] = default
}
