package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableChartColMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/TableChartCol", JSImport.Default)
  @js.native
  val default: FC[TableChartColProps] = js.native
  
  trait TableChartColProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TableChartColProps {
    
    inline def apply(): TableChartColProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableChartColProps]
    }
    
    extension [Self <: TableChartColProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TableChartColProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableChartColMod.foo` */
  override def _to: FC[TableChartColProps] = default
}
