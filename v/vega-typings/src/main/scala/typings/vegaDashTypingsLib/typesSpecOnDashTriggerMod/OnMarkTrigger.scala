package typings
package vegaDashTypingsLib.typesSpecOnDashTriggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMarkTrigger extends js.Object {
  var modify: js.UndefOr[vegaDashTypingsLib.typesSpecExprMod.Expr] = js.undefined
  var trigger: vegaDashTypingsLib.typesSpecExprMod.Expr
  var values: js.UndefOr[vegaDashTypingsLib.typesSpecExprMod.Expr] = js.undefined
}

object OnMarkTrigger {
  @scala.inline
  def apply(
    trigger: vegaDashTypingsLib.typesSpecExprMod.Expr,
    modify: vegaDashTypingsLib.typesSpecExprMod.Expr = null,
    values: vegaDashTypingsLib.typesSpecExprMod.Expr = null
  ): OnMarkTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("trigger")(trigger)
    if (modify != null) __obj.updateDynamic("modify")(modify)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[OnMarkTrigger]
  }
}

