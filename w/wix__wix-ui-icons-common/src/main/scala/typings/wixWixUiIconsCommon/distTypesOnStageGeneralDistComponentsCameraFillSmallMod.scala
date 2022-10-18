package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageGeneralDistComponentsCameraFillSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/CameraFillSmall", JSImport.Default)
  @js.native
  val default: FC[CameraFillSmallProps] = js.native
  
  trait CameraFillSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CameraFillSmallProps {
    
    inline def apply(): CameraFillSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CameraFillSmallProps]
    }
    
    extension [Self <: CameraFillSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CameraFillSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageGeneralDistComponentsCameraFillSmallMod.foo` */
  override def _to: FC[CameraFillSmallProps] = default
}
