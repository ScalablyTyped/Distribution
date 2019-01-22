package typings
package tstlLib.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "unique_lock")
@js.native
class unique_lock[Mutex /* <: tstlLib.threadUniqueLockMod.IMutex */] protected ()
  extends tstlLib.threadMod.unique_lock[Mutex] {
  def this(mutex: Mutex) = this()
}

