package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsPieChartMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PieChart", JSImport.Default)
  @js.native
  val default: FC[PieChartProps] = js.native
  
  trait PieChartProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PieChartProps {
    
    inline def apply(): PieChartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PieChartProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PieChartProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PieChartProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsPieChartMod.foo` */
  override def _to: FC[PieChartProps] = default
}
