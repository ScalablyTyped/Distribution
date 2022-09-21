package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSocialBarMod.SocialBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socialBarMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/SocialBar", JSImport.Default)
  @js.native
  val default: FC[SocialBarProps] = js.native
  
  type _To = FC[SocialBarProps]
  
  /* This means you don't have to write `default`, but can instead just say `socialBarMod.foo` */
  override def _to: FC[SocialBarProps] = default
}
