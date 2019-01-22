package typings
package tstlLib.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "shared_lock")
@js.native
class shared_lock[Mutex /* <: tstlLib.threadSharedLockMod.IMutex */] protected ()
  extends tstlLib.threadMod.shared_lock[Mutex] {
  def this(mutex: Mutex) = this()
}

