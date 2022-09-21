package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsResetMod.ResetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resetMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Reset", JSImport.Default)
  @js.native
  val default: FC[ResetProps] = js.native
  
  type _To = FC[ResetProps]
  
  /* This means you don't have to write `default`, but can instead just say `resetMod.foo` */
  override def _to: FC[ResetProps] = default
}
