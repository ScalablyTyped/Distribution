package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSoundBoldMod.SoundBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object soundBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/SoundBold", JSImport.Default)
  @js.native
  val default: FC[SoundBoldProps] = js.native
  
  type _To = FC[SoundBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `soundBoldMod.foo` */
  override def _to: FC[SoundBoldProps] = default
}
