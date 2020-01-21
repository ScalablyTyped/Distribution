package typings.tstl.mod

import typings.std.Date
import typings.std.Pick
import typings.tstl.isharedlockableMod.ISharedLockable
import typings.tstl.isharedtimedlockableMod.ISharedTimedLockable
import typings.tstl.sharedLockMod.Closure
import typings.tstl.sharedLockMod.IMutex
import typings.tstl.tstlStrings.lock_shared
import typings.tstl.tstlStrings.try_lock_shared
import typings.tstl.tstlStrings.try_lock_shared_for
import typings.tstl.tstlStrings.try_lock_shared_until
import typings.tstl.tstlStrings.unlock_shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "SharedLock")
@js.native
class SharedLock[Mutex /* <: IMutex */] protected ()
  extends typings.tstl.threadMod.SharedLock[Mutex] {
  def this(mutex: Mutex) = this()
}

@JSImport("tstl", "SharedLock")
@js.native
object SharedLock extends js.Object {
  def lock[Mutex /* <: Pick[ISharedLockable, lock_shared | unlock_shared] */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
  @JSName("try_lock")
  def tryLock[Mutex /* <: Pick[ISharedLockable, try_lock_shared | unlock_shared] */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
  @JSName("try_lock_for")
  def tryLockFor[Mutex /* <: Pick[ISharedTimedLockable, try_lock_shared_for | unlock_shared] */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
  @JSName("try_lock_until")
  def tryLockUntil[Mutex /* <: Pick[ISharedTimedLockable, try_lock_shared_until | unlock_shared] */](mutex: Mutex, at: Date, closure: Closure): js.Promise[Boolean] = js.native
}

