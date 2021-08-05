package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomInSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ZoomInSmall", JSImport.Default)
  @js.native
  val default: SFC[ZoomInSmallProps] = js.native
  
  trait ZoomInSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ZoomInSmallProps {
    
    inline def apply(): ZoomInSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomInSmallProps]
    }
    
    extension [Self <: ZoomInSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ZoomInSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `zoomInSmallMod.foo` */
  override def _to: SFC[ZoomInSmallProps] = default
}
