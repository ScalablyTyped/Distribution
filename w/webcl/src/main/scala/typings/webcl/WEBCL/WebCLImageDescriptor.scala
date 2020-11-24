package typings.webcl.WEBCL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.4.1
@js.native
trait WebCLImageDescriptor extends js.Object {
  
  var channelOrder: ChannelOrder = js.native
  
  var channelType: ChannelType = js.native
  
  var height: Double = js.native
  
  var rowPitch: Double = js.native
  
  var width: Double = js.native
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
  
  @scala.inline
  implicit class WebCLImageDescriptorOps[Self <: WebCLImageDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelOrder(value: ChannelOrder): Self = this.set("channelOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelType(value: ChannelType): Self = this.set("channelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowPitch(value: Double): Self = this.set("rowPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
