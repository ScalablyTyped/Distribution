package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSwitchBoldMod.SwitchBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/SwitchBold", JSImport.Default)
  @js.native
  val default: FC[SwitchBoldProps] = js.native
  
  type _To = FC[SwitchBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `switchBoldMod.foo` */
  override def _to: FC[SwitchBoldProps] = default
}
