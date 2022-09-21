package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableChartRowMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/TableChartRow", JSImport.Default)
  @js.native
  val default: FC[TableChartRowProps] = js.native
  
  trait TableChartRowProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TableChartRowProps {
    
    inline def apply(): TableChartRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableChartRowProps]
    }
    
    extension [Self <: TableChartRowProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TableChartRowProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableChartRowMod.foo` */
  override def _to: FC[TableChartRowProps] = default
}
