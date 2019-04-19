package typings
package ts3DashNodejsDashLibraryLib.propertyChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the response of the channellist command for a single channel
  */
trait ChannelListResponse extends js.Object {
  var id: scala.Double
}

object ChannelListResponse {
  @scala.inline
  def apply(id: scala.Double): ChannelListResponse = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[ChannelListResponse]
  }
}

