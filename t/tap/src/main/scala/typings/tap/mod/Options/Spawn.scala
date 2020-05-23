package typings.tap.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spawn extends Assert {
  var bail: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Spawn {
  @scala.inline
  def apply(
    bail: js.UndefOr[Boolean] = js.undefined,
    diagnostic: js.UndefOr[Boolean] = js.undefined,
    skip: Boolean | String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    todo: Boolean | String = null
  ): Spawn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bail)) __obj.updateDynamic("bail")(bail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(diagnostic)) __obj.updateDynamic("diagnostic")(diagnostic.get.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (todo != null) __obj.updateDynamic("todo")(todo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spawn]
  }
}

