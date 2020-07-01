package typings.tstl

import typings.std.Date
import typings.tstl.anon.PickILockablelock
import typings.tstl.anon.PickILockablelockunlock
import typings.tstl.anon.PickILockabletrylock
import typings.tstl.anon.PickILockabletrylockunloc
import typings.tstl.anon.PickISharedLockablelocksh
import typings.tstl.anon.PickISharedLockabletryloc
import typings.tstl.anon.PickISharedTimedLockablet
import typings.tstl.anon.PickISharedTimedLockabletTrylockshareduntil
import typings.tstl.anon.PickITimedLockabletrylock
import typings.tstl.anon.PickITimedLockabletrylockTrylockuntil
import typings.tstl.anon.PickSemaphorenumberacquir
import typings.tstl.itimedlockableMod.ITimedLockable
import typings.tstl.sharedLockMod.SharedLock.Closure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread", JSImport.Namespace)
@js.native
object tstlThreadMod extends js.Object {
  @js.native
  class Barrier protected ()
    extends typings.tstl.barrierMod.Barrier {
    /**
      * Initializer Constructor
      *
      * @param size Size of the downward counter.
      */
    def this(size: Double) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class ConditionVariable ()
    extends typings.tstl.conditionVariableMod.ConditionVariable
  
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
      * @param max Number of maximum sections acquirable.
      */
    def this(max: Max) = this()
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
  class Singleton[T] protected ()
    extends typings.tstl.singletonMod.Singleton[T] {
    /**
      * Initializer Constructor.
      *
      * Create a new `Singleton` instance with the *lazy consturctor*.
      *
      * @param lazyConstructor Lazy constructor function returning the promised value.
      */
    def this(lazyConstructor: js.Function0[js.Promise[T]]) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class TimedMutex ()
    extends typings.tstl.timedMutexMod.TimedMutex
  
  def lock(items: PickILockablelock*): js.Promise[Unit] = js.native
  @JSName("sleep_for")
  def sleepFor(ms: Double): js.Promise[Unit] = js.native
  @JSName("sleep_until")
  def sleepUntil(at: Date): js.Promise[Unit] = js.native
  @JSName("try_lock")
  def tryLock(items: PickILockabletrylock*): js.Promise[Double] = js.native
  @js.native
  object Semaphore extends js.Object {
    /**
      * Capsules a {@link Semaphore} to be suitable for the {@link UniqueLock}.
      *
      * @param semaphore Target semaphore to capsule.
      * @return Lockable instance suitable for the {@link UniqueLock}
      */
    @JSName("get_lockable")
    def getLockable[SemaphoreT /* <: PickSemaphorenumberacquir */](semaphore: SemaphoreT): ITimedLockable = js.native
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
  
  @js.native
  object UniqueLock extends js.Object {
    def lock[Mutex /* <: PickILockablelockunlock */](mutex: Mutex, closure: typings.tstl.uniqueLockMod.UniqueLock.Closure): js.Promise[Unit] = js.native
    @JSName("try_lock")
    def tryLock[Mutex /* <: PickILockabletrylockunloc */](mutex: Mutex, closure: typings.tstl.uniqueLockMod.UniqueLock.Closure): js.Promise[Boolean] = js.native
    @JSName("try_lock_for")
    def tryLockFor[Mutex /* <: PickITimedLockabletrylock */](mutex: Mutex, ms: Double, closure: typings.tstl.uniqueLockMod.UniqueLock.Closure): js.Promise[Boolean] = js.native
    @JSName("try_lock_until")
    def tryLockUntil[Mutex /* <: PickITimedLockabletrylockTrylockuntil */](mutex: Mutex, at: Date, closure: typings.tstl.uniqueLockMod.UniqueLock.Closure): js.Promise[Boolean] = js.native
  }
  
}

