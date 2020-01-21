package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastAdAttributes extends js.Object {
  var fallback_index: String | Null
  var `type`: String
}

object VastAdAttributes {
  @scala.inline
  def apply(`type`: String, fallback_index: String = null): VastAdAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (fallback_index != null) __obj.updateDynamic("fallback_index")(fallback_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastAdAttributes]
  }
}

