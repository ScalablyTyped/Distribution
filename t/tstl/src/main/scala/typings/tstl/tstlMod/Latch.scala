package typings.tstl.tstlMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "Latch")
@js.native
class Latch protected ()
  extends typings.tstl.threadMod.Latch {
  /**
    * Initializer Constructor.
    *
    * @param size Size of the downward counter.
    */
  def this(size: Double) = this()
}

@JSImport("tstl", "latch")
@js.native
object latch
  extends TopLevel[Instantiable1[/* size */ Double, typings.tstl.threadLatchMod.Latch]]

