package typings.winrtUwp.Windows.Media.PlayTo

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the SourceSelected event. */
@js.native
trait PlayToSourceSelectedEventArgs extends StObject {
  
  /** Gets the display name of the selected Play To source. */
  var friendlyName: String = js.native
  
  /** Gets the display icon for the selected Play To source. */
  var icon: IRandomAccessStreamWithContentType = js.native
  
  /** Gets a value that indicates whether the selected Play To source supports audio. */
  var supportsAudio: Boolean = js.native
  
  /** Gets a value that indicates whether the selected Play To source supports displaying images. */
  var supportsImage: Boolean = js.native
  
  /** Gets a value that indicates whether the selected Play To source supports video. */
  var supportsVideo: Boolean = js.native
}
object PlayToSourceSelectedEventArgs {
  
  @scala.inline
  def apply(
    friendlyName: String,
    icon: IRandomAccessStreamWithContentType,
    supportsAudio: Boolean,
    supportsImage: Boolean,
    supportsVideo: Boolean
  ): PlayToSourceSelectedEventArgs = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], supportsAudio = supportsAudio.asInstanceOf[js.Any], supportsImage = supportsImage.asInstanceOf[js.Any], supportsVideo = supportsVideo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToSourceSelectedEventArgs]
  }
  
  @scala.inline
  implicit class PlayToSourceSelectedEventArgsMutableBuilder[Self <: PlayToSourceSelectedEventArgs] (val x: Self) extends AnyVal {
    
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
