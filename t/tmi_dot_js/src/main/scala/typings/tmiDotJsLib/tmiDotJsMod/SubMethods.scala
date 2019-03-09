package typings
package tmiDotJsLib.tmiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubMethods extends js.Object {
  var plan: js.UndefOr[SubMethod] = js.undefined
  var planName: js.UndefOr[java.lang.String] = js.undefined
  var prime: js.UndefOr[scala.Boolean] = js.undefined
}

object SubMethods {
  @scala.inline
  def apply(
    plan: SubMethod = null,
    planName: java.lang.String = null,
    prime: js.UndefOr[scala.Boolean] = js.undefined
  ): SubMethods = {
    val __obj = js.Dynamic.literal()
    if (plan != null) __obj.updateDynamic("plan")(plan)
    if (planName != null) __obj.updateDynamic("planName")(planName)
    if (!js.isUndefined(prime)) __obj.updateDynamic("prime")(prime)
    __obj.asInstanceOf[SubMethods]
  }
}

