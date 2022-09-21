package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPageMod.PageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Page", JSImport.Default)
  @js.native
  val default: FC[PageProps] = js.native
  
  type _To = FC[PageProps]
  
  /* This means you don't have to write `default`, but can instead just say `pageMod.foo` */
  override def _to: FC[PageProps] = default
}
