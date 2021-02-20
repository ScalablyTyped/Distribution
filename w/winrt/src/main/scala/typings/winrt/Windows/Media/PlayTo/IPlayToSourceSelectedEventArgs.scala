package typings.winrt.Windows.Media.PlayTo

import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlayToSourceSelectedEventArgs extends StObject {
  
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
  implicit class IPlayToSourceSelectedEventArgsMutableBuilder[Self <: IPlayToSourceSelectedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: IRandomAccessStreamWithContentType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsAudio(value: Boolean): Self = StObject.set(x, "supportsAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsImage(value: Boolean): Self = StObject.set(x, "supportsImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsVideo(value: Boolean): Self = StObject.set(x, "supportsVideo", value.asInstanceOf[js.Any])
  }
}
