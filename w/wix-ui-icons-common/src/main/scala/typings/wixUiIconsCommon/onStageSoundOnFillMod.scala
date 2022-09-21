package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.soundOnFillMod.SoundOnFillProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageSoundOnFillMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/SoundOnFill", JSImport.Default)
  @js.native
  val default: FC[SoundOnFillProps] = js.native
  
  type _To = FC[SoundOnFillProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageSoundOnFillMod.foo` */
  override def _to: FC[SoundOnFillProps] = default
}
