package typings
package vegaDashTypingsLib.typesSpecSignalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitSignal
  extends BaseSignal
     with Signal {
  var bind: js.UndefOr[vegaDashTypingsLib.typesSpecBindMod.Binding] = js.undefined
  var init: vegaDashTypingsLib.typesSpecExprMod.Expr
  var value: js.UndefOr[SignalValue] = js.undefined
}

object InitSignal {
  @scala.inline
  def apply(
    init: vegaDashTypingsLib.typesSpecExprMod.Expr,
    name: java.lang.String,
    bind: vegaDashTypingsLib.typesSpecBindMod.Binding = null,
    description: java.lang.String = null,
    on: js.Array[vegaDashTypingsLib.typesSpecOnDashEventsMod.OnEvent] = null,
    value: SignalValue = null
  ): InitSignal = {
    val __obj = js.Dynamic.literal(init = init, name = name)
    if (bind != null) __obj.updateDynamic("bind")(bind)
    if (description != null) __obj.updateDynamic("description")(description)
    if (on != null) __obj.updateDynamic("on")(on)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[InitSignal]
  }
}

