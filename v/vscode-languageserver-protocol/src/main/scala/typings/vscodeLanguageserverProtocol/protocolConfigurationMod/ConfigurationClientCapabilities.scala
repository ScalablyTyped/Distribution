package typings.vscodeLanguageserverProtocol.protocolConfigurationMod

import typings.vscodeLanguageserverProtocol.AnonConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationClientCapabilities extends js.Object {
  /**
    * The workspace client capabilities
    */
  var workspace: js.UndefOr[AnonConfiguration] = js.undefined
}

object ConfigurationClientCapabilities {
  @scala.inline
  def apply(workspace: AnonConfiguration = null): ConfigurationClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (workspace != null) __obj.updateDynamic("workspace")(workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationClientCapabilities]
  }
}

