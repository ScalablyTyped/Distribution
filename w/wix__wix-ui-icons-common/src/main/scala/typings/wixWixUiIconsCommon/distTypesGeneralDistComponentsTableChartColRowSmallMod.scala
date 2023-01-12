package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsTableChartColRowSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/TableChartColRowSmall", JSImport.Default)
  @js.native
  val default: FC[TableChartColRowSmallProps] = js.native
  
  trait TableChartColRowSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TableChartColRowSmallProps {
    
    inline def apply(): TableChartColRowSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableChartColRowSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableChartColRowSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TableChartColRowSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsTableChartColRowSmallMod.foo` */
  override def _to: FC[TableChartColRowSmallProps] = default
}
