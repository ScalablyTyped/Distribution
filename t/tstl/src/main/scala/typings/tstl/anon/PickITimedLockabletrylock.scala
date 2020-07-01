package typings.tstl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<tstl.tstl/base/thread/ITimedLockable.ITimedLockable, 'try_lock_for' | 'unlock'> */
@js.native
trait PickITimedLockabletrylock extends js.Object {
  @JSName("try_lock_for")
  var try_lock_for_Original: js.Function1[/* ms */ Double, js.Promise[Boolean]] = js.native
  @JSName("unlock")
  var unlock_Original: js.Function0[js.Promise[Unit]] = js.native
  def try_lock_for(ms: Double): js.Promise[Boolean] = js.native
  def unlock(): js.Promise[Unit] = js.native
}

