package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeZone extends js.Object {
  var displayName: String
  var id: String
}

object TimeZone {
  @scala.inline
  def apply(displayName: String, id: String): TimeZone = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZone]
  }
}

