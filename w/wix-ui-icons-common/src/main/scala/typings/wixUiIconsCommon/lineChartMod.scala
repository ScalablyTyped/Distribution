package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineChartMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LineChart", JSImport.Default)
  @js.native
  val default: SFC[LineChartProps] = js.native
  
  trait LineChartProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object LineChartProps {
    
    @scala.inline
    def apply(): LineChartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineChartProps]
    }
    
    @scala.inline
    implicit class LineChartPropsMutableBuilder[Self <: LineChartProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[LineChartProps]
  
  /* This means you don't have to write `default`, but can instead just say `lineChartMod.foo` */
  override def _to: SFC[LineChartProps] = default
}
