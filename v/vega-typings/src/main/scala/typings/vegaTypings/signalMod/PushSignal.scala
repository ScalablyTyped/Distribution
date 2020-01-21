package typings.vegaTypings.signalMod

import typings.vegaTypings.onEventsMod.OnEvent
import typings.vegaTypings.vegaTypingsStrings.outer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushSignal
  extends BaseSignal
     with Signal {
  var push: outer
}

object PushSignal {
  @scala.inline
  def apply(name: String, push: outer, description: String = null, on: js.Array[OnEvent] = null): PushSignal = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushSignal]
  }
}

