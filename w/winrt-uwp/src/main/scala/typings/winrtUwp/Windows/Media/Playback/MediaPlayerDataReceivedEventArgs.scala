package typings.winrtUwp.Windows.Media.Playback

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MessageReceivedFromBackground and MessageReceivedFromForeground events. */
@js.native
trait MediaPlayerDataReceivedEventArgs extends js.Object {
  
  /** Gets the data from the MessageReceivedFromBackground or MessageReceivedFromForeground event. */
  var data: IMap[String, String] = js.native
}
object MediaPlayerDataReceivedEventArgs {
  
  @scala.inline
  def apply(data: IMap[String, String]): MediaPlayerDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlayerDataReceivedEventArgs]
  }
  
  @scala.inline
  implicit class MediaPlayerDataReceivedEventArgsOps[Self <: MediaPlayerDataReceivedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setData(value: IMap[String, String]): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
