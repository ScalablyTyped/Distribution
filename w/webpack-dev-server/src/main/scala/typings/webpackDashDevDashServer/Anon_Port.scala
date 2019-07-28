package typings.webpackDashDevDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Port extends js.Object {
  var port: js.UndefOr[Double] = js.undefined
}

object Anon_Port {
  @scala.inline
  def apply(port: Int | Double = null): Anon_Port = {
    val __obj = js.Dynamic.literal()
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Port]
  }
}

