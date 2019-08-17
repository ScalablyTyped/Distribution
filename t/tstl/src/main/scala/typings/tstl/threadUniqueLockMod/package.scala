package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object threadUniqueLockMod {
  import typings.std.Partial
  import typings.tstl.baseThreadUnderscoreITimedLockableMod._ITimedLockable
  import typings.tstl.threadILockableMod.ILockable

  /**
    * @hidden
    */
  type Closure = js.Function0[Unit | js.Promise[Unit]]
  /**
    * @hidden
    */
  type IMutex = ILockable with Partial[_ITimedLockable]
}
