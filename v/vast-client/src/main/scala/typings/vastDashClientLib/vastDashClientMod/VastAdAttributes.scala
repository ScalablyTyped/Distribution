package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastAdAttributes extends js.Object {
  var fallback_index: java.lang.String | scala.Null
  var `type`: java.lang.String
}

object VastAdAttributes {
  @scala.inline
  def apply(`type`: java.lang.String, fallback_index: java.lang.String = null): VastAdAttributes = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (fallback_index != null) __obj.updateDynamic("fallback_index")(fallback_index)
    __obj.asInstanceOf[VastAdAttributes]
  }
}

