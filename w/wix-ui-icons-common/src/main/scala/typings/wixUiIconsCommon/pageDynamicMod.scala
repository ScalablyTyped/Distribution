package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPageDynamicMod.PageDynamicProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageDynamicMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/PageDynamic", JSImport.Default)
  @js.native
  val default: FC[PageDynamicProps] = js.native
  
  type _To = FC[PageDynamicProps]
  
  /* This means you don't have to write `default`, but can instead just say `pageDynamicMod.foo` */
  override def _to: FC[PageDynamicProps] = default
}
