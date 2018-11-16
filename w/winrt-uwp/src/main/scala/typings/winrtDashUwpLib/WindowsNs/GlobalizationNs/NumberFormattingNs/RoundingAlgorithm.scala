package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs.NumberFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoundingAlgorithm extends js.Object

/** Specifies the algorithm used to round numbers. */
@JSGlobal("Windows.Globalization.NumberFormatting.RoundingAlgorithm")
@js.native
object RoundingAlgorithm extends js.Object {
  /** No rounding is performed. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.NumberFormattingNs.RoundingAlgorithm
  
  /** Round away from zero. This is the equivalent of RoundUp if the input is positive, or RoundDown if the input is negative. */
  @js.native
  sealed trait roundAwayFromZero
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.NumberFormattingNs.RoundingAlgorithm
  
  /** Round towards negative infinity. (Return the largest integer, increment, or significant digit which does not exceed the input.) */
  @js.native
  sealed trait roundDown
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.NumberFormattingNs.RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, this is the equivalent of RoundAwayFromZero. */
  @js.native
  sealed trait roundHalfAwayFromZero
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.NumberFormattingNs.RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, this is the equivalent of RoundDown. */
  @js.native
  sealed trait roundHalfDown
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.NumberFormattingNs.RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, round to the nearest even output. */
  @js.native
  sealed trait roundHalfToEven
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.NumberFormattingNs.RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, round to the nearest odd output. */
  @js.native
  sealed trait roundHalfToOdd
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.NumberFormattingNs.RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, this is the equivalent of RoundTowardsZero. */
  @js.native
  sealed trait roundHalfTowardsZero
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.NumberFormattingNs.RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, this is the equivalent of RoundUp. */
  @js.native
  sealed trait roundHalfUp
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.NumberFormattingNs.RoundingAlgorithm
  
  /** Round towards zero. This is the equivalent of RoundDown if the input is positive, or RoundUp if the input is negative. */
  @js.native
  sealed trait roundTowardsZero
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.NumberFormattingNs.RoundingAlgorithm
  
  /** Round towards infinity. (Return the smallest integer, increment, or significant digit which is not less than the input.) */
  @js.native
  sealed trait roundUp
    extends winrtDashUwpLib.WindowsNs.GlobalizationNs.NumberFormattingNs.RoundingAlgorithm
  
  val none: none with java.lang.String = js.native
  val roundAwayFromZero: roundAwayFromZero with java.lang.String = js.native
  val roundDown: roundDown with java.lang.String = js.native
  val roundHalfAwayFromZero: roundHalfAwayFromZero with java.lang.String = js.native
  val roundHalfDown: roundHalfDown with java.lang.String = js.native
  val roundHalfToEven: roundHalfToEven with java.lang.String = js.native
  val roundHalfToOdd: roundHalfToOdd with java.lang.String = js.native
  val roundHalfTowardsZero: roundHalfTowardsZero with java.lang.String = js.native
  val roundHalfUp: roundHalfUp with java.lang.String = js.native
  val roundTowardsZero: roundTowardsZero with java.lang.String = js.native
  val roundUp: roundUp with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GlobalizationNs.NumberFormattingNs.RoundingAlgorithm with java.lang.String
  ] = js.native
}

