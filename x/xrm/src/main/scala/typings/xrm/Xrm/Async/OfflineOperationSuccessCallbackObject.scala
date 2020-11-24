package typings.xrm.Xrm.Async

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object passed to OfflineOperationSuccessCallbackDelegate;
  */
@js.native
trait OfflineOperationSuccessCallbackObject extends js.Object {
  
  /**
    * GUID of the record;
    */
  var id: String = js.native
  
  /**
    * Logical name of the entity.
    */
  var logicalName: String = js.native
}
object OfflineOperationSuccessCallbackObject {
  
  @scala.inline
  def apply(id: String, logicalName: String): OfflineOperationSuccessCallbackObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], logicalName = logicalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineOperationSuccessCallbackObject]
  }
  
  @scala.inline
  implicit class OfflineOperationSuccessCallbackObjectOps[Self <: OfflineOperationSuccessCallbackObject] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalName(value: String): Self = this.set("logicalName", value.asInstanceOf[js.Any])
  }
}
