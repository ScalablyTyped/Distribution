package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object funnelChartSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FunnelChartSmall", JSImport.Default)
  @js.native
  val default: SFC[FunnelChartSmallProps] = js.native
  
  trait FunnelChartSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object FunnelChartSmallProps {
    
    inline def apply(): FunnelChartSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FunnelChartSmallProps]
    }
    
    extension [Self <: FunnelChartSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FunnelChartSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `funnelChartSmallMod.foo` */
  override def _to: SFC[FunnelChartSmallProps] = default
}
