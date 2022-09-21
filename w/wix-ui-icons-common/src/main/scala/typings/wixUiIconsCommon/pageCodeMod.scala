package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPageCodeMod.PageCodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageCodeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/PageCode", JSImport.Default)
  @js.native
  val default: FC[PageCodeProps] = js.native
  
  type _To = FC[PageCodeProps]
  
  /* This means you don't have to write `default`, but can instead just say `pageCodeMod.foo` */
  override def _to: FC[PageCodeProps] = default
}
