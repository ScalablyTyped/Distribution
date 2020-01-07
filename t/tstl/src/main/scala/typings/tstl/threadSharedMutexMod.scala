package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import typings.tstl.threadILockableMod.ILockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/SharedMutex", JSImport.Namespace)
@js.native
object threadSharedMutexMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ISharedLockable * / any */ @js.native
  /**
    * Default Constructor.
    */
  class SharedMutex () extends ILockable {
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
      * @inheritDoc
      */
    def lock_shared(): js.Promise[Unit] = js.native
    /**
      * Try {@link lock}.
      *
      * @return Whether succeeded to lock or not.
      */
    /* CompleteClass */
    override def try_lock(): js.Promise[Boolean] = js.native
    /**
      * @inheritDoc
      */
    def try_lock_shared(): js.Promise[Boolean] = js.native
    /**
      * Unlock.
      */
    /* CompleteClass */
    override def unlock(): js.Promise[Unit] = js.native
    /**
      * @inheritDoc
      */
    def unlock_shared(): js.Promise[Unit] = js.native
  }
  
  val shared_mutex: Instantiable0[SharedMutex] = js.native
  type shared_mutex = SharedMutex
}

