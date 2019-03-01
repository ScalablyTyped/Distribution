package typings
package threeLib.threeDashCoreMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("args")(args)
    __obj.asInstanceOf[PathAction]
  }
}

