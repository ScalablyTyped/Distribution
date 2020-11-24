package typings.tstl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<tstl.tstl/base/thread/ILockable.ILockable, 'lock' | 'unlock'> */
@js.native
trait PickILockablelockunlock extends js.Object {
  
  def lock(): js.Promise[Unit] = js.native
  @JSName("lock")
  var lock_Original: js.Function0[js.Promise[Unit]] = js.native
  
  def unlock(): js.Promise[Unit] = js.native
  @JSName("unlock")
  var unlock_Original: js.Function0[js.Promise[Unit]] = js.native
}
