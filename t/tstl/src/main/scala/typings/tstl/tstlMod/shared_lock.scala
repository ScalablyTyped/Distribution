package typings.tstl.tstlMod

import typings.tstl.threadSharedLockMod.IMutex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "shared_lock")
@js.native
class shared_lock[Mutex /* <: IMutex */] protected ()
  extends typings.tstl.threadMod.shared_lock[Mutex] {
  def this(mutex: Mutex) = this()
}

