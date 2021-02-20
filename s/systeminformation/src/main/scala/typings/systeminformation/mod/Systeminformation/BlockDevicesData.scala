package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockDevicesData extends StObject {
  
  var fstype: String = js.native
  
  var identifier: String = js.native
  
  var label: String = js.native
  
  var model: String = js.native
  
  var mount: String = js.native
  
  var name: String = js.native
  
  var physical: String = js.native
  
  var protocol: String = js.native
  
  var removable: Boolean = js.native
  
  var serial: String = js.native
  
  var size: Double = js.native
  
  var `type`: String = js.native
  
  var uuid: String = js.native
}
object BlockDevicesData {
  
  @scala.inline
  def apply(
    fstype: String,
    identifier: String,
    label: String,
    model: String,
    mount: String,
    name: String,
    physical: String,
    protocol: String,
    removable: Boolean,
    serial: String,
    size: Double,
    `type`: String,
    uuid: String
  ): BlockDevicesData = {
    val __obj = js.Dynamic.literal(fstype = fstype.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], physical = physical.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], removable = removable.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockDevicesData]
  }
  
  @scala.inline
  implicit class BlockDevicesDataMutableBuilder[Self <: BlockDevicesData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFstype(value: String): Self = StObject.set(x, "fstype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMount(value: String): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysical(value: String): Self = StObject.set(x, "physical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
