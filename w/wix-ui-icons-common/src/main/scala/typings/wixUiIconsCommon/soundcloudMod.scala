package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSoundcloudMod.SoundcloudProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object soundcloudMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Soundcloud", JSImport.Default)
  @js.native
  val default: FC[SoundcloudProps] = js.native
  
  type _To = FC[SoundcloudProps]
  
  /* This means you don't have to write `default`, but can instead just say `soundcloudMod.foo` */
  override def _to: FC[SoundcloudProps] = default
}
