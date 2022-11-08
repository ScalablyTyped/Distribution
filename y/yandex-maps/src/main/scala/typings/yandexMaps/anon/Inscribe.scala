package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inscribe extends StObject {
  
  var inscribe: Boolean
  
  var margin: Double | js.Array[Double]
  
  var preciseZoom: Boolean
}
object Inscribe {
  
  inline def apply(inscribe: Boolean, margin: Double | js.Array[Double], preciseZoom: Boolean): Inscribe = {
    val __obj = js.Dynamic.literal(inscribe = inscribe.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], preciseZoom = preciseZoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inscribe]
  }
  
  extension [Self <: Inscribe](x: Self) {
    
    inline def setInscribe(value: Boolean): Self = StObject.set(x, "inscribe", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: Double | js.Array[Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginVarargs(value: Double*): Self = StObject.set(x, "margin", js.Array(value*))
    
    inline def setPreciseZoom(value: Boolean): Self = StObject.set(x, "preciseZoom", value.asInstanceOf[js.Any])
  }
}
