package typings.tstl.mod

import typings.std.Pick
import typings.tstl.ilockableMod.ILockable
import typings.tstl.tstlStrings.try_lock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "try_lock")
@js.native
object tryLock_trylock extends js.Object {
  def apply(items: (Pick[ILockable, try_lock])*): js.Promise[Double] = js.native
}

