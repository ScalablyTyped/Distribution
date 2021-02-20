package typings.vegaLite.anon

import typings.vegaLite.vegaLiteStrings.geojson
import typings.vegaLite.vegaLiteStrings.nominal
import typings.vegaLite.vegaLiteStrings.ordinal
import typings.vegaLite.vegaLiteStrings.quantitative
import typings.vegaLite.vegaLiteStrings.temporal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geojson extends StObject {
  
  val geojson: typings.vegaLite.vegaLiteStrings.geojson = js.native
  
  val nominal: typings.vegaLite.vegaLiteStrings.nominal = js.native
  
  val ordinal: typings.vegaLite.vegaLiteStrings.ordinal = js.native
  
  val quantitative: typings.vegaLite.vegaLiteStrings.quantitative = js.native
  
  val temporal: typings.vegaLite.vegaLiteStrings.temporal = js.native
}
object Geojson {
  
  @scala.inline
  def apply(
    geojson: geojson,
    nominal: nominal,
    ordinal: ordinal,
    quantitative: quantitative,
    temporal: temporal
  ): Geojson = {
    val __obj = js.Dynamic.literal(geojson = geojson.asInstanceOf[js.Any], nominal = nominal.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any], quantitative = quantitative.asInstanceOf[js.Any], temporal = temporal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geojson]
  }
  
  @scala.inline
  implicit class GeojsonMutableBuilder[Self <: Geojson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeojson(value: geojson): Self = StObject.set(x, "geojson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNominal(value: nominal): Self = StObject.set(x, "nominal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdinal(value: ordinal): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantitative(value: quantitative): Self = StObject.set(x, "quantitative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemporal(value: temporal): Self = StObject.set(x, "temporal", value.asInstanceOf[js.Any])
  }
}
