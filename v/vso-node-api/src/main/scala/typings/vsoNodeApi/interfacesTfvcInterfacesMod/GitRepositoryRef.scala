package typings.vsoNodeApi.interfacesTfvcInterfacesMod

import typings.vsoNodeApi.interfacesCoreInterfacesMod.TeamProjectCollectionReference
import typings.vsoNodeApi.interfacesCoreInterfacesMod.TeamProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitRepositoryRef extends StObject {
  
  /**
    * Team Project Collection where this Fork resides
    */
  var collection: TeamProjectCollectionReference
  
  var id: String
  
  /**
    * True if the repository was created as a fork
    */
  var isFork: Boolean
  
  var name: String
  
  var project: TeamProjectReference
  
  var remoteUrl: String
  
  var sshUrl: String
  
  var url: String
}
object GitRepositoryRef {
  
  inline def apply(
    collection: TeamProjectCollectionReference,
    id: String,
    isFork: Boolean,
    name: String,
    project: TeamProjectReference,
    remoteUrl: String,
    sshUrl: String,
    url: String
  ): GitRepositoryRef = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFork = isFork.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], remoteUrl = remoteUrl.asInstanceOf[js.Any], sshUrl = sshUrl.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRepositoryRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GitRepositoryRef] (val x: Self) extends AnyVal {
    
    inline def setCollection(value: TeamProjectCollectionReference): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsFork(value: Boolean): Self = StObject.set(x, "isFork", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProject(value: TeamProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setRemoteUrl(value: String): Self = StObject.set(x, "remoteUrl", value.asInstanceOf[js.Any])
    
    inline def setSshUrl(value: String): Self = StObject.set(x, "sshUrl", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
