package typings
package threeLib.srcExtrasCorePathMod

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
    val __obj = js.Dynamic.literal(action = action, args = args)
  
    __obj.asInstanceOf[PathAction]
  }
}

