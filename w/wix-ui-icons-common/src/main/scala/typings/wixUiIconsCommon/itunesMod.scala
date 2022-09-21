package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsItunesMod.ITunesProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itunesMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ITunes", JSImport.Default)
  @js.native
  val default: FC[ITunesProps] = js.native
  
  type _To = FC[ITunesProps]
  
  /* This means you don't have to write `default`, but can instead just say `itunesMod.foo` */
  override def _to: FC[ITunesProps] = default
}
