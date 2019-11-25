package typings.three.srcExtrasCorePathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathAction extends js.Object {
  var action: PathActions
  var args: js.Any
}

object PathAction {
  @scala.inline
  def apply(action: PathActions, args: js.Any): PathAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PathAction]
  }
}

