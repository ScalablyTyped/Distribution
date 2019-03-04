package typings
package vegaDashTypingsLib.typesSpecSignalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewSignal
  extends BaseSignal
     with Signal {
  var bind: js.UndefOr[vegaDashTypingsLib.typesSpecBindMod.Binding] = js.undefined
  var react: js.UndefOr[scala.Boolean] = js.undefined
  var update: js.UndefOr[vegaDashTypingsLib.typesSpecExprMod.Expr] = js.undefined
  var value: js.UndefOr[SignalValue] = js.undefined
}

object NewSignal {
  @scala.inline
  def apply(
    name: java.lang.String,
    bind: vegaDashTypingsLib.typesSpecBindMod.Binding = null,
    description: java.lang.String = null,
    on: js.Array[vegaDashTypingsLib.typesSpecOnDashEventsMod.OnEvent] = null,
    react: js.UndefOr[scala.Boolean] = js.undefined,
    update: vegaDashTypingsLib.typesSpecExprMod.Expr = null,
    value: SignalValue = null
  ): NewSignal = {
    val __obj = js.Dynamic.literal(name = name)
    if (bind != null) __obj.updateDynamic("bind")(bind)
    if (description != null) __obj.updateDynamic("description")(description)
    if (on != null) __obj.updateDynamic("on")(on)
    if (!js.isUndefined(react)) __obj.updateDynamic("react")(react)
    if (update != null) __obj.updateDynamic("update")(update)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[NewSignal]
  }
}

