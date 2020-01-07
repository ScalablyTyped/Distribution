package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/SharedTimedMutex", JSImport.Namespace)
@js.native
object threadSharedTimedMutexMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ITimedLockable * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ISharedTimedLockable * / any */ @js.native
  /**
    * Default Constructor.
    */
  class SharedTimedMutex () extends js.Object {
    /**
      * @hidden
      */
    var _Cancel: js.Any = js.native
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
    var source_ : js.Any = js.native
    /**
      * @hidden
      */
    var writing_ : js.Any = js.native
    /**
      * @inheritDoc
      */
    def lock(): js.Promise[Unit] = js.native
    /**
      * @inheritDoc
      */
    def lock_shared(): js.Promise[Unit] = js.native
    /**
      * @inheritDoc
      */
    def try_lock(): js.Promise[Boolean] = js.native
    /**
      * @inheritDoc
      */
    def try_lock_for(ms: Double): js.Promise[Boolean] = js.native
    /**
      * @inheritDoc
      */
    def try_lock_shared(): js.Promise[Boolean] = js.native
    /**
      * @inheritDoc
      */
    def try_lock_shared_for(ms: Double): js.Promise[Boolean] = js.native
    /**
      * @inheritDoc
      */
    def try_lock_shared_until(at: Date): js.Promise[Boolean] = js.native
    /**
      * @inheritDoc
      */
    def try_lock_until(at: Date): js.Promise[Boolean] = js.native
    /**
      * @inheritDoc
      */
    def unlock(): js.Promise[Unit] = js.native
    /**
      * @inheritDoc
      */
    def unlock_shared(): js.Promise[Unit] = js.native
  }
  
  val shared_timed_mutex: Instantiable0[SharedTimedMutex] = js.native
  type shared_timed_mutex = SharedTimedMutex
}

