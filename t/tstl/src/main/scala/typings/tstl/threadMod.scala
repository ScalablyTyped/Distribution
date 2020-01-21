package typings.tstl

import typings.std.Date
import typings.std.Pick
import typings.tstl.ilockableMod.ILockable
import typings.tstl.isharedlockableMod.ISharedLockable
import typings.tstl.isharedtimedlockableMod.ISharedTimedLockable
import typings.tstl.itimedlockableMod.ITimedLockable
import typings.tstl.sharedLockMod.Closure
import typings.tstl.sharedLockMod.IMutex
import typings.tstl.tstlStrings.lock
import typings.tstl.tstlStrings.lock_shared
import typings.tstl.tstlStrings.try_lock
import typings.tstl.tstlStrings.try_lock_for
import typings.tstl.tstlStrings.try_lock_shared
import typings.tstl.tstlStrings.try_lock_shared_for
import typings.tstl.tstlStrings.try_lock_shared_until
import typings.tstl.tstlStrings.try_lock_until
import typings.tstl.tstlStrings.unlock
import typings.tstl.tstlStrings.unlock_shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread", JSImport.Namespace)
@js.native
object threadMod extends js.Object {
  @js.native
  class Barrier protected ()
    extends typings.tstl.barrierMod.Barrier {
    def this(size: Double) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class ConditionVariable ()
    extends typings.tstl.conditionVariableMod.ConditionVariable
  
  @js.native
  class FlexBarrier protected ()
    extends typings.tstl.flexBarrierMod.FlexBarrier {
    /**
      * Initializer Constructor.
      *
      * @param size Size of the downward counter.
      * @param complete Complete function re-configuring *size* when downward count be zero. Default is a function always returning -1, which means the barrier is not reusable more.
      */
    def this(size: Double) = this()
    def this(size: Double, complete: js.Function0[Double]) = this()
  }
  
  @js.native
  class Latch protected ()
    extends typings.tstl.latchMod.Latch {
    /**
      * Initializer Constructor.
      *
      * @param size Size of the downward counter.
      */
    def this(size: Double) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class Mutex ()
    extends typings.tstl.mutexMod.Mutex
  
  @js.native
  class Semaphore[Max /* <: Double */] protected ()
    extends typings.tstl.semaphoreMod.Semaphore[Max] {
    /**
      * Initializer Constructor.
      *
      * @param max Number of maximum sections lockable.
      */
    def this(max: Max) = this()
  }
  
  @js.native
  class SharedLock[Mutex /* <: IMutex */] protected ()
    extends typings.tstl.sharedLockMod.SharedLock[Mutex] {
    def this(mutex: Mutex) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class SharedMutex ()
    extends typings.tstl.sharedMutexMod.SharedMutex
  
  @js.native
  /**
    * Default Constructor.
    */
  class SharedTimedMutex ()
    extends typings.tstl.sharedTimedMutexMod.SharedTimedMutex
  
  @js.native
  /**
    * Default Constructor.
    */
  class TimedMutex ()
    extends typings.tstl.timedMutexMod.TimedMutex
  
  @js.native
  class UniqueLock[Mutex /* <: typings.tstl.uniqueLockMod.IMutex */] protected ()
    extends typings.tstl.uniqueLockMod.UniqueLock[Mutex] {
    def this(mutex: Mutex) = this()
  }
  
  @JSName("lock")
  def lock_lock(items: (Pick[ILockable, lock])*): js.Promise[Unit] = js.native
  @JSName("sleep_for")
  def sleepFor(ms: Double): js.Promise[Unit] = js.native
  @JSName("sleep_until")
  def sleepUntil(at: Date): js.Promise[Unit] = js.native
  @JSName("try_lock")
  def tryLock_trylock(items: (Pick[ILockable, try_lock])*): js.Promise[Double] = js.native
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
  
  @js.native
  object UniqueLock extends js.Object {
    def lock[Mutex /* <: Pick[ILockable, typings.tstl.tstlStrings.lock | unlock] */](mutex: Mutex, closure: typings.tstl.uniqueLockMod.Closure): js.Promise[Unit] = js.native
    @JSName("try_lock")
    def tryLock[Mutex /* <: Pick[ILockable, try_lock | unlock] */](mutex: Mutex, closure: typings.tstl.uniqueLockMod.Closure): js.Promise[Boolean] = js.native
    @JSName("try_lock_for")
    def tryLockFor[Mutex /* <: Pick[ITimedLockable, try_lock_for | unlock] */](mutex: Mutex, ms: Double, closure: typings.tstl.uniqueLockMod.Closure): js.Promise[Boolean] = js.native
    @JSName("try_lock_until")
    def tryLockUntil[Mutex /* <: Pick[ITimedLockable, try_lock_until | unlock] */](mutex: Mutex, at: Date, closure: typings.tstl.uniqueLockMod.Closure): js.Promise[Boolean] = js.native
  }
  
}

