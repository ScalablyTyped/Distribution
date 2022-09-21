package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsBrowserMod.BrowserProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Browser", JSImport.Default)
  @js.native
  val default: FC[BrowserProps] = js.native
  
  type _To = FC[BrowserProps]
  
  /* This means you don't have to write `default`, but can instead just say `browserMod.foo` */
  override def _to: FC[BrowserProps] = default
}
