package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitRefFavorite extends StObject {
  
  var _links: js.Any
  
  var id: Double
  
  var identityId: String
  
  var name: String
  
  var repositoryId: String
  
  var `type`: RefFavoriteType
  
  var url: String
}
object GitRefFavorite {
  
  @scala.inline
  def apply(
    _links: js.Any,
    id: Double,
    identityId: String,
    name: String,
    repositoryId: String,
    `type`: RefFavoriteType,
    url: String
  ): GitRefFavorite = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identityId = identityId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRefFavorite]
  }
  
  @scala.inline
  implicit class GitRefFavoriteMutableBuilder[Self <: GitRefFavorite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityId(value: String): Self = StObject.set(x, "identityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: RefFavoriteType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
