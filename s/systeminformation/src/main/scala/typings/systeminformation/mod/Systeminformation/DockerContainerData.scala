package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DockerContainerData extends StObject {
  
  var command: String
  
  var created: Double
  
  var createdAt: String
  
  var driver: String
  
  var finished: Double
  
  var finishedAt: String
  
  var id: String
  
  var image: String
  
  var imageID: String
  
  var mounts: js.Array[DockerContainerMountData]
  
  var name: String
  
  var platform: String
  
  var ports: js.Array[Double]
  
  var restartCount: Double
  
  var started: Double
  
  var startedAt: String
  
  var state: String
}
object DockerContainerData {
  
  inline def apply(
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
  
  extension [Self <: DockerContainerData](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setFinished(value: Double): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    inline def setFinishedAt(value: String): Self = StObject.set(x, "finishedAt", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageID(value: String): Self = StObject.set(x, "imageID", value.asInstanceOf[js.Any])
    
    inline def setMounts(value: js.Array[DockerContainerMountData]): Self = StObject.set(x, "mounts", value.asInstanceOf[js.Any])
    
    inline def setMountsVarargs(value: DockerContainerMountData*): Self = StObject.set(x, "mounts", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPorts(value: js.Array[Double]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsVarargs(value: Double*): Self = StObject.set(x, "ports", js.Array(value*))
    
    inline def setRestartCount(value: Double): Self = StObject.set(x, "restartCount", value.asInstanceOf[js.Any])
    
    inline def setStarted(value: Double): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setStartedAt(value: String): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
