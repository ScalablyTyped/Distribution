package typings.ts3DashNodejsDashLibrary.propertyChannelGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the response of the channelgrouplist command for a single channelgroup
  */
trait ChannelGroupListResponse extends js.Object {
  var cgid: Double
}

object ChannelGroupListResponse {
  @scala.inline
  def apply(cgid: Double): ChannelGroupListResponse = {
    val __obj = js.Dynamic.literal(cgid = cgid)
  
    __obj.asInstanceOf[ChannelGroupListResponse]
  }
}

