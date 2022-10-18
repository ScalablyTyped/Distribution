package typings.typedGithubApi

import typings.typedGithubApi.typedGithubApiStrings.admin
import typings.typedGithubApi.typedGithubApiStrings.closed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiInterfacesTeamMod {
  
  trait Team extends StObject {
    
    var description: String
    
    var id: Double
    
    var members_url: String
    
    var name: String
    
    var permission: admin
    
    var privacy: closed
    
    var repositories_url: String
    
    var slug: String
    
    var url: String
  }
  object Team {
    
    inline def apply(
      description: String,
      id: Double,
      members_url: String,
      name: String,
      repositories_url: String,
      slug: String,
      url: String
    ): Team = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], permission = "admin", privacy = "closed", repositories_url = repositories_url.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Team]
    }
    
    extension [Self <: Team](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMembers_url(value: String): Self = StObject.set(x, "members_url", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPermission(value: admin): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
      
      inline def setPrivacy(value: closed): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
      
      inline def setRepositories_url(value: String): Self = StObject.set(x, "repositories_url", value.asInstanceOf[js.Any])
      
      inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
