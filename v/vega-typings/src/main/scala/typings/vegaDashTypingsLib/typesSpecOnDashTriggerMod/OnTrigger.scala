package typings
package vegaDashTypingsLib.typesSpecOnDashTriggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnTrigger extends js.Object {
  var insert: js.UndefOr[vegaDashTypingsLib.typesSpecExprMod.Expr] = js.undefined
  var modify: js.UndefOr[vegaDashTypingsLib.typesSpecExprMod.Expr] = js.undefined
  var remove: js.UndefOr[scala.Boolean | vegaDashTypingsLib.typesSpecExprMod.Expr] = js.undefined
  var toggle: js.UndefOr[vegaDashTypingsLib.typesSpecExprMod.Expr] = js.undefined
  var trigger: vegaDashTypingsLib.typesSpecExprMod.Expr
  var values: js.UndefOr[vegaDashTypingsLib.typesSpecExprMod.Expr] = js.undefined
}

object OnTrigger {
  @scala.inline
  def apply(
    trigger: vegaDashTypingsLib.typesSpecExprMod.Expr,
    insert: vegaDashTypingsLib.typesSpecExprMod.Expr = null,
    modify: vegaDashTypingsLib.typesSpecExprMod.Expr = null,
    remove: scala.Boolean | vegaDashTypingsLib.typesSpecExprMod.Expr = null,
    toggle: vegaDashTypingsLib.typesSpecExprMod.Expr = null,
    values: vegaDashTypingsLib.typesSpecExprMod.Expr = null
  ): OnTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("trigger")(trigger)
    if (insert != null) __obj.updateDynamic("insert")(insert)
    if (modify != null) __obj.updateDynamic("modify")(modify)
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[OnTrigger]
  }
}

