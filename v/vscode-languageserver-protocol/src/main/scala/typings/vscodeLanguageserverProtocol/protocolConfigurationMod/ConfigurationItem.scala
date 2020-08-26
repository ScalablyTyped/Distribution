package typings.vscodeLanguageserverProtocol.protocolConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationItem extends js.Object {
  /**
    * The scope to get the configuration section for.
    */
  var scopeUri: js.UndefOr[String] = js.native
  /**
    * The configuration section asked for.
    */
  var section: js.UndefOr[String] = js.native
}

object ConfigurationItem {
  @scala.inline
  def apply(): ConfigurationItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationItem]
  }
  @scala.inline
  implicit class ConfigurationItemOps[Self <: ConfigurationItem] (val x: Self) extends AnyVal {
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
    def setScopeUri(value: String): Self = this.set("scopeUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopeUri: Self = this.set("scopeUri", js.undefined)
    @scala.inline
    def setSection(value: String): Self = this.set("section", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSection: Self = this.set("section", js.undefined)
  }
  
}

