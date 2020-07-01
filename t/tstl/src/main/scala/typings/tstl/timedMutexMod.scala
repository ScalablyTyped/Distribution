package typings.tstl

import typings.std.Date
import typings.tstl.itimedlockableMod.ITimedLockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/TimedMutex", JSImport.Namespace)
@js.native
object timedMutexMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  class TimedMutex () extends ITimedLockable {
    var mutex_ : js.Any = js.native
    /**
      * Locks the mutex.
      *
      * Monopolies a mutex until be {@link unlock unlocked}. If there're someone who have already
      * {@link lock monopolied} the mutex, the function call would be blocked until all of them to
      * return their acquistions by calling the {@link unlock} method.
      *
      * In same reason, if you don't call the {@link unlock} function after your business, the
      * others who want to {@link lock monopoly} the mutex would be fall into the forever sleep.
      * Therefore, never forget to calling the {@link unlock} function or utilize the
      * {@link UniqueLock.lock} function instead to ensure the safety.
      */
    /* CompleteClass */
    override def lock(): js.Promise[Unit] = js.native
    /**
      * Tries to lock the mutex.
      *
      * Attempts to monopoly a mutex without blocking. If succeeded to monopoly the mutex
      * immediately, it returns `true` directly. Otherwise there's someone who has already
      * {@link lock monopolied} the mutex, the function gives up the trial immediately and returns
      * `false` directly.
      *
      * Note that, if you succeeded to monopoly the mutex (returns `true`) but do not call the
      * {@link unlock} function after your business, the others who want to {@link lock monopoly}
      * the mutex would be fall into the forever sleep. Therefore, never forget to calling the
      * {@link unlock} function or utilize the {@link UniqueLock.try_lock} function instead to
      * ensure the safety.
      *
      * @return Whether succeeded to monopoly the mutex or not.
      */
    /* CompleteClass */
    override def try_lock(): js.Promise[Boolean] = js.native
    /**
      * Tries to lock the mutex until timeout.
      *
      * Attempts to monopoly a mutex until timeout. If succeeded to monopoly the mutex until the
      * timeout, it returns `true`. Otherwise failed to acquiring the lock in the given time, the
      * function gives up the trial and returns `false`.
      *
      * Failed to acquiring the lock in the given time (returns `false`), it means that there's
      * someone who has already {@link lock monopolied} the mutex and does not return it over the
      * timeout.
      *
      * Note that, if you succeeded to monopoly the mutex (returns `true`) but do not call the
      * {@link unlock} function after your business, the others who want to {@link lock monopoly}
      * the mutex would be fall into the forever sleep. Therefore, never forget to calling the
      * {@link unlock} function or utilize the {@link UniqueLock.try_lock_for} function instead to
      * ensure the safety.
      *
      * @param ms The maximum miliseconds for waiting.
      * @return Whether succeeded to monopoly the mutex or not.
      */
    /* CompleteClass */
    override def try_lock_for(ms: Double): js.Promise[Boolean] = js.native
    /**
      * Tries to write lock the mutex until time expiration.
      *
      * Attemps to monopoly a mutex until time expiration. If succeeded to monopoly the mutex
      * until the time expiration, it returns `true`. Otherwise failed to acquiring the lock in the
      * given time, the function gives up the trial and returns `false`.
      *
      * Failed to acquiring the lock in the given time (returns `false`), it means that there's
      * someone who has already {@link lock monopolied} the mutex and does not return it over the
      * time expiration.
      *
      * Note that, if you succeeded to monopoly the mutex (returns `true`) but do not call the
      * {@link unlock} function after your business, the others who want to {@link lock monopoly}
      * the mutex would be fall into the forever sleep. Therefore, never forget to calling the
      * {@link unlock} function or utilize the {@link UniqueLock.try_lock_until} function instead
      * to ensure the safety.
      *
      * @param at The maximum time point to wait.
      * @return Whether succeeded to monopoly the mutex or not.
      */
    /* CompleteClass */
    override def try_lock_until(at: Date): js.Promise[Boolean] = js.native
    /**
      * Unlocks the mutex.
      *
      * When you call this {@link unlock} method and there're someone who are currently blocked by
      * attempting to {@link lock} this mutex, one of them (FIFO; first-in-first-out) would acquire
      * the lock and continues its execution.
      *
      * Otherwise, there's not anyone who is acquiring the {@link lock} of this mutex, the
      * {@link DomainError} exception would be thrown.
      *
      * > As you know, when you succeeded to acquire the `lock`, you don't have to forget to
      * > calling this {@link unlock} method after your business. If you forget it, it would be a
      * > terrible situation for the others who're attempting to lock this mutex.
      * >
      * > However, if you utilize the {@link UniqueLock}, you don't need to consider about this
      * > {@link unlock} method. Just define your business into a callback function as a parameter
      * > of methods of the {@link UniqueLock}, then this {@link unlock} method would be
      * > automatically called by the {@link UniqueLock} after the business.
      *
      * @throw {@link DomainError} when no one is acquiring the {@link lock write lock}.
      */
    /* CompleteClass */
    override def unlock(): js.Promise[Unit] = js.native
  }
  
}

