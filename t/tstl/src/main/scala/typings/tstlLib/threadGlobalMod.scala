package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/global", JSImport.Namespace)
@js.native
object threadGlobalMod extends js.Object {
  @JSName("lock")
  def lock_lock(items: (stdLib.Pick[tstlLib.threadILockableMod.ILockable, tstlLib.tstlLibStrings.lock])*): js.Promise[scala.Unit] = js.native
  def sleep_for(ms: scala.Double): js.Promise[scala.Unit] = js.native
  def sleep_until(at: stdLib.Date): js.Promise[scala.Unit] = js.native
  @JSName("try_lock")
  def try_lock_try_lock(items: (stdLib.Pick[tstlLib.threadILockableMod.ILockable, tstlLib.tstlLibStrings.try_lock])*): js.Promise[scala.Double] = js.native
}

