package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Media.Protection.PlayReady.NDMediaStreamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamType extends js.Object {
  
  /** The stream identifier for the media stream. */ var returnValue: Double = js.native
  
  /** The type of the media stream. This type can be either Audio or Video. */ var streamType: NDMediaStreamType = js.native
}
object StreamType {
  
  @scala.inline
  def apply(returnValue: Double, streamType: NDMediaStreamType): StreamType = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], streamType = streamType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamType]
  }
  
  @scala.inline
  implicit class StreamTypeOps[Self <: StreamType] (val x: Self) extends AnyVal {
    
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
    def setReturnValue(value: Double): Self = this.set("returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamType(value: NDMediaStreamType): Self = this.set("streamType", value.asInstanceOf[js.Any])
  }
}
