package typings.tstl

import typings.std.Date
import typings.std.Partial
import typings.std.Pick
import typings.tstl.ilockableMod.ILockable
import typings.tstl.itimedlockableMod.ITimedLockable
import typings.tstl.tstlStrings.try_lock
import typings.tstl.tstlStrings.try_lock_for
import typings.tstl.tstlStrings.try_lock_until
import typings.tstl.tstlStrings.unlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/UniqueLock", JSImport.Namespace)
@js.native
object uniqueLockMod extends js.Object {
  @js.native
  class UniqueLock[Mutex /* <: IMutex */] protected () extends js.Object {
    def this(mutex: Mutex) = this()
    var mutex_ : js.Any = js.native
    var try_lock_for: js.UndefOr[js.Function2[/* ms */ Double, /* closure */ Closure, js.Promise[Boolean]]] = js.native
    var try_lock_until: js.UndefOr[js.Function2[/* at */ Date, /* closure */ Closure, js.Promise[Boolean]]] = js.native
    def lock(closure: Closure): js.Promise[Unit] = js.native
    def try_lock(closure: Closure): js.Promise[Boolean] = js.native
  }
  
  @js.native
  object UniqueLock extends js.Object {
    def lock[Mutex /* <: Pick[ILockable, typings.tstl.tstlStrings.lock | unlock] */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
    @JSName("try_lock")
    def tryLock[Mutex /* <: Pick[ILockable, try_lock | unlock] */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
    @JSName("try_lock_for")
    def tryLockFor[Mutex /* <: Pick[ITimedLockable, try_lock_for | unlock] */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
    @JSName("try_lock_until")
    def tryLockUntil[Mutex /* <: Pick[ITimedLockable, try_lock_until | unlock] */](mutex: Mutex, at: Date, closure: Closure): js.Promise[Boolean] = js.native
  }
  
  type Closure = js.Function0[Unit | js.Promise[Unit]]
  type IMutex = ILockable with Partial[ITimedLockable]
}

