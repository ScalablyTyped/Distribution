package typings.vscodeLanguageserverProtocol.protocolConfigurationMod

import typings.vscodeLanguageserverProtocol.anon.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationClientCapabilities extends js.Object {
  /**
    * The workspace client capabilities
    */
  var workspace: js.UndefOr[Configuration] = js.undefined
}

object ConfigurationClientCapabilities {
  @scala.inline
  def apply(workspace: Configuration = null): ConfigurationClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (workspace != null) __obj.updateDynamic("workspace")(workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationClientCapabilities]
  }
}

