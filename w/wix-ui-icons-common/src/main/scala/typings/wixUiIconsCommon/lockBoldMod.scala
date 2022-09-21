package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsLockBoldMod.LockBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lockBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/LockBold", JSImport.Default)
  @js.native
  val default: FC[LockBoldProps] = js.native
  
  type _To = FC[LockBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `lockBoldMod.foo` */
  override def _to: FC[LockBoldProps] = default
}
