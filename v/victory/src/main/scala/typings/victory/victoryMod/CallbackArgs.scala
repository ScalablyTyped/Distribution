package typings.victory.victoryMod

import typings.victory.Anon_XYD3Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the first parameter of a callback when a callback is used to
  * resolve the value of a property instead of a concrete value.
  *
  * Note that additional properties here like `scale`, `x`, `y`, etc are resolved
  * values of properties from the VictoryXXXProps for each component.
  */
trait CallbackArgs extends js.Object {
  var active: Boolean
  var datum: js.Any
  var horizontal: Boolean
  var scale: js.UndefOr[Anon_XYD3Scale] = js.undefined
  var x: Double
  var y: Double
}

object CallbackArgs {
  @scala.inline
  def apply(
    active: Boolean,
    datum: js.Any,
    horizontal: Boolean,
    x: Double,
    y: Double,
    scale: Anon_XYD3Scale = null
  ): CallbackArgs = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackArgs]
  }
}

