package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.externalLinkMod.ExternalLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonExternalLinkMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/ExternalLink", JSImport.Default)
  @js.native
  val default: FC[ExternalLinkProps] = js.native
  
  type _To = FC[ExternalLinkProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonExternalLinkMod.foo` */
  override def _to: FC[ExternalLinkProps] = default
}
