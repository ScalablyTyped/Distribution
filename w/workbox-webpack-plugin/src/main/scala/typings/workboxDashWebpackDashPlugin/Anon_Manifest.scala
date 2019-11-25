package typings.workboxDashWebpackDashPlugin

import typings.workboxDashWebpackDashPlugin.workboxDashWebpackDashPluginMod.ManifestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Manifest extends js.Object {
  var manifest: js.Array[ManifestEntry]
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Manifest {
  @scala.inline
  def apply(manifest: js.Array[ManifestEntry], warnings: js.Array[String] = null): Anon_Manifest = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Manifest]
  }
}

