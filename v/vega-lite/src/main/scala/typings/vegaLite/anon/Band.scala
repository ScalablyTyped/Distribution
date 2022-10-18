package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Band extends StObject {
  
  var band: Double | Boolean
  
  var scale: typings.vegaTypings.typesSpecEncodeMod.Field
}
object Band {
  
  inline def apply(band: Double | Boolean, scale: typings.vegaTypings.typesSpecEncodeMod.Field): Band = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Band]
  }
  
  extension [Self <: Band](x: Self) {
    
    inline def setBand(value: Double | Boolean): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    inline def setScale(value: typings.vegaTypings.typesSpecEncodeMod.Field): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
