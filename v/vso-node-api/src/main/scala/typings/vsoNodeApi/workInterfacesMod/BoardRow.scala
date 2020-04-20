package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoardRow extends js.Object {
  var id: String
  var name: String
}

object BoardRow {
  @scala.inline
  def apply(id: String, name: String): BoardRow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardRow]
  }
}

