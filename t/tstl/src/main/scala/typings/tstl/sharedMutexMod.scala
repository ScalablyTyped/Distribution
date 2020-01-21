package typings.tstl

import typings.tstl.ilockableMod.ILockable
import typings.tstl.isharedlockableMod.ISharedLockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/SharedMutex", JSImport.Namespace)
@js.native
object sharedMutexMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  class SharedMutex ()
    extends ILockable
       with ISharedLockable {
    var mutex_ : js.Any = js.native
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
      * Try lock shared.
      */
    /* CompleteClass */
    override def try_lock_shared(): js.Promise[Boolean] = js.native
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

