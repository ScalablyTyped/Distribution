package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.clockSmallMod.ClockSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageClockSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/ClockSmall", JSImport.Default)
  @js.native
  val default: FC[ClockSmallProps] = js.native
  
  type _To = FC[ClockSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageClockSmallMod.foo` */
  override def _to: FC[ClockSmallProps] = default
}
