package typings.vegaLite.channeldefMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BandMixins extends StObject {
  
  /**
    * Relative position on a band of a stacked, binned, time unit, or band scale. For example, the marks will be positioned at the beginning of the band if set to `0`, and at the middle of the band if set to `0.5`.
    *
    * @minimum 0
    * @maximum 1
    */
  var bandPosition: js.UndefOr[Double] = js.undefined
}
object BandMixins {
  
  inline def apply(): BandMixins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BandMixins]
  }
  
  extension [Self <: BandMixins](x: Self) {
    
    inline def setBandPosition(value: Double): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
    
    inline def setBandPositionUndefined: Self = StObject.set(x, "bandPosition", js.undefined)
  }
}
