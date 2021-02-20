package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object photoCameraSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PhotoCameraSmall", JSImport.Default)
  @js.native
  val default: SFC[PhotoCameraSmallProps] = js.native
  
  @js.native
  trait PhotoCameraSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PhotoCameraSmallProps {
    
    @scala.inline
    def apply(): PhotoCameraSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhotoCameraSmallProps]
    }
    
    @scala.inline
    implicit class PhotoCameraSmallPropsMutableBuilder[Self <: PhotoCameraSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[PhotoCameraSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `photoCameraSmallMod.foo` */
  override def _to: SFC[PhotoCameraSmallProps] = default
}
