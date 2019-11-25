package typings.trezorDashConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Instance extends js.Object {
  var instance: js.UndefOr[Double] = js.undefined
  var path: String
  var state: js.UndefOr[String] = js.undefined
}

object Anon_Instance {
  @scala.inline
  def apply(path: String, instance: Int | Double = null, state: String = null): Anon_Instance = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Instance]
  }
}

