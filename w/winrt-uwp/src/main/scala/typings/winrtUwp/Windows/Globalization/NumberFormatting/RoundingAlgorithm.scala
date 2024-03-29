package typings.winrtUwp.Windows.Globalization.NumberFormatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RoundingAlgorithm extends StObject
/** Specifies the algorithm used to round numbers. */
@JSGlobal("Windows.Globalization.NumberFormatting.RoundingAlgorithm")
@js.native
object RoundingAlgorithm extends StObject {
  
  /** No rounding is performed. */
  @js.native
  sealed trait none
    extends StObject
       with RoundingAlgorithm
  
  /** Round away from zero. This is the equivalent of RoundUp if the input is positive, or RoundDown if the input is negative. */
  @js.native
  sealed trait roundAwayFromZero
    extends StObject
       with RoundingAlgorithm
  
  /** Round towards negative infinity. (Return the largest integer, increment, or significant digit which does not exceed the input.) */
  @js.native
  sealed trait roundDown
    extends StObject
       with RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, this is the equivalent of RoundAwayFromZero. */
  @js.native
  sealed trait roundHalfAwayFromZero
    extends StObject
       with RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, this is the equivalent of RoundDown. */
  @js.native
  sealed trait roundHalfDown
    extends StObject
       with RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, round to the nearest even output. */
  @js.native
  sealed trait roundHalfToEven
    extends StObject
       with RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, round to the nearest odd output. */
  @js.native
  sealed trait roundHalfToOdd
    extends StObject
       with RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, this is the equivalent of RoundTowardsZero. */
  @js.native
  sealed trait roundHalfTowardsZero
    extends StObject
       with RoundingAlgorithm
  
  /** Round to the integer, increment, or significant digit that is closest to the input. If the input is exactly halfway between the possible outputs, this is the equivalent of RoundUp. */
  @js.native
  sealed trait roundHalfUp
    extends StObject
       with RoundingAlgorithm
  
  /** Round towards zero. This is the equivalent of RoundDown if the input is positive, or RoundUp if the input is negative. */
  @js.native
  sealed trait roundTowardsZero
    extends StObject
       with RoundingAlgorithm
  
  /** Round towards infinity. (Return the smallest integer, increment, or significant digit which is not less than the input.) */
  @js.native
  sealed trait roundUp
    extends StObject
       with RoundingAlgorithm
}
