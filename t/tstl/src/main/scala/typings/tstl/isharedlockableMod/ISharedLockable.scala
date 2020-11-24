package typings.tstl.isharedlockableMod

import typings.tstl.ilockableMod.ILockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISharedLockable extends ILockable {
  
  /**
    * Read locks the mutex.
    *
    * Shares a mutex until be {@link unlock_shared unlocked}. If there're someone who have
    * already {@link lock monopolied} the mutex, the function call would be blocked until all of
    * them to {@link unlock return} their acquisitions.
    *
    * In same reason, if you don't call the {@link unlock_shared} function after your business,
    * the others who want to {@link lock monopoly} the mutex would be fall into the forever
    * sleep. Therefore, never forget to calling the {@link unlock_shared} or utilize the
    * {@link SharedLock.lock} function instead to ensure the safety.
    */
  def lock_shared(): js.Promise[Unit] = js.native
  
  /**
    * Tries to read lock the mutex.
    *
    * Attemps to share a mutex without blocking. If succeeded to share the mutex immediately, it
    * returns `true` directly. Otherwise there's someone who has already {@link lock monopolied}
    * the mutex, the function gives up the trial immediately and returns `false` directly.
    *
    * Note that, if you succeeded to share the mutex (returns `true`) but do not call the
    * {@link unlock_shared} function after your buinsess, the others who want to
    * {@link lock monopoly} the mutex would be fall into the forever sleep. Therefore, never
    * forget to calling the {@link unlock_shared} function or utilize the
    * {@link SharedLock.try_lock} function instead to ensure the safety.
    *
    * @return Whether succeeded to share the mutex or not.
    */
  def try_lock_shared(): js.Promise[Boolean] = js.native
  
  /**
    * Read unlocks the mutex.
    *
    * When you call this {@link unlock_shared} method and there're someone who are currently
    * blocked by attempting to {@link lock monopoly} this mutex, one of them
    * (FIFO; first-in-first-out) would acquire the lock and continues its execution.
    *
    * Otherwise, there's not anyone who is acquiring the {@link lock_shared read lock} of this
    * mutex, the {@link DomainError} exception would be thrown.
    *
    * > As you know, when you succeeded to acquire the `read lock`, you don't have to forget to
    * > calling this {@link unlock_shared} method after your business. If you forget it, it would
    * > be a terrible situation for the others who're attempting to lock this mutex.
    * >
    * > However, if you utilize the {@link SharedLock}, you don't need to consider about this
    * > {@link unlock_shared} method. Just define your business into a callback function as a
    * > parameter of methods of the {@link SharedLock}, then this {@link unlock_shared} method
    * > would be automatically called by the {@link SharedLock} after the business.
    */
  def unlock_shared(): js.Promise[Unit] = js.native
}
object ISharedLockable {
  
  @scala.inline
  def apply(
    lock: () => js.Promise[Unit],
    lock_shared: () => js.Promise[Unit],
    try_lock: () => js.Promise[Boolean],
    try_lock_shared: () => js.Promise[Boolean],
    unlock: () => js.Promise[Unit],
    unlock_shared: () => js.Promise[Unit]
  ): ISharedLockable = {
    val __obj = js.Dynamic.literal(lock = js.Any.fromFunction0(lock), lock_shared = js.Any.fromFunction0(lock_shared), try_lock = js.Any.fromFunction0(try_lock), try_lock_shared = js.Any.fromFunction0(try_lock_shared), unlock = js.Any.fromFunction0(unlock), unlock_shared = js.Any.fromFunction0(unlock_shared))
    __obj.asInstanceOf[ISharedLockable]
  }
  
  @scala.inline
  implicit class ISharedLockableOps[Self <: ISharedLockable] (val x: Self) extends AnyVal {
    
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
    def setLock_shared(value: () => js.Promise[Unit]): Self = this.set("lock_shared", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTry_lock_shared(value: () => js.Promise[Boolean]): Self = this.set("try_lock_shared", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnlock_shared(value: () => js.Promise[Unit]): Self = this.set("unlock_shared", js.Any.fromFunction0(value))
  }
}
