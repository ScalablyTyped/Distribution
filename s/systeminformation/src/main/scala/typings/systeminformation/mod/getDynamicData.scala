package typings.systeminformation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "getDynamicData")
@js.native
object getDynamicData extends js.Object {
  def apply(): js.Promise[_] = js.native
  def apply(
    srv: js.UndefOr[scala.Nothing],
    iface: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* data */ js.Any, _]
  ): js.Promise[_] = js.native
  def apply(srv: js.UndefOr[scala.Nothing], iface: String): js.Promise[_] = js.native
  def apply(srv: js.UndefOr[scala.Nothing], iface: String, cb: js.Function1[/* data */ js.Any, _]): js.Promise[_] = js.native
  def apply(srv: String): js.Promise[_] = js.native
  def apply(srv: String, iface: js.UndefOr[scala.Nothing], cb: js.Function1[/* data */ js.Any, _]): js.Promise[_] = js.native
  def apply(srv: String, iface: String): js.Promise[_] = js.native
  def apply(srv: String, iface: String, cb: js.Function1[/* data */ js.Any, _]): js.Promise[_] = js.native
}

