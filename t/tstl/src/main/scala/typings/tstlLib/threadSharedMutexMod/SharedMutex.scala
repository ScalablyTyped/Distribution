package typings
package tstlLib.threadSharedMutexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/SharedMutex", "SharedMutex")
@js.native
/**
  * Default Constructor.
  */
class SharedMutex ()
  extends tstlLib.threadILockableMod.ILockable
     with tstlLib.baseThreadUnderscoreISharedLockableMod._ISharedLockable {
  /**
    * @hidden
    */
  var read_lock_count_ : js.Any = js.native
  /**
    * @hidden
    */
  var resolvers_ : js.Any = js.native
  /**
    * @hidden
    */
  var write_lock_count_ : js.Any = js.native
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
    * Try lock shared.
    */
  /* CompleteClass */
  override def try_lock_shared(): js.Promise[scala.Boolean] = js.native
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

