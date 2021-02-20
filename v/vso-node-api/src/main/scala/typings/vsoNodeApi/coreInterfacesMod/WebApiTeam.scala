package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
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
  implicit class WebApiTeamMutableBuilder[Self <: WebApiTeam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityUrl(value: String): Self = StObject.set(x, "identityUrl", value.asInstanceOf[js.Any])
  }
}
