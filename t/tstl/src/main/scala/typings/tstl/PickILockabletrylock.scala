package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<tstl.tstl/thread/ILockable.ILockable, 'try_lock'> */
@js.native
trait PickILockabletrylock extends js.Object {
  @JSName("try_lock")
  var try_lock_Original: js.Function0[js.Promise[Boolean]] = js.native
  def try_lock(): js.Promise[Boolean] = js.native
}

