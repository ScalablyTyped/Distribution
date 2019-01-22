package typings
package tstlLib.threadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val condition_variable: org.scalablytyped.runtime.Instantiable0[tstlLib.threadConditionVariableMod.ConditionVariable] = js.native
  val mutex: org.scalablytyped.runtime.Instantiable0[tstlLib.threadMutexMod.Mutex] = js.native
  val shared_mutex: org.scalablytyped.runtime.Instantiable0[tstlLib.threadSharedMutexMod.SharedMutex] = js.native
  val shared_timed_mutex: org.scalablytyped.runtime.Instantiable0[tstlLib.threadSharedTimedMutexMod.SharedTimedMutex] = js.native
  val timed_mutex: org.scalablytyped.runtime.Instantiable0[tstlLib.threadTimedMutexMod.TimedMutex] = js.native
  @JSName("lock")
  def lock_lock(items: (stdLib.Pick[tstlLib.threadILockableMod.ILockable, tstlLib.tstlLibStrings.lock])*): js.Promise[scala.Unit] = js.native
  def sleep_for(ms: scala.Double): js.Promise[scala.Unit] = js.native
  def sleep_until(at: stdLib.Date): js.Promise[scala.Unit] = js.native
  @JSName("try_lock")
  def try_lock_try_lock(items: (stdLib.Pick[tstlLib.threadILockableMod.ILockable, tstlLib.tstlLibStrings.try_lock])*): js.Promise[scala.Double] = js.native
}

