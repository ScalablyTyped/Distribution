package typings
package turbolinksLib.turbolinksMod.TurbolinksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var action: turbolinksLib.turbolinksLibStrings.advance | turbolinksLib.turbolinksLibStrings.replace
}

object Action {
  @scala.inline
  def apply(action: turbolinksLib.turbolinksLibStrings.advance | turbolinksLib.turbolinksLibStrings.replace): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Action]
  }
}

