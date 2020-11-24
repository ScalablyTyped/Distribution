package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties for video information that is displayed by SystemMediaTransportControlsDisplayUpdater class. */
@js.native
trait VideoDisplayProperties extends js.Object {
  
  /** Gets a modifiable list of strings representing genre names. */
  var genres: IVector[String] = js.native
  
  /** Gets or sets the subtitle of the video. */
  var subtitle: String = js.native
  
  /** Gets or sets the title of the video. */
  var title: String = js.native
}
object VideoDisplayProperties {
  
  @scala.inline
  def apply(genres: IVector[String], subtitle: String, title: String): VideoDisplayProperties = {
    val __obj = js.Dynamic.literal(genres = genres.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoDisplayProperties]
  }
  
  @scala.inline
  implicit class VideoDisplayPropertiesOps[Self <: VideoDisplayProperties] (val x: Self) extends AnyVal {
    
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
    def setGenres(value: IVector[String]): Self = this.set("genres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
