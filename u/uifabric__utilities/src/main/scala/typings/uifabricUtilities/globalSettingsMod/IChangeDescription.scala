package typings.uifabricUtilities.globalSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChangeDescription extends js.Object {
  var key: String
  var oldValue: js.Any
  var value: js.Any
}

object IChangeDescription {
  @scala.inline
  def apply(key: String, oldValue: js.Any, value: js.Any): IChangeDescription = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangeDescription]
  }
}

