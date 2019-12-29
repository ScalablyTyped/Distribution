package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import typings.std.Date
import typings.tstl.baseThreadUnderscoreITimedLockableMod._ITimedLockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/TimedMutex", JSImport.Namespace)
@js.native
object threadTimedMutexMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  class TimedMutex () extends _ITimedLockable {
    /**
      * @hidden
      */
    var mutex_ : js.Any = js.native
    /**
      * Lock until be unlocked.
      */
    /* CompleteClass */
    override def lock(): js.Promise[Unit] = js.native
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
  }
  
  val timed_mutex: Instantiable0[TimedMutex] = js.native
  type timed_mutex = TimedMutex
}

