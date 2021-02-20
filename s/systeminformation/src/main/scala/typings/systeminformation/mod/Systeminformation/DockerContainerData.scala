package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DockerContainerData extends StObject {
  
  var command: String = js.native
  
  var created: Double = js.native
  
  var createdAt: String = js.native
  
  var driver: String = js.native
  
  var finished: Double = js.native
  
  var finishedAt: String = js.native
  
  var id: String = js.native
  
  var image: String = js.native
  
  var imageID: String = js.native
  
  var mounts: js.Array[DockerContainerMountData] = js.native
  
  var name: String = js.native
  
  var platform: String = js.native
  
  var ports: js.Array[Double] = js.native
  
  var restartCount: Double = js.native
  
  var started: Double = js.native
  
  var startedAt: String = js.native
  
  var state: String = js.native
}
object DockerContainerData {
  
  @scala.inline
  def apply(
    command: String,
    created: Double,
    createdAt: String,
    driver: String,
    finished: Double,
    finishedAt: String,
    id: String,
    image: String,
    imageID: String,
    mounts: js.Array[DockerContainerMountData],
    name: String,
    platform: String,
    ports: js.Array[Double],
    restartCount: Double,
    started: Double,
    startedAt: String,
    state: String
  ): DockerContainerData = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], finishedAt = finishedAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageID = imageID.asInstanceOf[js.Any], mounts = mounts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any], restartCount = restartCount.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerContainerData]
  }
  
  @scala.inline
  implicit class DockerContainerDataMutableBuilder[Self <: DockerContainerData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinished(value: Double): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishedAt(value: String): Self = StObject.set(x, "finishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageID(value: String): Self = StObject.set(x, "imageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMounts(value: js.Array[DockerContainerMountData]): Self = StObject.set(x, "mounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountsVarargs(value: DockerContainerMountData*): Self = StObject.set(x, "mounts", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPorts(value: js.Array[Double]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsVarargs(value: Double*): Self = StObject.set(x, "ports", js.Array(value :_*))
    
    @scala.inline
    def setRestartCount(value: Double): Self = StObject.set(x, "restartCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarted(value: Double): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAt(value: String): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
