package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsTumblrMod.TumblrProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tumblrMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Tumblr", JSImport.Default)
  @js.native
  val default: FC[TumblrProps] = js.native
  
  type _To = FC[TumblrProps]
  
  /* This means you don't have to write `default`, but can instead just say `tumblrMod.foo` */
  override def _to: FC[TumblrProps] = default
}
