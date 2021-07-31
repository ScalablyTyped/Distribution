package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.integrationsMod.IntegrationsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonIntegrationsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Integrations", JSImport.Default)
  @js.native
  val default: SFC[IntegrationsProps] = js.native
  
  type _To = SFC[IntegrationsProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonIntegrationsMod.foo` */
  override def _to: SFC[IntegrationsProps] = default
}
