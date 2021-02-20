package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barChartSplitSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BarChartSplitSmall", JSImport.Default)
  @js.native
  val default: SFC[BarChartSplitSmallProps] = js.native
  
  @js.native
  trait BarChartSplitSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BarChartSplitSmallProps {
    
    @scala.inline
    def apply(): BarChartSplitSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BarChartSplitSmallProps]
    }
    
    @scala.inline
    implicit class BarChartSplitSmallPropsMutableBuilder[Self <: BarChartSplitSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[BarChartSplitSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `barChartSplitSmallMod.foo` */
  override def _to: SFC[BarChartSplitSmallProps] = default
}
