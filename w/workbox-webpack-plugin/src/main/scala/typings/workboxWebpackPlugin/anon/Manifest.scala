package typings.workboxWebpackPlugin.anon

import typings.workboxWebpackPlugin.mod.ManifestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Manifest extends js.Object {
  var manifest: js.Array[ManifestEntry]
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}

object Manifest {
  @scala.inline
  def apply(manifest: js.Array[ManifestEntry], warnings: js.Array[String] = null): Manifest = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
}

