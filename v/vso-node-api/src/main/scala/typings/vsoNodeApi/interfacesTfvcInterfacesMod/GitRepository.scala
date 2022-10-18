package typings.vsoNodeApi.interfacesTfvcInterfacesMod

import typings.vsoNodeApi.interfacesCoreInterfacesMod.TeamProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitRepository extends StObject {
  
  var _links: Any
  
  var defaultBranch: String
  
  var id: String
  
  /**
    * True if the repository was created as a fork
    */
  var isFork: Boolean
  
  var name: String
  
  var parentRepository: GitRepositoryRef
  
  var project: TeamProjectReference
  
  var remoteUrl: String
  
  var sshUrl: String
  
  var url: String
  
  var validRemoteUrls: js.Array[String]
}
object GitRepository {
  
  inline def apply(
    _links: Any,
    defaultBranch: String,
    id: String,
    isFork: Boolean,
    name: String,
    parentRepository: GitRepositoryRef,
    project: TeamProjectReference,
    remoteUrl: String,
    sshUrl: String,
    url: String,
    validRemoteUrls: js.Array[String]
  ): GitRepository = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], defaultBranch = defaultBranch.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFork = isFork.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentRepository = parentRepository.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], remoteUrl = remoteUrl.asInstanceOf[js.Any], sshUrl = sshUrl.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], validRemoteUrls = validRemoteUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRepository]
  }
  
  extension [Self <: GitRepository](x: Self) {
    
    inline def setDefaultBranch(value: String): Self = StObject.set(x, "defaultBranch", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsFork(value: Boolean): Self = StObject.set(x, "isFork", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParentRepository(value: GitRepositoryRef): Self = StObject.set(x, "parentRepository", value.asInstanceOf[js.Any])
    
    inline def setProject(value: TeamProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setRemoteUrl(value: String): Self = StObject.set(x, "remoteUrl", value.asInstanceOf[js.Any])
    
    inline def setSshUrl(value: String): Self = StObject.set(x, "sshUrl", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setValidRemoteUrls(value: js.Array[String]): Self = StObject.set(x, "validRemoteUrls", value.asInstanceOf[js.Any])
    
    inline def setValidRemoteUrlsVarargs(value: String*): Self = StObject.set(x, "validRemoteUrls", js.Array(value*))
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
