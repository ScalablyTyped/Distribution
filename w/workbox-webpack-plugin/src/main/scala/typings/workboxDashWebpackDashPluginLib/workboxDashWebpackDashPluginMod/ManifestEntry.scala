package typings
package workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestEntry extends js.Object {
  var revision: java.lang.String
  var url: java.lang.String
}

object ManifestEntry {
  @scala.inline
  def apply(revision: java.lang.String, url: java.lang.String): ManifestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("revision")(revision)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ManifestEntry]
  }
}

