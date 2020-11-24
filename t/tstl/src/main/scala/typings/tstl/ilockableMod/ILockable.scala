package typings.tstl.ilockableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILockable extends js.Object {
  
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
  def lock(): js.Promise[Unit] = js.native
  
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
  def try_lock(): js.Promise[Boolean] = js.native
  
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
  def unlock(): js.Promise[Unit] = js.native
}
object ILockable {
  
  @scala.inline
  def apply(lock: () => js.Promise[Unit], try_lock: () => js.Promise[Boolean], unlock: () => js.Promise[Unit]): ILockable = {
    val __obj = js.Dynamic.literal(lock = js.Any.fromFunction0(lock), try_lock = js.Any.fromFunction0(try_lock), unlock = js.Any.fromFunction0(unlock))
    __obj.asInstanceOf[ILockable]
  }
  
  @scala.inline
  implicit class ILockableOps[Self <: ILockable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLock(value: () => js.Promise[Unit]): Self = this.set("lock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTry_lock(value: () => js.Promise[Boolean]): Self = this.set("try_lock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnlock(value: () => js.Promise[Unit]): Self = this.set("unlock", js.Any.fromFunction0(value))
  }
}
