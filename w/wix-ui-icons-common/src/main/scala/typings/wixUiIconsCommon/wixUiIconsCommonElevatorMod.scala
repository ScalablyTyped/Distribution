package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.elevatorMod.ElevatorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonElevatorMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Elevator", JSImport.Default)
  @js.native
  val default: FC[ElevatorProps] = js.native
  
  type _To = FC[ElevatorProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonElevatorMod.foo` */
  override def _to: FC[ElevatorProps] = default
}
