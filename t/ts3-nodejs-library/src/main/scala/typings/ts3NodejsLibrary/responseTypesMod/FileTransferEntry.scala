package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileTransferEntry
  extends StObject
     with ResponseEntry {
  
  var averageSpeed: Double
  
  var clid: String
  
  var clientftfid: Double
  
  var currentSpeed: Double
  
  var name: String
  
  var path: String
  
  var runtime: Double
  
  var sender: Double
  
  var serverftfid: Double
  
  var size: Double
  
  var sizedone: Double
  
  var status: Double
}
object FileTransferEntry {
  
  inline def apply(
    averageSpeed: Double,
    clid: String,
    clientftfid: Double,
    currentSpeed: Double,
    name: String,
    path: String,
    runtime: Double,
    sender: Double,
    serverftfid: Double,
    size: Double,
    sizedone: Double,
    status: Double
  ): FileTransferEntry = {
    val __obj = js.Dynamic.literal(averageSpeed = averageSpeed.asInstanceOf[js.Any], clid = clid.asInstanceOf[js.Any], clientftfid = clientftfid.asInstanceOf[js.Any], currentSpeed = currentSpeed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], serverftfid = serverftfid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sizedone = sizedone.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTransferEntry]
  }
  
  extension [Self <: FileTransferEntry](x: Self) {
    
    inline def setAverageSpeed(value: Double): Self = StObject.set(x, "averageSpeed", value.asInstanceOf[js.Any])
    
    inline def setClid(value: String): Self = StObject.set(x, "clid", value.asInstanceOf[js.Any])
    
    inline def setClientftfid(value: Double): Self = StObject.set(x, "clientftfid", value.asInstanceOf[js.Any])
    
    inline def setCurrentSpeed(value: Double): Self = StObject.set(x, "currentSpeed", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: Double): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Double): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setServerftfid(value: Double): Self = StObject.set(x, "serverftfid", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizedone(value: Double): Self = StObject.set(x, "sizedone", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
