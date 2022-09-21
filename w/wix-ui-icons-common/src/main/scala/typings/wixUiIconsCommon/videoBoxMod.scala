package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsVideoBoxMod.VideoBoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoBoxMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/VideoBox", JSImport.Default)
  @js.native
  val default: FC[VideoBoxProps] = js.native
  
  type _To = FC[VideoBoxProps]
  
  /* This means you don't have to write `default`, but can instead just say `videoBoxMod.foo` */
  override def _to: FC[VideoBoxProps] = default
}
