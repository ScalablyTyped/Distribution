package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsPhotoCameraSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PhotoCameraSmall", JSImport.Default)
  @js.native
  val default: FC[PhotoCameraSmallProps] = js.native
  
  trait PhotoCameraSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PhotoCameraSmallProps {
    
    inline def apply(): PhotoCameraSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhotoCameraSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhotoCameraSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PhotoCameraSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsPhotoCameraSmallMod.foo` */
  override def _to: FC[PhotoCameraSmallProps] = default
}
