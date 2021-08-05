package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomOutMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ZoomOut", JSImport.Default)
  @js.native
  val default: SFC[ZoomOutProps] = js.native
  
  trait ZoomOutProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ZoomOutProps {
    
    inline def apply(): ZoomOutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomOutProps]
    }
    
    extension [Self <: ZoomOutProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ZoomOutProps]
  
  /* This means you don't have to write `default`, but can instead just say `zoomOutMod.foo` */
  override def _to: SFC[ZoomOutProps] = default
}
