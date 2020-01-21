package typings.wordpressApiFetch

import typings.wordpressApiFetch.mod.Schema.PostFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormats extends js.Object {
  var formats: js.Array[PostFormat]
  var `post-thumbnails`: Boolean
  var `responsive-embeds`: Boolean
}

object AnonFormats {
  @scala.inline
  def apply(formats: js.Array[PostFormat], `post-thumbnails`: Boolean, `responsive-embeds`: Boolean): AnonFormats = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
    __obj.updateDynamic("post-thumbnails")(`post-thumbnails`.asInstanceOf[js.Any])
    __obj.updateDynamic("responsive-embeds")(`responsive-embeds`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormats]
  }
}

