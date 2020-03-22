package typings.tstl.mod

import typings.tstl.ilockableMod.ILockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "SharedTimedMutex")
@js.native
/**
  * Default Constructor.
  */
class SharedTimedMutex ()
  extends typings.tstl.threadMod.SharedTimedMutex {
  /**
    * @internal
    */
  def this(source: ILockable) = this()
}

