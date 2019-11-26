package typings.webcl.WEBCL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.4.1
trait WebCLImageDescriptor extends js.Object {
  var channelOrder: ChannelOrder
  var channelType: ChannelType
  var height: Double
  var rowPitch: Double
  var width: Double
}

object WebCLImageDescriptor {
  @scala.inline
  def apply(
    channelOrder: ChannelOrder,
    channelType: ChannelType,
    height: Double,
    rowPitch: Double,
    width: Double
  ): WebCLImageDescriptor = {
    val __obj = js.Dynamic.literal(channelOrder = channelOrder.asInstanceOf[js.Any], channelType = channelType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rowPitch = rowPitch.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebCLImageDescriptor]
  }
}

