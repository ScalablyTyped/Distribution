package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsPhotoCameraMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/PhotoCamera", JSImport.Default)
  @js.native
  val default: FC[PhotoCameraProps] = js.native
  
  trait PhotoCameraProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PhotoCameraProps {
    
    inline def apply(): PhotoCameraProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhotoCameraProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhotoCameraProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PhotoCameraProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsPhotoCameraMod.foo` */
  override def _to: FC[PhotoCameraProps] = default
}
