package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsHelpMod.HelpProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Help", JSImport.Default)
  @js.native
  val default: FC[HelpProps] = js.native
  
  type _To = FC[HelpProps]
  
  /* This means you don't have to write `default`, but can instead just say `helpMod.foo` */
  override def _to: FC[HelpProps] = default
}
