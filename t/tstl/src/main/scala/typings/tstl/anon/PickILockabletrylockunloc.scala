package typings.tstl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<tstl.tstl/base/thread/ILockable.ILockable, 'try_lock' | 'unlock'> */
@js.native
trait PickILockabletrylockunloc extends js.Object {
  
  def try_lock(): js.Promise[Boolean] = js.native
  @JSName("try_lock")
  var try_lock_Original: js.Function0[js.Promise[Boolean]] = js.native
  
  def unlock(): js.Promise[Unit] = js.native
  @JSName("unlock")
  var unlock_Original: js.Function0[js.Promise[Unit]] = js.native
}
