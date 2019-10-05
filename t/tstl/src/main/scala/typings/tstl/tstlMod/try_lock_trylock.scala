package typings.tstl.tstlMod

import typings.std.Pick
import typings.tstl.threadILockableMod.ILockable
import typings.tstl.tstlStrings.try_lock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "try_lock")
@js.native
object try_lock_trylock extends js.Object {
  def apply(items: (Pick[ILockable, try_lock])*): js.Promise[Double] = js.native
}

