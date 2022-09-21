package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsHelpBoldMod.HelpBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/HelpBold", JSImport.Default)
  @js.native
  val default: FC[HelpBoldProps] = js.native
  
  type _To = FC[HelpBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `helpBoldMod.foo` */
  override def _to: FC[HelpBoldProps] = default
}
