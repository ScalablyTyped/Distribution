package typings.ydnDb.ydn.db

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  def abort(): js.Any
  def always(callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def canAbort(): Boolean
  def done(callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def fail(callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def `then`(
    success_callback: js.Function1[/* data */ js.Any, _],
    error_callback: js.Function1[/* data */ Error, _]
  ): js.Any
}

object Request {
  @scala.inline
  def apply(
    abort: () => js.Any,
    always: js.Function1[/* data */ js.Any, Unit] => js.Any,
    canAbort: () => Boolean,
    done: js.Function1[/* data */ js.Any, Unit] => js.Any,
    fail: js.Function1[/* data */ js.Any, Unit] => js.Any,
    `then`: (js.Function1[/* data */ js.Any, _], js.Function1[/* data */ Error, _]) => js.Any
  ): Request = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), always = js.Any.fromFunction1(always), canAbort = js.Any.fromFunction0(canAbort), done = js.Any.fromFunction1(done), fail = js.Any.fromFunction1(fail))
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[Request]
  }
}

