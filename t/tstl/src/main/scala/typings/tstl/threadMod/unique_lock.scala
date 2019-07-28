package typings.tstl.threadMod

import typings.tstl.threadUniqueLockMod.IMutex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread", "unique_lock")
@js.native
class unique_lock[Mutex /* <: IMutex */] protected ()
  extends typings.tstl.threadUniqueLockMod.unique_lock[Mutex] {
  def this(mutex: Mutex) = this()
}

