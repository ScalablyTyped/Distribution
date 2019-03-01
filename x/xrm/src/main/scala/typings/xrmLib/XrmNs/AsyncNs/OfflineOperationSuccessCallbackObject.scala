package typings
package xrmLib.XrmNs.AsyncNs

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
  var id: java.lang.String
  /**
    * Logical name of the entity.
    */
  var logicalName: java.lang.String
}

object OfflineOperationSuccessCallbackObject {
  @scala.inline
  def apply(id: java.lang.String, logicalName: java.lang.String): OfflineOperationSuccessCallbackObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("logicalName")(logicalName)
    __obj.asInstanceOf[OfflineOperationSuccessCallbackObject]
  }
}

