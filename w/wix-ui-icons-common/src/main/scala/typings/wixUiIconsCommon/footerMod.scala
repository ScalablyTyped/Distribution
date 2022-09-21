package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsFooterMod.FooterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object footerMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Footer", JSImport.Default)
  @js.native
  val default: FC[FooterProps] = js.native
  
  type _To = FC[FooterProps]
  
  /* This means you don't have to write `default`, but can instead just say `footerMod.foo` */
  override def _to: FC[FooterProps] = default
}
