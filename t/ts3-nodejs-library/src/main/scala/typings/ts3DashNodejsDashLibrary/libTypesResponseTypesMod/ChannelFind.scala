package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelFind extends js.Object {
  var channel_name: String
  var cid: Double
}

object ChannelFind {
  @scala.inline
  def apply(channel_name: String, cid: Double): ChannelFind = {
    val __obj = js.Dynamic.literal(channel_name = channel_name, cid = cid)
  
    __obj.asInstanceOf[ChannelFind]
  }
}

