package typings.wordpressMediaUtils.uploadMediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @wordpress/api-fetch.@wordpress/api-fetch.Schema.Media<'edit'>, 'alt_text' | 'caption' | 'source_url' | 'title'> ]: @wordpress/api-fetch.@wordpress/api-fetch.Schema.Media<'edit'>[P]} */ @js.native
trait MediaItem extends js.Object {
  
  var alt: String = js.native
  
  var caption: String = js.native
  
  var title: String = js.native
  
  var url: String = js.native
}
object MediaItem {
  
  @scala.inline
  def apply(alt: String, caption: String, title: String, url: String): MediaItem = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaItem]
  }
  
  @scala.inline
  implicit class MediaItemOps[Self <: MediaItem] (val x: Self) extends AnyVal {
    
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
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
