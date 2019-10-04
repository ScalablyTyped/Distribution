package typings.tstl.threadMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Date
import typings.std.Pick
import typings.tstl.threadILockableMod.ILockable
import typings.tstl.tstlStrings.lock
import typings.tstl.tstlStrings.try_lock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val barrier: Instantiable1[/* size */ Double, typings.tstl.threadBarrierMod.Barrier] = js.native
  val condition_variable: Instantiable0[typings.tstl.threadConditionVariableMod.ConditionVariable] = js.native
  val flex_barrier: Instantiable2[
    /* size */ Double, 
    js.UndefOr[/* complete */ js.Function0[Double]], 
    typings.tstl.threadFlexBarrierMod.FlexBarrier
  ] = js.native
  val latch: Instantiable1[/* size */ Double, typings.tstl.threadLatchMod.Latch] = js.native
  val mutex: Instantiable0[typings.tstl.threadMutexMod.Mutex] = js.native
  val shared_mutex: Instantiable0[typings.tstl.threadSharedMutexMod.SharedMutex] = js.native
  val shared_timed_mutex: Instantiable0[typings.tstl.threadSharedTimedMutexMod.SharedTimedMutex] = js.native
  val timed_mutex: Instantiable0[typings.tstl.threadTimedMutexMod.TimedMutex] = js.native
  @JSName("lock")
  def lock_lock(items: (Pick[ILockable, lock])*): js.Promise[Unit] = js.native
  def sleep_for(ms: Double): js.Promise[Unit] = js.native
  def sleep_until(at: Date): js.Promise[Unit] = js.native
  @JSName("try_lock")
  def try_lock_trylock(items: (Pick[ILockable, try_lock])*): js.Promise[Double] = js.native
}

