package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsFunnelChartSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/FunnelChartSmall", JSImport.Default)
  @js.native
  val default: FC[FunnelChartSmallProps] = js.native
  
  trait FunnelChartSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FunnelChartSmallProps {
    
    inline def apply(): FunnelChartSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FunnelChartSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FunnelChartSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FunnelChartSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsFunnelChartSmallMod.foo` */
  override def _to: FC[FunnelChartSmallProps] = default
}
