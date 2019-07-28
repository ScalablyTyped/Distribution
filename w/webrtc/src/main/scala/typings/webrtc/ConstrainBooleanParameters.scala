package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstrainBooleanParameters extends js.Object {
  var exact: js.UndefOr[Boolean] = js.undefined
  var ideal: js.UndefOr[Boolean] = js.undefined
}

object ConstrainBooleanParameters {
  @scala.inline
  def apply(exact: js.UndefOr[Boolean] = js.undefined, ideal: js.UndefOr[Boolean] = js.undefined): ConstrainBooleanParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (!js.isUndefined(ideal)) __obj.updateDynamic("ideal")(ideal)
    __obj.asInstanceOf[ConstrainBooleanParameters]
  }
}

