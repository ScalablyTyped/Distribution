package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsRedoMod.RedoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redoMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Redo", JSImport.Default)
  @js.native
  val default: FC[RedoProps] = js.native
  
  type _To = FC[RedoProps]
  
  /* This means you don't have to write `default`, but can instead just say `redoMod.foo` */
  override def _to: FC[RedoProps] = default
}
