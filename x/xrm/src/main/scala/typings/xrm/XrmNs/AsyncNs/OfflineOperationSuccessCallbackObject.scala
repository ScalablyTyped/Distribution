package typings.xrm.XrmNs.AsyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object passed to OfflineOperationSuccessCallbackDelegate;
  */
trait OfflineOperationSuccessCallbackObject extends js.Object {
  /**
    * GUID of the record;
    */
  var id: String
  /**
    * Logical name of the entity.
    */
  var logicalName: String
}

object OfflineOperationSuccessCallbackObject {
  @scala.inline
  def apply(id: String, logicalName: String): OfflineOperationSuccessCallbackObject = {
    val __obj = js.Dynamic.literal(id = id, logicalName = logicalName)
  
    __obj.asInstanceOf[OfflineOperationSuccessCallbackObject]
  }
}

