package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.externalLinkLargeMod.ExternalLinkLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemExternalLinkLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/ExternalLinkLarge", JSImport.Default)
  @js.native
  val default: FC[ExternalLinkLargeProps] = js.native
  
  type _To = FC[ExternalLinkLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemExternalLinkLargeMod.foo` */
  override def _to: FC[ExternalLinkLargeProps] = default
}
