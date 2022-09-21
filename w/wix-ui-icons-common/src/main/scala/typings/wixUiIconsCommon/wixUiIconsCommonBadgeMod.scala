package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.distComponentsBadgeMod.BadgeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonBadgeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Badge", JSImport.Default)
  @js.native
  val default: FC[BadgeProps] = js.native
  
  type _To = FC[BadgeProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonBadgeMod.foo` */
  override def _to: FC[BadgeProps] = default
}
