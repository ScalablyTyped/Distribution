package typings
package winrtLib.WindowsNs.StorageNs.AccessCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessListEntry extends js.Object {
  var metadata: java.lang.String
  var token: java.lang.String
}

object AccessListEntry {
  @scala.inline
  def apply(metadata: java.lang.String, token: java.lang.String): AccessListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[AccessListEntry]
  }
}

