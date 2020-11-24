package typings.twineSugarcube.extensionsMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Math extends js.Object {
  
  def clamp(num: java.lang.String, min: Double, max: Double): Double = js.native
  /**
    * Returns the given number clamped to the specified bounds. Does not modify the original.
    * @param num The number to clamp. May be an actual number or a numerical string.
    * @param min The lower bound of the number.
    * @param max The upper bound of the number.
    * @since 2.0.0
    * @example
    * Math.clamp($stat, 0, 200) // Clamps $stat to the bounds 0–200 and returns the new value
    * Math.clamp($stat, 1, 6.6) // Clamps $stat to the bounds 1–6.6 and returns the new value
    */
  def clamp(num: Double, min: Double, max: Double): Double = js.native
  
  /**
    * Returns the whole(integer) part of the given number by removing its fractional part, if any. Does not modify the
    * original.
    * @param num The number to truncate to an integer.
    * @since 2.0.0
    * @example
    * Math.trunc(12.7) // Returns 12
    * Math.trunc(-12.7) // Returns -12
    */
  def trunc(num: Double): Double = js.native
}
