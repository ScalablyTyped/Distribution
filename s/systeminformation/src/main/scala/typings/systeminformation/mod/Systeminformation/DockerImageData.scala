package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DockerImageData extends StObject {
  
  var architecture: String
  
  var author: String
  
  var comment: String
  
  var config: Any
  
  var container: String
  
  var containerConfig: Any
  
  var created: Double
  
  var dockerVersion: String
  
  var graphDriver: Any
  
  var id: String
  
  var os: String
  
  var parent: String
  
  var repoDigests: Any
  
  var repoTags: Any
  
  var rootFS: Any
  
  var sharedSize: Double
  
  var size: Double
  
  var virtualSize: Double
}
object DockerImageData {
  
  inline def apply(
    architecture: String,
    author: String,
    comment: String,
    config: Any,
    container: String,
    containerConfig: Any,
    created: Double,
    dockerVersion: String,
    graphDriver: Any,
    id: String,
    os: String,
    parent: String,
    repoDigests: Any,
    repoTags: Any,
    rootFS: Any,
    sharedSize: Double,
    size: Double,
    virtualSize: Double
  ): DockerImageData = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], containerConfig = containerConfig.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], dockerVersion = dockerVersion.asInstanceOf[js.Any], graphDriver = graphDriver.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], repoDigests = repoDigests.asInstanceOf[js.Any], repoTags = repoTags.asInstanceOf[js.Any], rootFS = rootFS.asInstanceOf[js.Any], sharedSize = sharedSize.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], virtualSize = virtualSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerImageData]
  }
  
  extension [Self <: DockerImageData](x: Self) {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerConfig(value: Any): Self = StObject.set(x, "containerConfig", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDockerVersion(value: String): Self = StObject.set(x, "dockerVersion", value.asInstanceOf[js.Any])
    
    inline def setGraphDriver(value: Any): Self = StObject.set(x, "graphDriver", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRepoDigests(value: Any): Self = StObject.set(x, "repoDigests", value.asInstanceOf[js.Any])
    
    inline def setRepoTags(value: Any): Self = StObject.set(x, "repoTags", value.asInstanceOf[js.Any])
    
    inline def setRootFS(value: Any): Self = StObject.set(x, "rootFS", value.asInstanceOf[js.Any])
    
    inline def setSharedSize(value: Double): Self = StObject.set(x, "sharedSize", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setVirtualSize(value: Double): Self = StObject.set(x, "virtualSize", value.asInstanceOf[js.Any])
  }
}
