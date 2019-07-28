package typings.tstl.threadMutexMod

import typings.tstl.threadILockableMod.ILockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/Mutex", "Mutex")
@js.native
/**
  * Default Constructor.
  */
class Mutex () extends ILockable {
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
    * Unlock.
    */
  /* CompleteClass */
  override def unlock(): js.Promise[Unit] = js.native
}

