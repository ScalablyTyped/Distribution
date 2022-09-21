package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsLinkMod.LinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Link", JSImport.Default)
  @js.native
  val default: FC[LinkProps] = js.native
  
  type _To = FC[LinkProps]
  
  /* This means you don't have to write `default`, but can instead just say `linkMod.foo` */
  override def _to: FC[LinkProps] = default
}
