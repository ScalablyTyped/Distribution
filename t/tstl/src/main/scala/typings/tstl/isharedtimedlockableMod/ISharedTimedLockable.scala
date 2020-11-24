package typings.tstl.isharedtimedlockableMod

import typings.std.Date
import typings.tstl.isharedlockableMod.ISharedLockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISharedTimedLockable extends ISharedLockable {
  
  /**
    * Tries to write lock the mutex until timeout.
    *
    * Attempts to monopoly a mutex until timeout. If succeeded to monopoly the mutex until the
    * timeout, it returns `true`. Otherwise failed to acquiring the lock in the given time, the
    * function gives up the trial and returns `false`.
    *
    * Failed to acquiring the lock in the given time (returns `false`), it means that there's
    * someone who has already {@link lock monopolied} or {@link lock_shared shared} the mutex and
    * does not return it over the timeout.
    *
    * Note that, if you succeeded to monopoly the mutex (returns `true`) but do not call the
    * {@link unlock} function after your business, the others who want to {@link lock monopoly}
    * or {@link lock_shared share} the mutex would be fall into the forever sleep. Therefore,
    * never forget to calling the {@link unlock} function or utilize the
    * {@link UniqueLock.try_lock_for} function instead to ensure the safety.
    *
    * @param ms The maximum miliseconds for waiting.
    * @return Whether succeeded to monopoly the mutex or not.
    */
  def try_lock_for(ms: Double): js.Promise[Boolean] = js.native
  
  /**
    * Tries to read lock the mutex until timeout.
    *
    * Attemps to share a mutex until timeout. If succeeded to share the mutex until timeout, it
    * returns `true`. Otherwise failed to acquiring the shared lock in the given time, the
    * function gives up the trial and returns `false`.
    *
    * Failed to acquring the shared lock in the given time (returns `false`), it means that
    * there's someone who has already {@link lock monopolied} the mutex and does not return it
    * over the timeout.
    *
    * Note that, if you succeeded to share the mutex (returns `true`) but do not call the
    * {@link unlock_shared} function after your buinsess, the others who want to
    * {@link lock monopoly} the mutex would be fall into the forever sleep. Therefore, never
    * forget to calling the {@link unlock_shared} function or utilize the
    * {@link SharedLock.try_lock_for} function instead to ensure the safety.
    *
    * @param ms The maximum miliseconds for waiting.
    * @return Whether succeeded to share the mutex or not.
    */
  def try_lock_shared_for(ms: Double): js.Promise[Boolean] = js.native
  
  /**
    * Tries to read lock the mutex until time expiration.
    *
    * Attemps to share a mutex until time expiration. If succeeded to share the mutex until time
    * expiration, it returns `true`. Otherwise failed to acquiring the shared lock in the given
    * time, the function gives up the trial and returns `false`.
    *
    * Failed to acquring the shared lock in the given time (returns `false`), it means that
    * there's someone who has already {@link lock monopolied} the mutex and does not return it
    * over the time expiration.
    *
    * Note that, if you succeeded to share the mutex (returns `true`) but do not call the
    * {@link unlock_shared} function after your buinsess, the others who want to
    * {@link lock monopoly} the mutex would be fall into the forever sleep. Therefore, never
    * forget to calling the {@link unlock_shared} function or utilize the
    * {@link SharedLock.try_lock_until} function instead to ensure the safety.
    *
    * @param at The maximum time point to wait.
    * @return Whether succeeded to share the mutex or not.
    */
  def try_lock_shared_until(at: Date): js.Promise[Boolean] = js.native
  
  /**
    * Tries to write lock the mutex until time expiration.
    *
    * Attemps to monopoly a mutex until time expiration. If succeeded to monopoly the mutex
    * until the time expiration, it returns `true`. Otherwise failed to acquiring the lock in the
    * given time, the function gives up the trial and returns `false`.
    *
    * Failed to acquiring the lock in the given time (returns `false`), it means that there's
    * someone who has already {@link lock monopolied} or {@link lock_shared shared} the mutex and
    * does not return it over the time expiration.
    *
    * Note that, if you succeeded to monopoly the mutex (returns `true`) but do not call the
    * {@link unlock} function after your business, the others who want to {@link lock monopoly}
    * or {@link lock_shared share} the mutex would be fall into the forever sleep. Therefore,
    * never forget to calling the {@link unlock} function or utilize the
    * {@link UniqueLock.try_lock_until} function instead to ensure the safety.
    *
    * @param at The maximum time point to wait.
    * @return Whether succeeded to monopoly the mutex or not.
    */
  def try_lock_until(at: Date): js.Promise[Boolean] = js.native
}
object ISharedTimedLockable {
  
  @scala.inline
  def apply(
    lock: () => js.Promise[Unit],
    lock_shared: () => js.Promise[Unit],
    try_lock: () => js.Promise[Boolean],
    try_lock_for: Double => js.Promise[Boolean],
    try_lock_shared: () => js.Promise[Boolean],
    try_lock_shared_for: Double => js.Promise[Boolean],
    try_lock_shared_until: Date => js.Promise[Boolean],
    try_lock_until: Date => js.Promise[Boolean],
    unlock: () => js.Promise[Unit],
    unlock_shared: () => js.Promise[Unit]
  ): ISharedTimedLockable = {
    val __obj = js.Dynamic.literal(lock = js.Any.fromFunction0(lock), lock_shared = js.Any.fromFunction0(lock_shared), try_lock = js.Any.fromFunction0(try_lock), try_lock_for = js.Any.fromFunction1(try_lock_for), try_lock_shared = js.Any.fromFunction0(try_lock_shared), try_lock_shared_for = js.Any.fromFunction1(try_lock_shared_for), try_lock_shared_until = js.Any.fromFunction1(try_lock_shared_until), try_lock_until = js.Any.fromFunction1(try_lock_until), unlock = js.Any.fromFunction0(unlock), unlock_shared = js.Any.fromFunction0(unlock_shared))
    __obj.asInstanceOf[ISharedTimedLockable]
  }
  
  @scala.inline
  implicit class ISharedTimedLockableOps[Self <: ISharedTimedLockable] (val x: Self) extends AnyVal {
    
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
    def setTry_lock_for(value: Double => js.Promise[Boolean]): Self = this.set("try_lock_for", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTry_lock_shared_for(value: Double => js.Promise[Boolean]): Self = this.set("try_lock_shared_for", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTry_lock_shared_until(value: Date => js.Promise[Boolean]): Self = this.set("try_lock_shared_until", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTry_lock_until(value: Date => js.Promise[Boolean]): Self = this.set("try_lock_until", js.Any.fromFunction1(value))
  }
}
