package typings.tstl

import typings.std.Date
import typings.tstl.anon.PickISharedLockablelocksh
import typings.tstl.anon.PickISharedLockabletryloc
import typings.tstl.anon.PickISharedTimedLockablet
import typings.tstl.anon.PickISharedTimedLockabletTrylockshareduntil
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/SharedLock", JSImport.Namespace)
@js.native
object sharedLockMod extends js.Object {
  /* Inlined tstl.tstl/internal/thread/ISharedLockable.ISharedLockable & std.Partial<tstl.tstl/internal/thread/ISharedTimedLockable.ISharedTimedLockable> */
  @js.native
  trait IMutex extends js.Object {
    @JSName("lock_shared")
    var lock_shared_FIMutex: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
    @JSName("try_lock_shared")
    var try_lock_shared_FIMutex: js.UndefOr[js.Function0[js.Promise[Boolean]]] = js.native
    var try_lock_shared_for: js.UndefOr[js.Function1[/* ms */ Double, js.Promise[Boolean]]] = js.native
    var try_lock_shared_until: js.UndefOr[js.Function1[/* at */ Date, js.Promise[Boolean]]] = js.native
    @JSName("unlock_shared")
    var unlock_shared_FIMutex: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
    /**
      * Lock shared until be unlock shared.
      */
    def lock_shared(): js.Promise[Unit] = js.native
    /**
      * Try lock shared.
      */
    def try_lock_shared(): js.Promise[Boolean] = js.native
    /**
      * Unlock shared.
      */
    def unlock_shared(): js.Promise[Unit] = js.native
  }
  
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
    def lock[Mutex /* <: PickISharedLockablelocksh */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
    @JSName("try_lock")
    def tryLock[Mutex /* <: PickISharedLockabletryloc */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
    @JSName("try_lock_for")
    def tryLockFor[Mutex /* <: PickISharedTimedLockablet */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
    @JSName("try_lock_until")
    def tryLockUntil[Mutex /* <: PickISharedTimedLockabletTrylockshareduntil */](mutex: Mutex, at: Date, closure: Closure): js.Promise[Boolean] = js.native
  }
  
  type Closure = js.Function0[Unit | js.Promise[Unit]]
}

