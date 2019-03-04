package typings
package tstlLib.threadMutexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/Mutex", "Mutex")
@js.native
/**
  * Default Constructor.
  */
class Mutex ()
  extends tstlLib.threadILockableMod.ILockable {
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
    * Unlock.
    */
  /* CompleteClass */
  override def unlock(): js.Promise[scala.Unit] = js.native
}

