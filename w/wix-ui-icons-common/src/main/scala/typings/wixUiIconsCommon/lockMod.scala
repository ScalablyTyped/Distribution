package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.distComponentsLockMod.LockProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lockMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Lock", JSImport.Default)
  @js.native
  val default: FC[LockProps] = js.native
  
  type _To = FC[LockProps]
  
  /* This means you don't have to write `default`, but can instead just say `lockMod.foo` */
  override def _to: FC[LockProps] = default
}
