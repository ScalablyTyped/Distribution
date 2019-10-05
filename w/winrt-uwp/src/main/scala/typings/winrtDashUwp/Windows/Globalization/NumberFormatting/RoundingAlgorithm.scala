package typings.winrtDashUwp.Windows.Globalization.NumberFormatting

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
  sealed trait none extends RoundingAlgorithm
  
  /** Round away from zero. This is the equivalent of RoundUp if the input is positive, or RoundDown if the input is negative. */
  @js.native
  sealed trait roundAwayFromZero extends RoundingAlgorithm
  
  /** Round towards negative infinity. (Return the largest integer, increment, or significant digit which does not exceed the input.) */
  @js.native
  sealed trait roundDown extends RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, this is the equivalent of RoundAwayFromZero. */
  @js.native
  sealed trait roundHalfAwayFromZero extends RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, this is the equivalent of RoundDown. */
  @js.native
  sealed trait roundHalfDown extends RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, round to the nearest even output. */
  @js.native
  sealed trait roundHalfToEven extends RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, round to the nearest odd output. */
  @js.native
  sealed trait roundHalfToOdd extends RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, this is the equivalent of RoundTowardsZero. */
  @js.native
  sealed trait roundHalfTowardsZero extends RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, this is the equivalent of RoundUp. */
  @js.native
  sealed trait roundHalfUp extends RoundingAlgorithm
  
  /** Round towards zero. This is the equivalent of RoundDown if the input is positive, or RoundUp if the input is negative. */
  @js.native
  sealed trait roundTowardsZero extends RoundingAlgorithm
  
  /** Round towards infinity. (Return the smallest integer, increment, or significant digit which is not less than the input.) */
  @js.native
  sealed trait roundUp extends RoundingAlgorithm
  
  /* 0 */ val none: typings.winrtDashUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.none with Double = js.native
  /* 4 */ val roundAwayFromZero: typings.winrtDashUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundAwayFromZero with Double = js.native
  /* 1 */ val roundDown: typings.winrtDashUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundDown with Double = js.native
  /* 8 */ val roundHalfAwayFromZero: typings.winrtDashUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfAwayFromZero with Double = js.native
  /* 5 */ val roundHalfDown: typings.winrtDashUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfDown with Double = js.native
  /* 9 */ val roundHalfToEven: typings.winrtDashUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfToEven with Double = js.native
  /* 10 */ val roundHalfToOdd: typings.winrtDashUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfToOdd with Double = js.native
  /* 7 */ val roundHalfTowardsZero: typings.winrtDashUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfTowardsZero with Double = js.native
  /* 6 */ val roundHalfUp: typings.winrtDashUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfUp with Double = js.native
  /* 3 */ val roundTowardsZero: typings.winrtDashUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundTowardsZero with Double = js.native
  /* 2 */ val roundUp: typings.winrtDashUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundUp with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RoundingAlgorithm with Double] = js.native
}

