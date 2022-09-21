package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cameraLargeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/system/dist/components/CameraLarge", JSImport.Default)
  @js.native
  val default: FC[CameraLargeProps] = js.native
  
  trait CameraLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CameraLargeProps {
    
    inline def apply(): CameraLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CameraLargeProps]
    }
    
    extension [Self <: CameraLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CameraLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `cameraLargeMod.foo` */
  override def _to: FC[CameraLargeProps] = default
}
