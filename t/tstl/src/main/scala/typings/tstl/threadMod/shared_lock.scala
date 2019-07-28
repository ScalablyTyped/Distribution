package typings.tstl.threadMod

import typings.tstl.threadSharedLockMod.IMutex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread", "shared_lock")
@js.native
class shared_lock[Mutex /* <: IMutex */] protected ()
  extends typings.tstl.threadSharedLockMod.shared_lock[Mutex] {
  def this(mutex: Mutex) = this()
}

