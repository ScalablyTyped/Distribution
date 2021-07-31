package typings.winrt.Windows.Media.PlayTo

import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayToSourceSelectedEventArgs
  extends StObject
     with IPlayToSourceSelectedEventArgs
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
}
