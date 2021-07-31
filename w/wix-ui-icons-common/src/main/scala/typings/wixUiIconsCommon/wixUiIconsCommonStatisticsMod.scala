package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.statisticsMod.StatisticsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonStatisticsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Statistics", JSImport.Default)
  @js.native
  val default: SFC[StatisticsProps] = js.native
  
  type _To = SFC[StatisticsProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonStatisticsMod.foo` */
  override def _to: SFC[StatisticsProps] = default
}
