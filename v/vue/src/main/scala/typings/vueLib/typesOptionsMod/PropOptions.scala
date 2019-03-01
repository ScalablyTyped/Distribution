package typings
package vueLib.typesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropOptions[T] extends js.Object {
  var default: js.UndefOr[T | scala.Null | (js.Function0[js.UndefOr[T | scala.Null]])] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[PropType[T]] = js.undefined
  var validator: js.UndefOr[js.Function1[/* value */ T, scala.Boolean]] = js.undefined
}

object PropOptions {
  @scala.inline
  def apply[T](
    default: T | (js.Function0[js.UndefOr[T | scala.Null]]) = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: PropType[T] = null,
    validator: js.Function1[/* value */ T, scala.Boolean] = null
  ): PropOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(validator)
    __obj.asInstanceOf[PropOptions[T]]
  }
}

