package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineChartSplitMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LineChartSplit", JSImport.Default)
  @js.native
  val default: SFC[LineChartSplitProps] = js.native
  
  @js.native
  trait LineChartSplitProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LineChartSplitProps {
    
    @scala.inline
    def apply(): LineChartSplitProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineChartSplitProps]
    }
    
    @scala.inline
    implicit class LineChartSplitPropsMutableBuilder[Self <: LineChartSplitProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[LineChartSplitProps]
  
  /* This means you don't have to write `default`, but can instead just say `lineChartSplitMod.foo` */
  override def _to: SFC[LineChartSplitProps] = default
}
