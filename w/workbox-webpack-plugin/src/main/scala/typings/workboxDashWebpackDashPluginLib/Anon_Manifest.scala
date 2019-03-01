package typings
package workboxDashWebpackDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Manifest extends js.Object {
  var manifest: js.Array[workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginMod.ManifestEntry]
  var warnings: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Manifest {
  @scala.inline
  def apply(
    manifest: js.Array[workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginMod.ManifestEntry],
    warnings: js.Array[java.lang.String] = null
  ): Anon_Manifest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("manifest")(manifest)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[Anon_Manifest]
  }
}

