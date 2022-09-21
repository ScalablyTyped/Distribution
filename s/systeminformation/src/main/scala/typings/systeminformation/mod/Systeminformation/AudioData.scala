package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioData extends StObject {
  
  var default: Boolean
  
  var channel: String
  
  var driver: String
  
  var id: Double | String
  
  var in: Boolean
  
  var manufacturer: String
  
  var name: String
  
  var out: Boolean
  
  var revision: String
  
  var status: String
  
  var `type`: String
}
object AudioData {
  
  inline def apply(
    channel: String,
    default: Boolean,
    driver: String,
    id: Double | String,
    in: Boolean,
    manufacturer: String,
    name: String,
    out: Boolean,
    revision: String,
    status: String,
    `type`: String
  ): AudioData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioData]
  }
  
  extension [Self <: AudioData](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOut(value: Boolean): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
