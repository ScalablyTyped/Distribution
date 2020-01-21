package typings.vegaTypings.onTriggerMod

import typings.vegaTypings.exprMod.Expr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnTrigger extends js.Object {
  var insert: js.UndefOr[Expr] = js.undefined
  var modify: js.UndefOr[Expr] = js.undefined
  var remove: js.UndefOr[Boolean | Expr] = js.undefined
  var toggle: js.UndefOr[Expr] = js.undefined
  var trigger: Expr
  var values: js.UndefOr[Expr] = js.undefined
}

object OnTrigger {
  @scala.inline
  def apply(
    trigger: Expr,
    insert: Expr = null,
    modify: Expr = null,
    remove: Boolean | Expr = null,
    toggle: Expr = null,
    values: Expr = null
  ): OnTrigger = {
    val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(insert.asInstanceOf[js.Any])
    if (modify != null) __obj.updateDynamic("modify")(modify.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnTrigger]
  }
}

