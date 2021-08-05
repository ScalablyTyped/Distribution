package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BandScale extends StObject {
  
  var band: Double | Boolean
  
  var scale: typings.vegaTypings.encodeMod.Field
}
object BandScale {
  
  inline def apply(band: Double | Boolean, scale: typings.vegaTypings.encodeMod.Field): BandScale = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[BandScale]
  }
  
  extension [Self <: BandScale](x: Self) {
    
    inline def setBand(value: Double | Boolean): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    inline def setScale(value: typings.vegaTypings.encodeMod.Field): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
