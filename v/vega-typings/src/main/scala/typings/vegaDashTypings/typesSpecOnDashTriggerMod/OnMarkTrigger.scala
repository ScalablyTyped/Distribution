package typings.vegaDashTypings.typesSpecOnDashTriggerMod

import typings.vegaDashTypings.typesSpecExprMod.Expr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMarkTrigger extends js.Object {
  var modify: js.UndefOr[Expr] = js.undefined
  var trigger: Expr
  var values: js.UndefOr[Expr] = js.undefined
}

object OnMarkTrigger {
  @scala.inline
  def apply(trigger: Expr, modify: Expr = null, values: Expr = null): OnMarkTrigger = {
    val __obj = js.Dynamic.literal(trigger = trigger)
    if (modify != null) __obj.updateDynamic("modify")(modify)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[OnMarkTrigger]
  }
}

