package typings.tstl

import typings.std.Date
import typings.std.Partial
import typings.std.Pick
import typings.tstl.isharedlockableMod.ISharedLockable
import typings.tstl.isharedtimedlockableMod.ISharedTimedLockable
import typings.tstl.tstlStrings.lock_shared
import typings.tstl.tstlStrings.try_lock_shared
import typings.tstl.tstlStrings.try_lock_shared_for
import typings.tstl.tstlStrings.try_lock_shared_until
import typings.tstl.tstlStrings.unlock_shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/SharedLock", JSImport.Namespace)
@js.native
object sharedLockMod extends js.Object {
  @js.native
  class SharedLock[Mutex /* <: IMutex */] protected () extends js.Object {
    def this(mutex: Mutex) = this()
    var mutex_ : js.Any = js.native
    var try_lock_for: js.UndefOr[js.Function2[/* ms */ Double, /* closure */ Closure, js.Promise[Boolean]]] = js.native
    var try_lock_until: js.UndefOr[js.Function2[/* at */ Date, /* closure */ Closure, js.Promise[Boolean]]] = js.native
    def lock(closure: Closure): js.Promise[Unit] = js.native
    def try_lock(closure: Closure): js.Promise[Boolean] = js.native
  }
  
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
  
  type Closure = js.Function0[Unit | js.Promise[Unit]]
  type IMutex = ISharedLockable with Partial[ISharedTimedLockable]
}

