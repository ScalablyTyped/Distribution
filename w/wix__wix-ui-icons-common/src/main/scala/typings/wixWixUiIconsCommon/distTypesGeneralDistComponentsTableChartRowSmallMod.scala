package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsTableChartRowSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/TableChartRowSmall", JSImport.Default)
  @js.native
  val default: FC[TableChartRowSmallProps] = js.native
  
  trait TableChartRowSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TableChartRowSmallProps {
    
    inline def apply(): TableChartRowSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableChartRowSmallProps]
    }
    
    extension [Self <: TableChartRowSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TableChartRowSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsTableChartRowSmallMod.foo` */
  override def _to: FC[TableChartRowSmallProps] = default
}
