package typings
package atWordpressApiDashFetchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Formats extends js.Object {
  var formats: js.Array[atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.PostFormat]
  var `post-thumbnails`: scala.Boolean
  var `responsive-embeds`: scala.Boolean
}

object Anon_Formats {
  @scala.inline
  def apply(
    formats: js.Array[atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.PostFormat],
    `post-thumbnails`: scala.Boolean,
    `responsive-embeds`: scala.Boolean
  ): Anon_Formats = {
    val __obj = js.Dynamic.literal(formats = formats)
    __obj.updateDynamic("post-thumbnails")(`post-thumbnails`)
    __obj.updateDynamic("responsive-embeds")(`responsive-embeds`)
    __obj.asInstanceOf[Anon_Formats]
  }
}

