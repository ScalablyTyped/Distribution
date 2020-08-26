package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardSettings extends js.Object {
  /**
    * A collection of settings related to rendering of fields on cards
    */
  var fields: CardFieldSettings = js.native
}

object CardSettings {
  @scala.inline
  def apply(fields: CardFieldSettings): CardSettings = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardSettings]
  }
  @scala.inline
  implicit class CardSettingsOps[Self <: CardSettings] (val x: Self) extends AnyVal {
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
    def setFields(value: CardFieldSettings): Self = this.set("fields", value.asInstanceOf[js.Any])
  }
  
}

