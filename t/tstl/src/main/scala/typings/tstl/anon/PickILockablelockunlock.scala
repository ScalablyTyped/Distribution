package typings.tstl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<tstl.tstl/thread/ILockable.ILockable, 'lock' | 'unlock'> */
@js.native
trait PickILockablelockunlock extends js.Object {
  @JSName("lock")
  var lock_Original: js.Function0[js.Promise[Unit]] = js.native
  @JSName("unlock")
  var unlock_Original: js.Function0[js.Promise[Unit]] = js.native
  def lock(): js.Promise[Unit] = js.native
  def unlock(): js.Promise[Unit] = js.native
}

