package typings.turbolinks.turbolinksMod

import typings.turbolinks.turbolinksStrings.advance
import typings.turbolinks.turbolinksStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var action: advance | replace
}

object Action {
  @scala.inline
  def apply(action: advance | replace): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Action]
  }
}

