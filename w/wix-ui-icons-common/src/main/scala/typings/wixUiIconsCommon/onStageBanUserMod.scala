package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.banUserMod.BanUserProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageBanUserMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/BanUser", JSImport.Default)
  @js.native
  val default: FC[BanUserProps] = js.native
  
  type _To = FC[BanUserProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageBanUserMod.foo` */
  override def _to: FC[BanUserProps] = default
}
