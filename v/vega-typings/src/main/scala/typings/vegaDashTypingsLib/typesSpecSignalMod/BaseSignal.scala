package typings
package vegaDashTypingsLib.typesSpecSignalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseSignal extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var on: js.UndefOr[js.Array[vegaDashTypingsLib.typesSpecOnDashEventsMod.OnEvent]] = js.undefined
}

object BaseSignal {
  @scala.inline
  def apply(
    name: java.lang.String,
    description: java.lang.String = null,
    on: js.Array[vegaDashTypingsLib.typesSpecOnDashEventsMod.OnEvent] = null
  ): BaseSignal = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (on != null) __obj.updateDynamic("on")(on)
    __obj.asInstanceOf[BaseSignal]
  }
}

