package typings.tstl

import typings.std.Date
import typings.std.Partial
import typings.std.Pick
import typings.tstl.baseThreadUnderscoreITimedLockableMod._ITimedLockable
import typings.tstl.threadILockableMod.ILockable
import typings.tstl.tstlStrings.unlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/UniqueLock", JSImport.Namespace)
@js.native
object threadUniqueLockMod extends js.Object {
  @js.native
  class UniqueLock[Mutex /* <: IMutex */] protected () extends js.Object {
    def this(mutex: Mutex) = this()
    /**
      * @hidden
      */
    var mutex_ : js.Any = js.native
    var try_lock_for: js.UndefOr[js.Function2[/* ms */ Double, /* closure */ Closure, js.Promise[Boolean]]] = js.native
    var try_lock_until: js.UndefOr[js.Function2[/* at */ Date, /* closure */ Closure, js.Promise[Boolean]]] = js.native
    def lock(closure: Closure): js.Promise[Unit] = js.native
    def try_lock(closure: Closure): js.Promise[Boolean] = js.native
  }
  
  @js.native
  class unique_lock[Mutex /* <: IMutex */] protected () extends UniqueLock[Mutex] {
    def this(mutex: Mutex) = this()
  }
  
  @js.native
  object UniqueLock extends js.Object {
    def lock[Mutex /* <: Pick[ILockable, typings.tstl.tstlStrings.lock | unlock] */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
    def try_lock[Mutex /* <: Pick[ILockable, typings.tstl.tstlStrings.try_lock | unlock] */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
    def try_lock_for[Mutex /* <: Pick[_ITimedLockable, typings.tstl.tstlStrings.try_lock_for | unlock] */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
    def try_lock_until[Mutex /* <: Pick[_ITimedLockable, typings.tstl.tstlStrings.try_lock_until | unlock] */](mutex: Mutex, at: Date, closure: Closure): js.Promise[Boolean] = js.native
  }
  
  @js.native
  object unique_lock extends js.Object {
    def lock[Mutex /* <: Pick[ILockable, typings.tstl.tstlStrings.lock | unlock] */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
    def try_lock[Mutex /* <: Pick[ILockable, typings.tstl.tstlStrings.try_lock | unlock] */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
    def try_lock_for[Mutex /* <: Pick[_ITimedLockable, typings.tstl.tstlStrings.try_lock_for | unlock] */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
    def try_lock_until[Mutex /* <: Pick[_ITimedLockable, typings.tstl.tstlStrings.try_lock_until | unlock] */](mutex: Mutex, at: Date, closure: Closure): js.Promise[Boolean] = js.native
  }
  
  /**
    * @hidden
    */
  type Closure = js.Function0[Unit | js.Promise[Unit]]
  /**
    * @hidden
    */
  type IMutex = ILockable with Partial[_ITimedLockable]
}

