package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.notificationsSmallMod.NotificationsSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageNotificationsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/NotificationsSmall", JSImport.Default)
  @js.native
  val default: FC[NotificationsSmallProps] = js.native
  
  type _To = FC[NotificationsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageNotificationsSmallMod.foo` */
  override def _to: FC[NotificationsSmallProps] = default
}
