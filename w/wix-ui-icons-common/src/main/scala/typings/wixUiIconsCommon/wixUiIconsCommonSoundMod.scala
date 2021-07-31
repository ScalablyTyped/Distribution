package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.soundMod.SoundProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonSoundMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Sound", JSImport.Default)
  @js.native
  val default: SFC[SoundProps] = js.native
  
  type _To = SFC[SoundProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonSoundMod.foo` */
  override def _to: SFC[SoundProps] = default
}
