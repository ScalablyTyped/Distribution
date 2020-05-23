package typings.ydnDb.global.ydn.db

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ydn.db.Request")
@js.native
class Request ()
  extends typings.ydnDb.ydn.db.Request {
  /* CompleteClass */
  override def abort(): js.Any = js.native
  /* CompleteClass */
  override def always(callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  /* CompleteClass */
  override def canAbort(): Boolean = js.native
  /* CompleteClass */
  override def done(callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  /* CompleteClass */
  override def fail(callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  /* CompleteClass */
  override def `then`(
    success_callback: js.Function1[/* data */ js.Any, _],
    error_callback: js.Function1[/* data */ Error, _]
  ): js.Any = js.native
}

