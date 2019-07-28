package typings.tstl.tstlMod

import typings.tstl.threadUniqueLockMod.IMutex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "UniqueLock")
@js.native
class UniqueLock[Mutex /* <: IMutex */] protected ()
  extends typings.tstl.threadMod.UniqueLock[Mutex] {
  def this(mutex: Mutex) = this()
}

