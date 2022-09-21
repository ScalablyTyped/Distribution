package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verticalRatioMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/VerticalRatio", JSImport.Default)
  @js.native
  val default: FC[VerticalRatioProps] = js.native
  
  trait VerticalRatioProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VerticalRatioProps {
    
    inline def apply(): VerticalRatioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalRatioProps]
    }
    
    extension [Self <: VerticalRatioProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VerticalRatioProps]
  
  /* This means you don't have to write `default`, but can instead just say `verticalRatioMod.foo` */
  override def _to: FC[VerticalRatioProps] = default
}
