package typings.ukCoWorkingedgePhonegapPluginLaunchnavigator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppSelection extends js.Object {
  var userChoice: UserChoice = js.native
  var userPrompted: UserPrompted = js.native
}

object AppSelection {
  @scala.inline
  def apply(userChoice: UserChoice, userPrompted: UserPrompted): AppSelection = {
    val __obj = js.Dynamic.literal(userChoice = userChoice.asInstanceOf[js.Any], userPrompted = userPrompted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSelection]
  }
  @scala.inline
  implicit class AppSelectionOps[Self <: AppSelection] (val x: Self) extends AnyVal {
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
    def setUserChoice(value: UserChoice): Self = this.set("userChoice", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPrompted(value: UserPrompted): Self = this.set("userPrompted", value.asInstanceOf[js.Any])
  }
  
}

