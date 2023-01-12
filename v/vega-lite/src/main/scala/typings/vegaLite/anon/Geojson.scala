package typings.vegaLite.anon

import typings.vegaLite.vegaLiteStrings.geojson
import typings.vegaLite.vegaLiteStrings.nominal
import typings.vegaLite.vegaLiteStrings.ordinal
import typings.vegaLite.vegaLiteStrings.quantitative
import typings.vegaLite.vegaLiteStrings.temporal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geojson extends StObject {
  
  val geojson: typings.vegaLite.vegaLiteStrings.geojson
  
  val nominal: typings.vegaLite.vegaLiteStrings.nominal
  
  val ordinal: typings.vegaLite.vegaLiteStrings.ordinal
  
  val quantitative: typings.vegaLite.vegaLiteStrings.quantitative
  
  val temporal: typings.vegaLite.vegaLiteStrings.temporal
}
object Geojson {
  
  inline def apply(): Geojson = {
    val __obj = js.Dynamic.literal(geojson = "geojson", nominal = "nominal", ordinal = "ordinal", quantitative = "quantitative", temporal = "temporal")
    __obj.asInstanceOf[Geojson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Geojson] (val x: Self) extends AnyVal {
    
    inline def setGeojson(value: geojson): Self = StObject.set(x, "geojson", value.asInstanceOf[js.Any])
    
    inline def setNominal(value: nominal): Self = StObject.set(x, "nominal", value.asInstanceOf[js.Any])
    
    inline def setOrdinal(value: ordinal): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setQuantitative(value: quantitative): Self = StObject.set(x, "quantitative", value.asInstanceOf[js.Any])
    
    inline def setTemporal(value: temporal): Self = StObject.set(x, "temporal", value.asInstanceOf[js.Any])
  }
}
