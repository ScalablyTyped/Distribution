package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionMap extends js.Object {
  var state: js.UndefOr[StateValue]
}

object TransitionMap {
  @scala.inline
  def apply(state: StateValue = null): TransitionMap = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionMap]
  }
}

