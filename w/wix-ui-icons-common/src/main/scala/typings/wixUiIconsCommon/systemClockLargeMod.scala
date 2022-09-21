package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.clockLargeMod.ClockLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemClockLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/ClockLarge", JSImport.Default)
  @js.native
  val default: FC[ClockLargeProps] = js.native
  
  type _To = FC[ClockLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemClockLargeMod.foo` */
  override def _to: FC[ClockLargeProps] = default
}
