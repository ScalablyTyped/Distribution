package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableChartSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TableChartSmall", JSImport.Default)
  @js.native
  val default: SFC[TableChartSmallProps] = js.native
  
  trait TableChartSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TableChartSmallProps {
    
    @scala.inline
    def apply(): TableChartSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableChartSmallProps]
    }
    
    @scala.inline
    implicit class TableChartSmallPropsMutableBuilder[Self <: TableChartSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TableChartSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableChartSmallMod.foo` */
  override def _to: SFC[TableChartSmallProps] = default
}
