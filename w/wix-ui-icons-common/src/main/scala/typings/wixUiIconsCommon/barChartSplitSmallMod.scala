package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barChartSplitSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BarChartSplitSmall", JSImport.Default)
  @js.native
  val default: FC[BarChartSplitSmallProps] = js.native
  
  trait BarChartSplitSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BarChartSplitSmallProps {
    
    inline def apply(): BarChartSplitSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BarChartSplitSmallProps]
    }
    
    extension [Self <: BarChartSplitSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BarChartSplitSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `barChartSplitSmallMod.foo` */
  override def _to: FC[BarChartSplitSmallProps] = default
}
