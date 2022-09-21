package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.unlockMod.UnlockProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageUnlockMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/Unlock", JSImport.Default)
  @js.native
  val default: FC[UnlockProps] = js.native
  
  type _To = FC[UnlockProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageUnlockMod.foo` */
  override def _to: FC[UnlockProps] = default
}
