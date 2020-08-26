package typings.uifabricUtilities.globalSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChangeDescription extends js.Object {
  var key: String = js.native
  var oldValue: js.Any = js.native
  var value: js.Any = js.native
}

object IChangeDescription {
  @scala.inline
  def apply(key: String, oldValue: js.Any, value: js.Any): IChangeDescription = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangeDescription]
  }
  @scala.inline
  implicit class IChangeDescriptionOps[Self <: IChangeDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValue(value: js.Any): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

