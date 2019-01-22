package typings
package tstlLib.threadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread", "unique_lock")
@js.native
class unique_lock[Mutex /* <: tstlLib.threadUniqueLockMod.IMutex */] protected ()
  extends tstlLib.threadUniqueLockMod.unique_lock[Mutex] {
  def this(mutex: Mutex) = this()
}

