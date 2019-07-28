package typings.atWordpressApiDashFetch

import typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.PostFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Formats extends js.Object {
  var formats: js.Array[PostFormat]
  var `post-thumbnails`: Boolean
  var `responsive-embeds`: Boolean
}

object Anon_Formats {
  @scala.inline
  def apply(formats: js.Array[PostFormat], `post-thumbnails`: Boolean, `responsive-embeds`: Boolean): Anon_Formats = {
    val __obj = js.Dynamic.literal(formats = formats)
    __obj.updateDynamic("post-thumbnails")(`post-thumbnails`)
    __obj.updateDynamic("responsive-embeds")(`responsive-embeds`)
    __obj.asInstanceOf[Anon_Formats]
  }
}

