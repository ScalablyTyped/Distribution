package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsTwitterMod.TwitterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twitterMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Twitter", JSImport.Default)
  @js.native
  val default: FC[TwitterProps] = js.native
  
  type _To = FC[TwitterProps]
  
  /* This means you don't have to write `default`, but can instead just say `twitterMod.foo` */
  override def _to: FC[TwitterProps] = default
}
