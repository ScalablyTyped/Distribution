package typings.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Clock")
@js.native
/**
	 * @param autoStart Automatically start the clock.
	 */
class Clock ()
  extends typings.three.srcCoreClockMod.Clock {
  def this(autoStart: Boolean) = this()
}

