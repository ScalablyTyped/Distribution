package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsMusicMod.MusicProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object musicMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Music", JSImport.Default)
  @js.native
  val default: FC[MusicProps] = js.native
  
  type _To = FC[MusicProps]
  
  /* This means you don't have to write `default`, but can instead just say `musicMod.foo` */
  override def _to: FC[MusicProps] = default
}
