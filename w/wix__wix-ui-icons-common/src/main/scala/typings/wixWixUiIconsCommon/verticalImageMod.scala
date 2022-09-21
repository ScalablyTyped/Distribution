package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verticalImageMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/VerticalImage", JSImport.Default)
  @js.native
  val default: FC[VerticalImageProps] = js.native
  
  trait VerticalImageProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VerticalImageProps {
    
    inline def apply(): VerticalImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalImageProps]
    }
    
    extension [Self <: VerticalImageProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VerticalImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `verticalImageMod.foo` */
  override def _to: FC[VerticalImageProps] = default
}
