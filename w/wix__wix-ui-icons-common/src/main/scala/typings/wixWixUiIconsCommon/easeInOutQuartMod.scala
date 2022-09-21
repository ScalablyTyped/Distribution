package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object easeInOutQuartMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/EaseInOutQuart", JSImport.Default)
  @js.native
  val default: FC[EaseInOutQuartProps] = js.native
  
  trait EaseInOutQuartProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object EaseInOutQuartProps {
    
    inline def apply(): EaseInOutQuartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EaseInOutQuartProps]
    }
    
    extension [Self <: EaseInOutQuartProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[EaseInOutQuartProps]
  
  /* This means you don't have to write `default`, but can instead just say `easeInOutQuartMod.foo` */
  override def _to: FC[EaseInOutQuartProps] = default
}
