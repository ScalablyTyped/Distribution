package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsDeleteMod.DeleteProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Delete", JSImport.Default)
  @js.native
  val default: FC[DeleteProps] = js.native
  
  type _To = FC[DeleteProps]
  
  /* This means you don't have to write `default`, but can instead just say `deleteMod.foo` */
  override def _to: FC[DeleteProps] = default
}
