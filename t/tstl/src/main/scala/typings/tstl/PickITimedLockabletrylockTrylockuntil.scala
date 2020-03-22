package typings.tstl

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<tstl.tstl/internal/thread/ITimedLockable.ITimedLockable, 'try_lock_until' | 'unlock'> */
@js.native
trait PickITimedLockabletrylockTrylockuntil extends js.Object {
  @JSName("try_lock_until")
  var try_lock_until_Original: js.Function1[/* at */ Date, js.Promise[Boolean]] = js.native
  @JSName("unlock")
  var unlock_Original: js.Function0[js.Promise[Unit]] = js.native
  def try_lock_until(at: Date): js.Promise[Boolean] = js.native
  def unlock(): js.Promise[Unit] = js.native
}

