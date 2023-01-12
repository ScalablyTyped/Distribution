package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsZoomOutSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ZoomOutSmall", JSImport.Default)
  @js.native
  val default: FC[ZoomOutSmallProps] = js.native
  
  trait ZoomOutSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ZoomOutSmallProps {
    
    inline def apply(): ZoomOutSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomOutSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZoomOutSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ZoomOutSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsZoomOutSmallMod.foo` */
  override def _to: FC[ZoomOutSmallProps] = default
}
