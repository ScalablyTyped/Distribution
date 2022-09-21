package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineChartSplitSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/LineChartSplitSmall", JSImport.Default)
  @js.native
  val default: FC[LineChartSplitSmallProps] = js.native
  
  trait LineChartSplitSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LineChartSplitSmallProps {
    
    inline def apply(): LineChartSplitSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineChartSplitSmallProps]
    }
    
    extension [Self <: LineChartSplitSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LineChartSplitSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `lineChartSplitSmallMod.foo` */
  override def _to: FC[LineChartSplitSmallProps] = default
}
