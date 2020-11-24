package typings.winrt.Windows.Media.PlayTo

import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlayToSourceSelectedEventArgs extends js.Object {
  
  var friendlyName: String = js.native
  
  var icon: IRandomAccessStreamWithContentType = js.native
  
  var supportsAudio: Boolean = js.native
  
  var supportsImage: Boolean = js.native
  
  var supportsVideo: Boolean = js.native
}
object IPlayToSourceSelectedEventArgs {
  
  @scala.inline
  def apply(
    friendlyName: String,
    icon: IRandomAccessStreamWithContentType,
    supportsAudio: Boolean,
    supportsImage: Boolean,
    supportsVideo: Boolean
  ): IPlayToSourceSelectedEventArgs = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], supportsAudio = supportsAudio.asInstanceOf[js.Any], supportsImage = supportsImage.asInstanceOf[js.Any], supportsVideo = supportsVideo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToSourceSelectedEventArgs]
  }
  
  @scala.inline
  implicit class IPlayToSourceSelectedEventArgsOps[Self <: IPlayToSourceSelectedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: IRandomAccessStreamWithContentType): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsAudio(value: Boolean): Self = this.set("supportsAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsImage(value: Boolean): Self = this.set("supportsImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsVideo(value: Boolean): Self = this.set("supportsVideo", value.asInstanceOf[js.Any])
  }
}
