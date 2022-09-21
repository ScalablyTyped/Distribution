package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsWixForumMod.WixForumProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixForumMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/WixForum", JSImport.Default)
  @js.native
  val default: FC[WixForumProps] = js.native
  
  type _To = FC[WixForumProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixForumMod.foo` */
  override def _to: FC[WixForumProps] = default
}
