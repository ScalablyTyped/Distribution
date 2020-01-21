package typings.tabtab.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteItem extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var name: String
}

object CompleteItem {
  @scala.inline
  def apply(name: String, description: String = null): CompleteItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteItem]
  }
}

