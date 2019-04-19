package typings
package ts3DashNodejsDashLibraryLib.propertyServerGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the response of the servergrouplist command for a single servergroup
  */
trait ServerGroupListResponse extends js.Object {
  var sgid: scala.Double
}

object ServerGroupListResponse {
  @scala.inline
  def apply(sgid: scala.Double): ServerGroupListResponse = {
    val __obj = js.Dynamic.literal(sgid = sgid)
  
    __obj.asInstanceOf[ServerGroupListResponse]
  }
}

