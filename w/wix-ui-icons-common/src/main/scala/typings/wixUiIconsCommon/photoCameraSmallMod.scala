package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object photoCameraSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PhotoCameraSmall", JSImport.Default)
  @js.native
  val default: SFC[PhotoCameraSmallProps] = js.native
  
  trait PhotoCameraSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object PhotoCameraSmallProps {
    
    inline def apply(): PhotoCameraSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhotoCameraSmallProps]
    }
    
    extension [Self <: PhotoCameraSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[PhotoCameraSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `photoCameraSmallMod.foo` */
  override def _to: SFC[PhotoCameraSmallProps] = default
}
