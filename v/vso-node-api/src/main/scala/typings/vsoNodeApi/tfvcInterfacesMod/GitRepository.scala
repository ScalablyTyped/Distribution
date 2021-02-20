package typings.vsoNodeApi.tfvcInterfacesMod

import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitRepository extends StObject {
  
  var _links: js.Any = js.native
  
  var defaultBranch: String = js.native
  
  var id: String = js.native
  
  /**
    * True if the repository was created as a fork
    */
  var isFork: Boolean = js.native
  
  var name: String = js.native
  
  var parentRepository: GitRepositoryRef = js.native
  
  var project: TeamProjectReference = js.native
  
  var remoteUrl: String = js.native
  
  var sshUrl: String = js.native
  
  var url: String = js.native
  
  var validRemoteUrls: js.Array[String] = js.native
}
object GitRepository {
  
  @scala.inline
  def apply(
    _links: js.Any,
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
  
  @scala.inline
  implicit class GitRepositoryMutableBuilder[Self <: GitRepository] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultBranch(value: String): Self = StObject.set(x, "defaultBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFork(value: Boolean): Self = StObject.set(x, "isFork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRepository(value: GitRepositoryRef): Self = StObject.set(x, "parentRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: TeamProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteUrl(value: String): Self = StObject.set(x, "remoteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshUrl(value: String): Self = StObject.set(x, "sshUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidRemoteUrls(value: js.Array[String]): Self = StObject.set(x, "validRemoteUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidRemoteUrlsVarargs(value: String*): Self = StObject.set(x, "validRemoteUrls", js.Array(value :_*))
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
