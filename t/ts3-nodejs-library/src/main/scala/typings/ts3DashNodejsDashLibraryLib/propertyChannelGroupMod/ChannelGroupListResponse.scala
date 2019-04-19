package typings
package ts3DashNodejsDashLibraryLib.propertyChannelGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the response of the channelgrouplist command for a single channelgroup
  */
trait ChannelGroupListResponse extends js.Object {
  var cgid: scala.Double
}

object ChannelGroupListResponse {
  @scala.inline
  def apply(cgid: scala.Double): ChannelGroupListResponse = {
    val __obj = js.Dynamic.literal(cgid = cgid)
  
    __obj.asInstanceOf[ChannelGroupListResponse]
  }
}

