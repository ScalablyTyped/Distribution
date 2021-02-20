package typings.typedGithubApi

import typings.typedGithubApi.typedGithubApiStrings.admin
import typings.typedGithubApi.typedGithubApiStrings.closed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object teamMod {
  
  @js.native
  trait Team extends StObject {
    
    var description: String = js.native
    
    var id: Double = js.native
    
    var members_url: String = js.native
    
    var name: String = js.native
    
    var permission: admin = js.native
    
    var privacy: closed = js.native
    
    var repositories_url: String = js.native
    
    var slug: String = js.native
    
    var url: String = js.native
  }
  object Team {
    
    @scala.inline
    def apply(
      description: String,
      id: Double,
      members_url: String,
      name: String,
      permission: admin,
      privacy: closed,
      repositories_url: String,
      slug: String,
      url: String
    ): Team = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Team]
    }
    
    @scala.inline
    implicit class TeamMutableBuilder[Self <: Team] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembers_url(value: String): Self = StObject.set(x, "members_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermission(value: admin): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivacy(value: closed): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositories_url(value: String): Self = StObject.set(x, "repositories_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
