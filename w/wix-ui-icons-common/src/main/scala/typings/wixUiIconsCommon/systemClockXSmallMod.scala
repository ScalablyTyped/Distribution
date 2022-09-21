package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.clockXSmallMod.ClockXSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemClockXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/ClockXSmall", JSImport.Default)
  @js.native
  val default: FC[ClockXSmallProps] = js.native
  
  type _To = FC[ClockXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemClockXSmallMod.foo` */
  override def _to: FC[ClockXSmallProps] = default
}
