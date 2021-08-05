package typings.winrt.Windows.Globalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeographicRegionFactory extends StObject {
  
  def createGeographicRegion(geographicRegionCode: String): GeographicRegion
}
object IGeographicRegionFactory {
  
  inline def apply(createGeographicRegion: String => GeographicRegion): IGeographicRegionFactory = {
    val __obj = js.Dynamic.literal(createGeographicRegion = js.Any.fromFunction1(createGeographicRegion))
    __obj.asInstanceOf[IGeographicRegionFactory]
  }
  
  extension [Self <: IGeographicRegionFactory](x: Self) {
    
    inline def setCreateGeographicRegion(value: String => GeographicRegion): Self = StObject.set(x, "createGeographicRegion", js.Any.fromFunction1(value))
  }
}
