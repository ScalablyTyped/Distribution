package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DockerContainerMountData extends StObject {
  
  var Destination: String = js.native
  
  var Mode: String = js.native
  
  var Propagation: String = js.native
  
  var RW: Boolean = js.native
  
  var Source: String = js.native
  
  var Type: String = js.native
}
object DockerContainerMountData {
  
  @scala.inline
  def apply(Destination: String, Mode: String, Propagation: String, RW: Boolean, Source: String, Type: String): DockerContainerMountData = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Propagation = Propagation.asInstanceOf[js.Any], RW = RW.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerContainerMountData]
  }
  
  @scala.inline
  implicit class DockerContainerMountDataMutableBuilder[Self <: DockerContainerMountData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagation(value: String): Self = StObject.set(x, "Propagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRW(value: Boolean): Self = StObject.set(x, "RW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
