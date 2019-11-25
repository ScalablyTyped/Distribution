package typings.webpackDashAssetsDashManifest.webpackDashAssetsDashManifestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var key: String
  var value: String
}

object Entry {
  @scala.inline
  def apply(key: String, value: String): Entry = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Entry]
  }
}

