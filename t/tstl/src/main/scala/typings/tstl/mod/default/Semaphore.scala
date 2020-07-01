package typings.tstl.mod.default

import typings.tstl.anon.PickSemaphorenumberacquir
import typings.tstl.itimedlockableMod.ITimedLockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "Semaphore")
@js.native
class Semaphore[Max /* <: Double */] protected ()
  extends typings.tstl.tstlModuleMod.Semaphore[Max] {
  /**
    * Initializer Constructor.
    *
    * @param max Number of maximum sections acquirable.
    */
  def this(max: Max) = this()
}

@JSImport("tstl", "Semaphore")
@js.native
object Semaphore extends js.Object {
  /**
    * Capsules a {@link Semaphore} to be suitable for the {@link UniqueLock}.
    *
    * @param semaphore Target semaphore to capsule.
    * @return Lockable instance suitable for the {@link UniqueLock}
    */
  @JSName("get_lockable")
  def getLockable[SemaphoreT /* <: PickSemaphorenumberacquir */](semaphore: SemaphoreT): ITimedLockable = js.native
}

