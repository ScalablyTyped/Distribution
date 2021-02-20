package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileTransferEntry extends ResponseEntry {
  
  var averageSpeed: Double = js.native
  
  var clid: String = js.native
  
  var clientftfid: Double = js.native
  
  var currentSpeed: Double = js.native
  
  var name: String = js.native
  
  var path: String = js.native
  
  var runtime: Double = js.native
  
  var sender: Double = js.native
  
  var serverftfid: Double = js.native
  
  var size: Double = js.native
  
  var sizedone: Double = js.native
  
  var status: Double = js.native
}
object FileTransferEntry {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class FileTransferEntryMutableBuilder[Self <: FileTransferEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverageSpeed(value: Double): Self = StObject.set(x, "averageSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClid(value: String): Self = StObject.set(x, "clid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientftfid(value: Double): Self = StObject.set(x, "clientftfid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSpeed(value: Double): Self = StObject.set(x, "currentSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntime(value: Double): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: Double): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerftfid(value: Double): Self = StObject.set(x, "serverftfid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizedone(value: Double): Self = StObject.set(x, "sizedone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
