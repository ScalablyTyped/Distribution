package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Clock")
@js.native
/**
	 * @param autoStart Automatically start the clock.
	 */
class Clock ()
  extends threeLib.srcCoreClockMod.Clock {
  def this(autoStart: scala.Boolean) = this()
}

