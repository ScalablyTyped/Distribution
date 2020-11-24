package typings.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebApiTeam extends WebApiTeamRef {
  
  /**
    * Team description
    */
  var description: String = js.native
  
  /**
    * Identity REST API Url to this team
    */
  var identityUrl: String = js.native
}
object WebApiTeam {
  
  @scala.inline
  def apply(description: String, id: String, identityUrl: String, name: String, url: String): WebApiTeam = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identityUrl = identityUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebApiTeam]
  }
  
  @scala.inline
  implicit class WebApiTeamOps[Self <: WebApiTeam] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityUrl(value: String): Self = this.set("identityUrl", value.asInstanceOf[js.Any])
  }
}
