package typings.vegaDashTypings.typesSpecSignalMod

import typings.vegaDashTypings.typesSpecOnDashEventsMod.OnEvent
import typings.vegaDashTypings.vegaDashTypingsStrings.outer
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
    val __obj = js.Dynamic.literal(name = name, push = push)
    if (description != null) __obj.updateDynamic("description")(description)
    if (on != null) __obj.updateDynamic("on")(on)
    __obj.asInstanceOf[PushSignal]
  }
}

