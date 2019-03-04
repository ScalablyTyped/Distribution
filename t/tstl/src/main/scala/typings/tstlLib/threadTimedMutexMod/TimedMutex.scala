package typings
package tstlLib.threadTimedMutexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/TimedMutex", "TimedMutex")
@js.native
/**
  * Default Constructor.
  */
class TimedMutex ()
  extends tstlLib.threadITimedLockableMod.ITimedLockable {
  /**
    * @hidden
    */
  var lock_count_ : js.Any = js.native
  /**
    * @hidden
    */
  var resolvers_ : js.Any = js.native
  /**
    * Lock until be unlocked.
    */
  /* CompleteClass */
  override def lock(): js.Promise[scala.Unit] = js.native
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
}

