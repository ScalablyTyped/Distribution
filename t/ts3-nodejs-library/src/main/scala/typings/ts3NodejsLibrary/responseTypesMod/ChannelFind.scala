package typings.ts3NodejsLibrary.responseTypesMod

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
    val __obj = js.Dynamic.literal(channel_name = channel_name.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelFind]
  }
}

