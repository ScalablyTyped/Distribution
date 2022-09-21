package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableChartColRowMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/TableChartColRow", JSImport.Default)
  @js.native
  val default: FC[TableChartColRowProps] = js.native
  
  trait TableChartColRowProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TableChartColRowProps {
    
    inline def apply(): TableChartColRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableChartColRowProps]
    }
    
    extension [Self <: TableChartColRowProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TableChartColRowProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableChartColRowMod.foo` */
  override def _to: FC[TableChartColRowProps] = default
}
