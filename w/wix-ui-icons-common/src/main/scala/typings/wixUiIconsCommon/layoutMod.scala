package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsLayoutMod.LayoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Layout", JSImport.Default)
  @js.native
  val default: FC[LayoutProps] = js.native
  
  type _To = FC[LayoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `layoutMod.foo` */
  override def _to: FC[LayoutProps] = default
}
