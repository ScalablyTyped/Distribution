package typings
package vegaDashTypingsLib.typesSpecSignalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushSignal
  extends BaseSignal
     with Signal {
  var push: js.UndefOr[vegaDashTypingsLib.vegaDashTypingsLibStrings.outer] = js.undefined
}

object PushSignal {
  @scala.inline
  def apply(
    name: java.lang.String,
    description: java.lang.String = null,
    on: js.Array[vegaDashTypingsLib.typesSpecOnDashEventsMod.OnEvent] = null,
    push: vegaDashTypingsLib.vegaDashTypingsLibStrings.outer = null
  ): PushSignal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (on != null) __obj.updateDynamic("on")(on)
    if (push != null) __obj.updateDynamic("push")(push)
    __obj.asInstanceOf[PushSignal]
  }
}

