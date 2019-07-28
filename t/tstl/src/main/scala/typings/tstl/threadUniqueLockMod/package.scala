package typings.tstl

import typings.std.Partial
import typings.tstl.baseThreadUnderscoreITimedLockableMod._ITimedLockable
import typings.tstl.threadILockableMod.ILockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object threadUniqueLockMod {
  /**
    * @hidden
    */
  type Closure = js.Function0[Unit | js.Promise[Unit]]
  /**
    * @hidden
    */
  type IMutex = ILockable with Partial[_ITimedLockable]
}
