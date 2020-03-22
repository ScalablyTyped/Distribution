package typings.tstl

import typings.std.Date
import typings.tstl.ilockableMod.ILockable
import typings.tstl.isharedtimedlockableMod.ISharedTimedLockable
import typings.tstl.itimedlockableMod.ITimedLockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/SharedTimedMutex", JSImport.Namespace)
@js.native
object sharedTimedMutexMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  class SharedTimedMutex ()
    extends ITimedLockable
       with ISharedTimedLockable {
    /**
      * @internal
      */
    def this(source: ILockable) = this()
    var _Cancel: js.Any = js.native
    var _Current_access_type: js.Any = js.native
    var _Release: js.Any = js.native
    var queue_ : js.Any = js.native
    var reading_ : js.Any = js.native
    var source_ : js.Any = js.native
    var writing_ : js.Any = js.native
    /**
      * Lock until be unlocked.
      */
    /* CompleteClass */
    override def lock(): js.Promise[Unit] = js.native
    /**
      * Lock shared until be unlock shared.
      */
    /* CompleteClass */
    override def lock_shared(): js.Promise[Unit] = js.native
    /**
      * Try {@link lock}.
      *
      * @return Whether succeeded to lock or not.
      */
    /* CompleteClass */
    override def try_lock(): js.Promise[Boolean] = js.native
    /**
      * Try lock until timeout.
      *
      * @param ms The maximum miliseconds for waiting.
      * @return Whether succeded to lock or not.
      */
    /* CompleteClass */
    override def try_lock_for(ms: Double): js.Promise[Boolean] = js.native
    /**
      * Try lock shared.
      */
    /* CompleteClass */
    override def try_lock_shared(): js.Promise[Boolean] = js.native
    /**
      * Try lock shared until timeout.
      *
      * @param ms The maximum miliseconds for waiting.
      * @return Whether succeded to lock or not.
      */
    /* CompleteClass */
    override def try_lock_shared_for(ms: Double): js.Promise[Boolean] = js.native
    /**
      * Try lock shared until time expiration.
      *
      * @param at The maximum time point to wait.
      * @return Whether succeded to lock or not.
      */
    /* CompleteClass */
    override def try_lock_shared_until(at: Date): js.Promise[Boolean] = js.native
    /**
      * Try lock until time expiration.
      *
      * @param at The maximum time point to wait.
      * @return Whether succeded to lock or not.
      */
    /* CompleteClass */
    override def try_lock_until(at: Date): js.Promise[Boolean] = js.native
    /**
      * Unlock.
      */
    /* CompleteClass */
    override def unlock(): js.Promise[Unit] = js.native
    /**
      * Unlock shared.
      */
    /* CompleteClass */
    override def unlock_shared(): js.Promise[Unit] = js.native
  }
  
}

