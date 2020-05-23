package typings.wordpressMediaUtils.uploadMediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @wordpress/api-fetch.@wordpress/api-fetch.Schema.Media<'edit'>, 'alt_text' | 'caption' | 'source_url' | 'title'> ]: @wordpress/api-fetch.@wordpress/api-fetch.Schema.Media<'edit'>[P]} */ trait MediaItem extends js.Object {
  var alt: String
  var caption: String
  var title: String
  var url: String
}

object MediaItem {
  @scala.inline
  def apply(alt: String, caption: String, title: String, url: String): MediaItem = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaItem]
  }
}

