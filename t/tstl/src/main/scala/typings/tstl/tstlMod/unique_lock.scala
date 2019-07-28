package typings.tstl.tstlMod

import typings.tstl.threadUniqueLockMod.IMutex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "unique_lock")
@js.native
class unique_lock[Mutex /* <: IMutex */] protected ()
  extends typings.tstl.threadMod.unique_lock[Mutex] {
  def this(mutex: Mutex) = this()
}

