package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsQuickActionBarMod.QuickActionBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quickActionBarMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/QuickActionBar", JSImport.Default)
  @js.native
  val default: FC[QuickActionBarProps] = js.native
  
  type _To = FC[QuickActionBarProps]
  
  /* This means you don't have to write `default`, but can instead just say `quickActionBarMod.foo` */
  override def _to: FC[QuickActionBarProps] = default
}
