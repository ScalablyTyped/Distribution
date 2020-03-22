package typings.tstl

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/UniqueLock", JSImport.Namespace)
@js.native
object uniqueLockMod extends js.Object {
  /* Inlined tstl.tstl/thread/ILockable.ILockable & std.Partial<tstl.tstl/internal/thread/ITimedLockable.ITimedLockable> */
  @js.native
  trait IMutex extends js.Object {
    @JSName("lock")
    var lock_FIMutex: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
    @JSName("try_lock")
    var try_lock_FIMutex: js.UndefOr[js.Function0[js.Promise[Boolean]]] = js.native
    var try_lock_for: js.UndefOr[js.Function1[/* ms */ Double, js.Promise[Boolean]]] = js.native
    var try_lock_until: js.UndefOr[js.Function1[/* at */ Date, js.Promise[Boolean]]] = js.native
    @JSName("unlock")
    var unlock_FIMutex: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
    /**
      * Lock until be unlocked.
      */
    def lock(): js.Promise[Unit] = js.native
    /**
      * Try {@link lock}.
      *
      * @return Whether succeeded to lock or not.
      */
    def try_lock(): js.Promise[Boolean] = js.native
    /**
      * Unlock.
      */
    def unlock(): js.Promise[Unit] = js.native
  }
  
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
    def lock[Mutex /* <: PickILockablelockunlock */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
    @JSName("try_lock")
    def tryLock[Mutex /* <: PickILockabletrylockunloc */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
    @JSName("try_lock_for")
    def tryLockFor[Mutex /* <: PickITimedLockabletrylock */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
    @JSName("try_lock_until")
    def tryLockUntil[Mutex /* <: PickITimedLockabletrylockTrylockuntil */](mutex: Mutex, at: Date, closure: Closure): js.Promise[Boolean] = js.native
  }
  
  type Closure = js.Function0[Unit | js.Promise[Unit]]
}

