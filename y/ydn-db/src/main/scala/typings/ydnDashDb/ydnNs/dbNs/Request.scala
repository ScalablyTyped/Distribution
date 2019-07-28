package typings.ydnDashDb.ydnNs.dbNs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ydn.db.Request")
@js.native
class Request () extends js.Object {
  def abort(): js.Any = js.native
  def always(callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  def canAbort(): Boolean = js.native
  def done(callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  def fail(callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  def `then`(
    success_callback: js.Function1[/* data */ js.Any, _],
    error_callback: js.Function1[/* data */ Error, _]
  ): js.Any = js.native
}

