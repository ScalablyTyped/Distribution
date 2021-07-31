package typings.winrt.Windows.Globalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeographicRegionFactory extends StObject {
  
  def createGeographicRegion(geographicRegionCode: String): GeographicRegion
}
object IGeographicRegionFactory {
  
  @scala.inline
  def apply(createGeographicRegion: String => GeographicRegion): IGeographicRegionFactory = {
    val __obj = js.Dynamic.literal(createGeographicRegion = js.Any.fromFunction1(createGeographicRegion))
    __obj.asInstanceOf[IGeographicRegionFactory]
  }
  
  @scala.inline
  implicit class IGeographicRegionFactoryMutableBuilder[Self <: IGeographicRegionFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateGeographicRegion(value: String => GeographicRegion): Self = StObject.set(x, "createGeographicRegion", js.Any.fromFunction1(value))
  }
}
