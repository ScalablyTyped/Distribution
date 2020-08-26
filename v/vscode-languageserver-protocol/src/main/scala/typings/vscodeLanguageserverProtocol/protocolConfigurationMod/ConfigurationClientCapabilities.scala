package typings.vscodeLanguageserverProtocol.protocolConfigurationMod

import typings.vscodeLanguageserverProtocol.anon.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationClientCapabilities extends js.Object {
  /**
    * The workspace client capabilities
    */
  var workspace: js.UndefOr[Configuration] = js.native
}

object ConfigurationClientCapabilities {
  @scala.inline
  def apply(): ConfigurationClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationClientCapabilities]
  }
  @scala.inline
  implicit class ConfigurationClientCapabilitiesOps[Self <: ConfigurationClientCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWorkspace(value: Configuration): Self = this.set("workspace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspace: Self = this.set("workspace", js.undefined)
  }
  
}

