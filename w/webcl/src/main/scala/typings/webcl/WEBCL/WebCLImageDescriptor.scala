package typings.webcl.WEBCL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.4.1
trait WebCLImageDescriptor extends StObject {
  
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
  
  @scala.inline
  implicit class WebCLImageDescriptorMutableBuilder[Self <: WebCLImageDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelOrder(value: ChannelOrder): Self = StObject.set(x, "channelOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelType(value: ChannelType): Self = StObject.set(x, "channelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowPitch(value: Double): Self = StObject.set(x, "rowPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
