package typings.workboxWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestEntry extends js.Object {
  var revision: String
  var url: String
}

object ManifestEntry {
  @scala.inline
  def apply(revision: String, url: String): ManifestEntry = {
    val __obj = js.Dynamic.literal(revision = revision.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestEntry]
  }
}

