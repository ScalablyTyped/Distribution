package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.lineChartMod.LineChartProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonLineChartMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/LineChart", JSImport.Default)
  @js.native
  val default: SFC[LineChartProps] = js.native
  
  type _To = SFC[LineChartProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonLineChartMod.foo` */
  override def _to: SFC[LineChartProps] = default
}
