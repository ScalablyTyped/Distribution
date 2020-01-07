package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Date
import typings.std.Pick
import typings.tstl.threadILockableMod.ILockable
import typings.tstl.threadSharedLockMod.Closure
import typings.tstl.threadSharedLockMod.IMutex
import typings.tstl.tstlStrings.lock
import typings.tstl.tstlStrings.lock_shared
import typings.tstl.tstlStrings.try_lock
import typings.tstl.tstlStrings.try_lock_shared
import typings.tstl.tstlStrings.try_lock_shared_for
import typings.tstl.tstlStrings.try_lock_shared_until
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
    extends typings.tstl.threadBarrierMod.Barrier {
    def this(size: Double) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class ConditionVariable ()
    extends typings.tstl.threadConditionVariableMod.ConditionVariable
  
  @js.native
  class FlexBarrier protected ()
    extends typings.tstl.threadFlexBarrierMod.FlexBarrier {
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
    extends typings.tstl.threadLatchMod.Latch {
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
    extends typings.tstl.threadMutexMod.Mutex
  
  @js.native
  class Semaphore[Max /* <: Double */] protected ()
    extends typings.tstl.threadSemaphoreMod.Semaphore[Max] {
    /**
      * Initializer Constructor.
      *
      * @param max Number of maximum sections lockable.
      */
    def this(max: Max) = this()
  }
  
  @js.native
  class SharedLock[Mutex /* <: IMutex */] protected ()
    extends typings.tstl.threadSharedLockMod.SharedLock[Mutex] {
    def this(mutex: Mutex) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class SharedMutex ()
    extends typings.tstl.threadSharedMutexMod.SharedMutex
  
  @js.native
  /**
    * Default Constructor.
    */
  class SharedTimedMutex ()
    extends typings.tstl.threadSharedTimedMutexMod.SharedTimedMutex
  
  @js.native
  /**
    * Default Constructor.
    */
  class TimedMutex ()
    extends typings.tstl.threadTimedMutexMod.TimedMutex
  
  @js.native
  class UniqueLock[Mutex /* <: typings.tstl.threadUniqueLockMod.IMutex */] protected ()
    extends typings.tstl.threadUniqueLockMod.UniqueLock[Mutex] {
    def this(mutex: Mutex) = this()
  }
  
  @js.native
  class couting_semaphore[Max /* <: Double */] protected ()
    extends typings.tstl.threadSemaphoreMod.couting_semaphore[Max] {
    /**
      * Initializer Constructor.
      *
      * @param max Number of maximum sections lockable.
      */
    def this(max: Max) = this()
  }
  
  @js.native
  class shared_lock[Mutex /* <: IMutex */] protected ()
    extends typings.tstl.threadSharedLockMod.shared_lock[Mutex] {
    def this(mutex: Mutex) = this()
  }
  
  @js.native
  class unique_lock[Mutex /* <: typings.tstl.threadUniqueLockMod.IMutex */] protected ()
    extends typings.tstl.threadUniqueLockMod.unique_lock[Mutex] {
    def this(mutex: Mutex) = this()
  }
  
  val barrier: Instantiable1[/* size */ Double, typings.tstl.threadBarrierMod.Barrier] = js.native
  val condition_variable: Instantiable0[typings.tstl.threadConditionVariableMod.ConditionVariable] = js.native
  val flex_barrier: Instantiable2[
    /* size */ Double, 
    js.UndefOr[/* complete */ js.Function0[Double]], 
    typings.tstl.threadFlexBarrierMod.FlexBarrier
  ] = js.native
  val latch: Instantiable1[/* size */ Double, typings.tstl.threadLatchMod.Latch] = js.native
  val mutex: Instantiable0[typings.tstl.threadMutexMod.Mutex] = js.native
  val shared_mutex: Instantiable0[typings.tstl.threadSharedMutexMod.SharedMutex] = js.native
  val shared_timed_mutex: Instantiable0[typings.tstl.threadSharedTimedMutexMod.SharedTimedMutex] = js.native
  val timed_mutex: Instantiable0[typings.tstl.threadTimedMutexMod.TimedMutex] = js.native
  @JSName("lock")
  def lock_lock(items: (Pick[ILockable, lock])*): js.Promise[Unit] = js.native
  def sleep_for(ms: Double): js.Promise[Unit] = js.native
  def sleep_until(at: Date): js.Promise[Unit] = js.native
  @JSName("try_lock")
  def try_lock_trylock(items: (Pick[ILockable, try_lock])*): js.Promise[Double] = js.native
  @js.native
  object SharedLock extends js.Object {
    def lock[Mutex /* <: Pick[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ISharedLockable */ _, 
        lock_shared | unlock_shared
      ] */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
    def try_lock[Mutex /* <: Pick[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ISharedLockable */ _, 
        try_lock_shared | unlock_shared
      ] */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
    def try_lock_for[Mutex /* <: Pick[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ISharedTimedLockable */ _, 
        try_lock_shared_for | unlock_shared
      ] */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
    def try_lock_until[Mutex /* <: Pick[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ISharedTimedLockable */ _, 
        try_lock_shared_until | unlock_shared
      ] */](mutex: Mutex, at: Date, closure: Closure): js.Promise[Boolean] = js.native
  }
  
  @js.native
  object UniqueLock extends js.Object {
    def lock[Mutex /* <: Pick[ILockable, typings.tstl.tstlStrings.lock | unlock] */](mutex: Mutex, closure: typings.tstl.threadUniqueLockMod.Closure): js.Promise[Unit] = js.native
    def try_lock[Mutex /* <: Pick[ILockable, typings.tstl.tstlStrings.try_lock | unlock] */](mutex: Mutex, closure: typings.tstl.threadUniqueLockMod.Closure): js.Promise[Boolean] = js.native
    def try_lock_for[Mutex /* <: Pick[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ITimedLockable */ _, 
        typings.tstl.tstlStrings.try_lock_for | unlock
      ] */](mutex: Mutex, ms: Double, closure: typings.tstl.threadUniqueLockMod.Closure): js.Promise[Boolean] = js.native
    def try_lock_until[Mutex /* <: Pick[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ITimedLockable */ _, 
        typings.tstl.tstlStrings.try_lock_until | unlock
      ] */](mutex: Mutex, at: Date, closure: typings.tstl.threadUniqueLockMod.Closure): js.Promise[Boolean] = js.native
  }
  
  @js.native
  object shared_lock extends js.Object {
    def lock[Mutex /* <: Pick[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ISharedLockable */ _, 
        lock_shared | unlock_shared
      ] */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
    def try_lock[Mutex /* <: Pick[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ISharedLockable */ _, 
        try_lock_shared | unlock_shared
      ] */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
    def try_lock_for[Mutex /* <: Pick[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ISharedTimedLockable */ _, 
        try_lock_shared_for | unlock_shared
      ] */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
    def try_lock_until[Mutex /* <: Pick[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ISharedTimedLockable */ _, 
        try_lock_shared_until | unlock_shared
      ] */](mutex: Mutex, at: Date, closure: Closure): js.Promise[Boolean] = js.native
  }
  
  @js.native
  object unique_lock extends js.Object {
    def lock[Mutex /* <: Pick[ILockable, typings.tstl.tstlStrings.lock | unlock] */](mutex: Mutex, closure: typings.tstl.threadUniqueLockMod.Closure): js.Promise[Unit] = js.native
    def try_lock[Mutex /* <: Pick[ILockable, typings.tstl.tstlStrings.try_lock | unlock] */](mutex: Mutex, closure: typings.tstl.threadUniqueLockMod.Closure): js.Promise[Boolean] = js.native
    def try_lock_for[Mutex /* <: Pick[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ITimedLockable */ _, 
        typings.tstl.tstlStrings.try_lock_for | unlock
      ] */](mutex: Mutex, ms: Double, closure: typings.tstl.threadUniqueLockMod.Closure): js.Promise[Boolean] = js.native
    def try_lock_until[Mutex /* <: Pick[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ITimedLockable */ _, 
        typings.tstl.tstlStrings.try_lock_until | unlock
      ] */](mutex: Mutex, at: Date, closure: typings.tstl.threadUniqueLockMod.Closure): js.Promise[Boolean] = js.native
  }
  
}

