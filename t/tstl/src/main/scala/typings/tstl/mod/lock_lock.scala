package typings.tstl.mod

import typings.std.Pick
import typings.tstl.ilockableMod.ILockable
import typings.tstl.tstlStrings.lock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "lock")
@js.native
object lock_lock extends js.Object {
  def apply(items: (Pick[ILockable, lock])*): js.Promise[Unit] = js.native
}

