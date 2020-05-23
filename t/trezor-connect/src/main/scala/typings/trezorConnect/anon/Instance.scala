package typings.trezorConnect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  var instance: js.UndefOr[Double] = js.undefined
  var path: String
  var state: js.UndefOr[String] = js.undefined
}

object Instance {
  @scala.inline
  def apply(path: String, instance: js.UndefOr[Double] = js.undefined, state: String = null): Instance = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(instance)) __obj.updateDynamic("instance")(instance.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

