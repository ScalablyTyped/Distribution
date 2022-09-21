package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsShoutoutMod.ShoutoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shoutoutMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Shoutout", JSImport.Default)
  @js.native
  val default: FC[ShoutoutProps] = js.native
  
  type _To = FC[ShoutoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `shoutoutMod.foo` */
  override def _to: FC[ShoutoutProps] = default
}
