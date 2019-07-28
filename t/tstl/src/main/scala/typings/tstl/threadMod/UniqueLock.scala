package typings.tstl.threadMod

import typings.tstl.threadUniqueLockMod.IMutex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread", "UniqueLock")
@js.native
class UniqueLock[Mutex /* <: IMutex */] protected ()
  extends typings.tstl.threadUniqueLockMod.UniqueLock[Mutex] {
  def this(mutex: Mutex) = this()
}

