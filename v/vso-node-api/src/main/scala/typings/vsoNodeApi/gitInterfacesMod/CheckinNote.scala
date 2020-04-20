package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckinNote extends js.Object {
  var name: String
  var value: String
}

object CheckinNote {
  @scala.inline
  def apply(name: String, value: String): CheckinNote = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckinNote]
  }
}

