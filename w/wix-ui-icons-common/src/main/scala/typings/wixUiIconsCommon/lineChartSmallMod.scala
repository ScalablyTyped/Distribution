package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineChartSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LineChartSmall", JSImport.Default)
  @js.native
  val default: SFC[LineChartSmallProps] = js.native
  
  @js.native
  trait LineChartSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LineChartSmallProps {
    
    @scala.inline
    def apply(): LineChartSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineChartSmallProps]
    }
    
    @scala.inline
    implicit class LineChartSmallPropsMutableBuilder[Self <: LineChartSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[LineChartSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `lineChartSmallMod.foo` */
  override def _to: SFC[LineChartSmallProps] = default
}
