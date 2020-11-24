package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MappingDetails extends js.Object {
  
  /**
    * The local path.
    */
  var localPath: String = js.native
  
  /**
    * The mapping type.
    */
  var mappingType: String = js.native
  
  /**
    * The server path.
    */
  var serverPath: String = js.native
}
object MappingDetails {
  
  @scala.inline
  def apply(localPath: String, mappingType: String, serverPath: String): MappingDetails = {
    val __obj = js.Dynamic.literal(localPath = localPath.asInstanceOf[js.Any], mappingType = mappingType.asInstanceOf[js.Any], serverPath = serverPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingDetails]
  }
  
  @scala.inline
  implicit class MappingDetailsOps[Self <: MappingDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocalPath(value: String): Self = this.set("localPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingType(value: String): Self = this.set("mappingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerPath(value: String): Self = this.set("serverPath", value.asInstanceOf[js.Any])
  }
}
