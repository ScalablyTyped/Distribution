package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsHeatmapChartSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HeatmapChartSmall", JSImport.Default)
  @js.native
  val default: FC[HeatmapChartSmallProps] = js.native
  
  trait HeatmapChartSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HeatmapChartSmallProps {
    
    inline def apply(): HeatmapChartSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeatmapChartSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeatmapChartSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HeatmapChartSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsHeatmapChartSmallMod.foo` */
  override def _to: FC[HeatmapChartSmallProps] = default
}
