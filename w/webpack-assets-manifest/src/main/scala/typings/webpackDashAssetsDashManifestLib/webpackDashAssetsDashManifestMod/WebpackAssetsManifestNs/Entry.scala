package typings
package webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod.WebpackAssetsManifestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var key: java.lang.String
  var value: java.lang.String
}

object Entry {
  @scala.inline
  def apply(key: java.lang.String, value: java.lang.String): Entry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Entry]
  }
}

