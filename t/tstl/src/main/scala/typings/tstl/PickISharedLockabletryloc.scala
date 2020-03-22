package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<tstl.tstl/internal/thread/ISharedLockable.ISharedLockable, 'try_lock_shared' | 'unlock_shared'> */
@js.native
trait PickISharedLockabletryloc extends js.Object {
  @JSName("try_lock_shared")
  var try_lock_shared_Original: js.Function0[js.Promise[Boolean]] = js.native
  @JSName("unlock_shared")
  var unlock_shared_Original: js.Function0[js.Promise[Unit]] = js.native
  def try_lock_shared(): js.Promise[Boolean] = js.native
  def unlock_shared(): js.Promise[Unit] = js.native
}

