package typings.tstl

import typings.std.Date
import typings.tstl.anon.PickSemaphorenumberacquir
import typings.tstl.itimedlockableMod.ITimedLockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/thread/Semaphore", JSImport.Namespace)
@js.native
object semaphoreMod extends js.Object {
  
  @js.native
  class Semaphore[Max /* <: Double */] protected () extends js.Object {
    /**
      * Initializer Constructor.
      *
      * @param max Number of maximum sections acquirable.
      */
    def this(max: Max) = this()
    
    var _Cancel: js.Any = js.native
    
    /**
      * Acquires a section.
      *
      * Acquires a section until be {@link release released}. If all of the sections in the
      * semaphore already have been acquired by others, the function call would be blocked until
      * one of them returns its acquisition by calling the {@link release} method.
      *
      * In same reason, if you don't call the {@link release} function after you business, the
      * others who want to {@link acquire} a section from the semaphore would be fall into the
      * forever sleep. Therefore, never forget to calling the {@link release} function or utilize
      * the {@link UniqueLock.lock} function instead with {@link Semaphore.get_lockable} to ensure
      * the safety.
      */
    def acquire(): js.Promise[Unit] = js.native
    
    var acquiring_ : js.Any = js.native
    
    /**
      * Get number of maximum sections lockable.
      *
      * @return Number of maximum sections lockable.
      */
    def max(): Max = js.native
    
    var max_ : js.Any = js.native
    
    var queue_ : js.Any = js.native
    
    /**
      * Release sections.
      *
      * When you call this {@link release} method and there're someone who are currently blocked
      * by attemping to {@link acquire} a section from this semaphore, *n* of them
      * (FIFO; first-in-first-out) would {@link acquire} those {@link release released} sections
      * and continue their executions.
      *
      * Otherwise, there's not anyone who is {@link acquire acquiring} the section or number of
      * the blocked are less than *n*, the {@link OutOfRange} error would be thrown.
      *
      * > As you know, when you succeeded to {@link acquire} a section, you don't have to forget
      * > to calling this {@link release} method after your business. If you forget it, it would
      * > be a terrible situation for the others who're attempting to {@link acquire} a section
      * > from this semaphore.
      * >
      * > However, if you utilize the {@link UniqueLock} with {@link Semaphore.get_lockable}, you
      * > don't need to consider about this {@link release} method. Just define your business into
      * > a callback function as a parameter of methods of the {@link UniqueLock}, then this
      * > {@link release} method would be automatically called by the {@link UniqueLock} after the
      * > business.
      *
      * @param n Number of sections to be released. Default is 1.
      * @throw {@link OutOfRange} when *n* is greater than currently {@link acquire acquired} sections.
      */
    def release(): js.Promise[Unit] = js.native
    def release(n: Double): js.Promise[Unit] = js.native
    
    /**
      * Tries to acquire a section.
      *
      * Attempts to acquire a section without blocking. If succeeded to acquire a section from the
      * semaphore immediately, it returns `true` directly. Otherwise all of the sections in the
      * semaphore are full, the function gives up the trial immediately and returns `false`
      * directly.
      *
      * Note that, if you succeeded to acquire a section from the semaphore (returns `true) but do
      * not call the {@link release} function after your business, the others who want to
      * {@link acquire} a section from the semaphore would be fall into the forever sleep.
      * Therefore, never forget to calling the {@link release} function or utilize the
      * {@link UniqueLock.try_lock} function instead with {@link Semaphore.get_lockable} to ensure
      * the safety.
      *
      * @return Whether succeeded to acquire or not.
      */
    def try_acquire(): js.Promise[Boolean] = js.native
    
    /**
      * Tries to acquire a section until timeout.
      *
      * Attempts to acquire a section from the semaphore until timeout. If succeeded to acquire a
      * section until the timeout, it returns `true`. Otherwise failed to acquiring a section in
      * given the time, the function gives up the trial and returns `false`.
      *
      * Failed to acquiring a section in the given time (returns `false`), it means that there're
      * someone who have already {@link acquire acquired} sections and do not return them over the
      * time expiration.
      *
      * Note that, if you succeeded to acquire a section from the semaphore (returns `true) but do
      * not call the {@link release} function after your business, the others who want to
      * {@link acquire} a section from the semaphore would be fall into the forever sleep.
      * Therefore, never forget to calling the {@link release} function or utilize the
      * {@link UniqueLock.try_acquire_for} function instead with {@link Semaphore.get_lockable} to
      * ensure the safety.
      *
      * @param ms The maximum miliseconds for waiting.
      * @return Whether succeded to acquire or not.
      */
    def try_acquire_for(ms: Double): js.Promise[Boolean] = js.native
    
    /**
      * Tries to acquire a section until timeout.
      *
      * Attempts to acquire a section from the semaphore until time expiration. If succeeded to
      * acquire a section until the time expiration, it returns `true`. Otherwise failed to
      * acquiring a section in the given time, the function gives up the trial and returns `false`.
      *
      * Failed to acquiring a section in the given time (returns `false`), it means that there're
      * someone who have already {@link acquire acquired} sections and do not return them over the
      * time expiration.
      *
      * Note that, if you succeeded to acquire a section from the semaphore (returns `true) but do
      * not call the {@link release} function after your business, the others who want to
      * {@link acquire} a section from the semaphore would be fall into the forever sleep.
      * Therefore, never forget to calling the {@link release} function or utilize the
      * {@link UniqueLock.try_acquire_until} function instead with {@link Semaphore.get_lockable}
      * to ensure the safety.
      *
      * @param at The maximum time point to wait.
      * @return Whether succeded to acquire or not.
      */
    def try_acquire_until(at: Date): js.Promise[Boolean] = js.native
  }
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
}
