package typings.vegaDashTypings.typesSpecSignalMod

import typings.vegaDashTypings.typesSpecOnDashEventsMod.OnEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseSignal extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var name: String
  var on: js.UndefOr[js.Array[OnEvent]] = js.undefined
}

object BaseSignal {
  @scala.inline
  def apply(name: String, description: String = null, on: js.Array[OnEvent] = null): BaseSignal = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseSignal]
  }
}

