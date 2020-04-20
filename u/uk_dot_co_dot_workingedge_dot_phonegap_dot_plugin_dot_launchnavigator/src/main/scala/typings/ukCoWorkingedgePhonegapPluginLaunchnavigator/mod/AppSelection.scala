package typings.ukCoWorkingedgePhonegapPluginLaunchnavigator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppSelection extends js.Object {
  var userChoice: UserChoice
  var userPrompted: UserPrompted
}

object AppSelection {
  @scala.inline
  def apply(userChoice: UserChoice, userPrompted: UserPrompted): AppSelection = {
    val __obj = js.Dynamic.literal(userChoice = userChoice.asInstanceOf[js.Any], userPrompted = userPrompted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSelection]
  }
}

