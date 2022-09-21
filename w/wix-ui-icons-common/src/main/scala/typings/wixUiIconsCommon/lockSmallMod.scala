package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsLockSmallMod.LockSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lockSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/LockSmall", JSImport.Default)
  @js.native
  val default: FC[LockSmallProps] = js.native
  
  type _To = FC[LockSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `lockSmallMod.foo` */
  override def _to: FC[LockSmallProps] = default
}
