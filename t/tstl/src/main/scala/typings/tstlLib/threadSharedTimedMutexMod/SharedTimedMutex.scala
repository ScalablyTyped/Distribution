package typings
package tstlLib.threadSharedTimedMutexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/SharedTimedMutex", "SharedTimedMutex")
@js.native
/**
  * Default Constructor.
  */
class SharedTimedMutex ()
  extends tstlLib.threadITimedLockableMod.ITimedLockable
     with tstlLib.baseThreadUnderscoreISharedTimedLockableMod._ISharedTimedLockable {
  /**
    * @hidden
    */
  var _Current_access_type: js.Any = js.native
  /**
    * @hidden
    */
  var _Release: js.Any = js.native
  /**
    * @hidden
    */
  var queue_ : js.Any = js.native
  /**
    * @hidden
    */
  var reading_ : js.Any = js.native
  /**
    * @hidden
    */
  var writing_ : js.Any = js.native
  /**
    * Lock until be unlocked.
    */
  /* CompleteClass */
  override def lock(): js.Promise[scala.Unit] = js.native
  /**
    * Lock shared until be unlock shared.
    */
  /* CompleteClass */
  override def lock_shared(): js.Promise[scala.Unit] = js.native
  /**
    * Try {@link lock}.
    *
    * @return Whether succeeded to lock or not.
    */
  /* CompleteClass */
  override def try_lock(): js.Promise[scala.Boolean] = js.native
  /**
    * Try lock until timeout.
    *
    * @param ms The maximum miliseconds for waiting.
    * @return Whether succeded to lock or not.
    */
  /* CompleteClass */
  override def try_lock_for(ms: scala.Double): js.Promise[scala.Boolean] = js.native
  /**
    * Try lock shared.
    */
  /* CompleteClass */
  override def try_lock_shared(): js.Promise[scala.Boolean] = js.native
  /**
    * Try lock shared until timeout.
    *
    * @param ms The maximum miliseconds for waiting.
    * @return Whether succeded to lock or not.
    */
  /* CompleteClass */
  override def try_lock_shared_for(ms: scala.Double): js.Promise[scala.Boolean] = js.native
  /**
    * Try lock shared until time expiration.
    *
    * @param at The maximum time point to wait.
    * @return Whether succeded to lock or not.
    */
  /* CompleteClass */
  override def try_lock_shared_until(at: stdLib.Date): js.Promise[scala.Boolean] = js.native
  /**
    * Try lock until time expiration.
    *
    * @param at The maximum time point to wait.
    * @return Whether succeded to lock or not.
    */
  /* CompleteClass */
  override def try_lock_until(at: stdLib.Date): js.Promise[scala.Boolean] = js.native
  /**
    * Unlock.
    */
  /* CompleteClass */
  override def unlock(): js.Promise[scala.Unit] = js.native
  /**
    * Unlock shared.
    */
  /* CompleteClass */
  override def unlock_shared(): js.Promise[scala.Unit] = js.native
}

