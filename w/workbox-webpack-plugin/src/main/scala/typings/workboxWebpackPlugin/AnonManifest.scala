package typings.workboxWebpackPlugin

import typings.workboxWebpackPlugin.mod.ManifestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonManifest extends js.Object {
  var manifest: js.Array[ManifestEntry]
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonManifest {
  @scala.inline
  def apply(manifest: js.Array[ManifestEntry], warnings: js.Array[String] = null): AnonManifest = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonManifest]
  }
}

