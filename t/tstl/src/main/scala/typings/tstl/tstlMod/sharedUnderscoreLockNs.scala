package typings.tstl.tstlMod

import typings.std.Date
import typings.std.Pick
import typings.tstl.baseThreadUnderscoreISharedLockableMod._ISharedLockable
import typings.tstl.baseThreadUnderscoreISharedTimedLockableMod._ISharedTimedLockable
import typings.tstl.threadSharedLockMod.Closure
import typings.tstl.tstlStrings.lock_shared
import typings.tstl.tstlStrings.try_lock_shared
import typings.tstl.tstlStrings.try_lock_shared_for
import typings.tstl.tstlStrings.try_lock_shared_until
import typings.tstl.tstlStrings.unlock_shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "shared_lock")
@js.native
object sharedUnderscoreLockNs extends js.Object {
  def lock[Mutex /* <: Pick[_ISharedLockable, lock_shared | unlock_shared] */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
  def try_lock[Mutex /* <: Pick[_ISharedLockable, try_lock_shared | unlock_shared] */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
  def try_lock_for[Mutex /* <: Pick[_ISharedTimedLockable, try_lock_shared_for | unlock_shared] */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
  def try_lock_until[Mutex /* <: Pick[_ISharedTimedLockable, try_lock_shared_until | unlock_shared] */](mutex: Mutex, at: Date, closure: Closure): js.Promise[Boolean] = js.native
}

