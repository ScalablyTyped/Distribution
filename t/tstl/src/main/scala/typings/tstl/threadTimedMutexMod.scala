package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/TimedMutex", JSImport.Namespace)
@js.native
object threadTimedMutexMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ITimedLockable * / any */ @js.native
  /**
    * Default Constructor.
    */
  class TimedMutex () extends js.Object {
    /**
      * @hidden
      */
    var mutex_ : js.Any = js.native
    /**
      * @inheritDoc
      */
    def lock(): js.Promise[Unit] = js.native
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
    def try_lock_until(at: Date): js.Promise[Boolean] = js.native
    /**
      * @inheritDoc
      */
    def unlock(): js.Promise[Unit] = js.native
  }
  
  val timed_mutex: Instantiable0[TimedMutex] = js.native
  type timed_mutex = TimedMutex
}

