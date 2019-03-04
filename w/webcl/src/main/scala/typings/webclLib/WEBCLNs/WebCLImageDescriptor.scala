package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.4.1
trait WebCLImageDescriptor extends js.Object {
  var channelOrder: ChannelOrder
  var channelType: ChannelType
  var height: scala.Double
  var rowPitch: scala.Double
  var width: scala.Double
}

object WebCLImageDescriptor {
  @scala.inline
  def apply(
    channelOrder: ChannelOrder,
    channelType: ChannelType,
    height: scala.Double,
    rowPitch: scala.Double,
    width: scala.Double
  ): WebCLImageDescriptor = {
    val __obj = js.Dynamic.literal(channelOrder = channelOrder, channelType = channelType, height = height, rowPitch = rowPitch, width = width)
  
    __obj.asInstanceOf[WebCLImageDescriptor]
  }
}

