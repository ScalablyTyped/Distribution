package typings.tstl

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<tstl.tstl/internal/thread/ISharedTimedLockable.ISharedTimedLockable, 'try_lock_shared_until' | 'unlock_shared'> */
@js.native
trait PickISharedTimedLockabletTrylockshareduntil extends js.Object {
  @JSName("try_lock_shared_until")
  var try_lock_shared_until_Original: js.Function1[/* at */ Date, js.Promise[Boolean]] = js.native
  @JSName("unlock_shared")
  var unlock_shared_Original: js.Function0[js.Promise[Unit]] = js.native
  def try_lock_shared_until(at: Date): js.Promise[Boolean] = js.native
  def unlock_shared(): js.Promise[Unit] = js.native
}

