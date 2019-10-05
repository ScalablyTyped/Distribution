package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import typings.tstl.threadILockableMod.ILockable
import typings.tstl.threadMutexMod.Mutex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/Mutex", JSImport.Namespace)
@js.native
object threadMutexMod extends js.Object {
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
  
  val mutex: Instantiable0[Mutex] = js.native
  type mutex = Mutex
}

