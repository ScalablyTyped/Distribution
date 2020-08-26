package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.basic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicAuthenticationSecurity
  extends BaseSecurity
     with Security {
  @JSName("type")
  var type_BasicAuthenticationSecurity: basic = js.native
}

object BasicAuthenticationSecurity {
  @scala.inline
  def apply(`type`: basic): BasicAuthenticationSecurity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicAuthenticationSecurity]
  }
  @scala.inline
  implicit class BasicAuthenticationSecurityOps[Self <: BasicAuthenticationSecurity] (val x: Self) extends AnyVal {
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
    def setType(value: basic): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

