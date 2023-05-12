package typings.workboxRangeRequests

import typings.std.Blob
import typings.workboxRangeRequests.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsCalculateEffectiveBoundariesMod {
  
  @JSImport("workbox-range-requests/utils/calculateEffectiveBoundaries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param {Blob} blob A source blob.
    * @param {number} [start] The offset to use as the start of the
    * slice.
    * @param {number} [end] The offset to use as the end of the slice.
    * @return {Object} An object with `start` and `end` properties, reflecting
    * the effective boundaries to use given the size of the blob.
    *
    * @private
    */
  inline def calculateEffectiveBoundaries(blob: Blob): End = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateEffectiveBoundaries")(blob.asInstanceOf[js.Any]).asInstanceOf[End]
  inline def calculateEffectiveBoundaries(blob: Blob, start: Double): End = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateEffectiveBoundaries")(blob.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[End]
  inline def calculateEffectiveBoundaries(blob: Blob, start: Double, end: Double): End = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateEffectiveBoundaries")(blob.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[End]
  inline def calculateEffectiveBoundaries(blob: Blob, start: Unit, end: Double): End = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateEffectiveBoundaries")(blob.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[End]
}
