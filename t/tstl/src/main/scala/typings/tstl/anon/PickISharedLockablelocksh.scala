package typings.tstl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<tstl.tstl/base/thread/ISharedLockable.ISharedLockable, 'lock_shared' | 'unlock_shared'> */
@js.native
trait PickISharedLockablelocksh extends js.Object {
  @JSName("lock_shared")
  var lock_shared_Original: js.Function0[js.Promise[Unit]] = js.native
  @JSName("unlock_shared")
  var unlock_shared_Original: js.Function0[js.Promise[Unit]] = js.native
  def lock_shared(): js.Promise[Unit] = js.native
  def unlock_shared(): js.Promise[Unit] = js.native
}

