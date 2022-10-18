package typings.vegaLite.buildSrcMarkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelativeBandSize extends StObject {
  
  /**
    * The relative band size.  For example `0.5` means half of the band scale's band width.
    */
  var band: Double
}
object RelativeBandSize {
  
  inline def apply(band: Double): RelativeBandSize = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeBandSize]
  }
  
  extension [Self <: RelativeBandSize](x: Self) {
    
    inline def setBand(value: Double): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
  }
}
