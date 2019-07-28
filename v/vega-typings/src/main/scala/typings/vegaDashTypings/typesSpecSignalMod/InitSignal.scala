package typings.vegaDashTypings.typesSpecSignalMod

import typings.vegaDashTypings.typesSpecBindMod.Binding
import typings.vegaDashTypings.typesSpecExprMod.Expr
import typings.vegaDashTypings.typesSpecOnDashEventsMod.OnEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitSignal
  extends BaseSignal
     with Signal {
  var bind: js.UndefOr[Binding] = js.undefined
  var init: Expr
  var value: js.UndefOr[SignalValue] = js.undefined
}

object InitSignal {
  @scala.inline
  def apply(
    init: Expr,
    name: String,
    bind: Binding = null,
    description: String = null,
    on: js.Array[OnEvent] = null,
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

