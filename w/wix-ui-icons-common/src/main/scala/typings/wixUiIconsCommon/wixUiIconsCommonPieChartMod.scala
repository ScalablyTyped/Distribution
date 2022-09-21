package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.pieChartMod.PieChartProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonPieChartMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/PieChart", JSImport.Default)
  @js.native
  val default: FC[PieChartProps] = js.native
  
  type _To = FC[PieChartProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonPieChartMod.foo` */
  override def _to: FC[PieChartProps] = default
}
