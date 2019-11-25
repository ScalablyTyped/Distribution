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
    val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
    if (modify != null) __obj.updateDynamic("modify")(modify.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMarkTrigger]
  }
}

