package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.oauth2
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth2PasswordSecurity
  extends BaseOAuthSecurity
     with Security {
  @JSName("flow")
  var flow_OAuth2PasswordSecurity: password = js.native
  var tokenUrl: String = js.native
}

object OAuth2PasswordSecurity {
  @scala.inline
  def apply(flow: password, tokenUrl: String, `type`: oauth2): OAuth2PasswordSecurity = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2PasswordSecurity]
  }
  @scala.inline
  implicit class OAuth2PasswordSecurityOps[Self <: OAuth2PasswordSecurity] (val x: Self) extends AnyVal {
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
    def setFlow(value: password): Self = this.set("flow", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokenUrl(value: String): Self = this.set("tokenUrl", value.asInstanceOf[js.Any])
  }
  
}

