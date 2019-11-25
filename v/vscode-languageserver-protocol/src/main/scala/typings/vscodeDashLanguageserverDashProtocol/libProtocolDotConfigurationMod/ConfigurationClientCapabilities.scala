package typings.vscodeDashLanguageserverDashProtocol.libProtocolDotConfigurationMod

import typings.vscodeDashLanguageserverDashProtocol.Anon_Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationClientCapabilities extends js.Object {
  /**
    * The workspace client capabilities
    */
  var workspace: js.UndefOr[Anon_Configuration] = js.undefined
}

object ConfigurationClientCapabilities {
  @scala.inline
  def apply(workspace: Anon_Configuration = null): ConfigurationClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (workspace != null) __obj.updateDynamic("workspace")(workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationClientCapabilities]
  }
}

