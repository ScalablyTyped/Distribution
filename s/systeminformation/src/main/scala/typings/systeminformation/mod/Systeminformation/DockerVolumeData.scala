package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DockerVolumeData extends StObject {
  
  var created: Double
  
  var driver: String
  
  var labels: Any
  
  var mountpoint: String
  
  var name: String
  
  var options: Any
  
  var scope: String
}
object DockerVolumeData {
  
  inline def apply(
    created: Double,
    driver: String,
    labels: Any,
    mountpoint: String,
    name: String,
    options: Any,
    scope: String
  ): DockerVolumeData = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], mountpoint = mountpoint.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerVolumeData]
  }
  
  extension [Self <: DockerVolumeData](x: Self) {
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: Any): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setMountpoint(value: String): Self = StObject.set(x, "mountpoint", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
