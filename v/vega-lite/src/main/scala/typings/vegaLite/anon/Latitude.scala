package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Latitude extends StObject {
  
  val latitude: typings.vegaLite.vegaLiteNumbers.`1`
  
  val latitude2: typings.vegaLite.vegaLiteNumbers.`1`
  
  val longitude: typings.vegaLite.vegaLiteNumbers.`1`
  
  val longitude2: typings.vegaLite.vegaLiteNumbers.`1`
}
object Latitude {
  
  @scala.inline
  def apply(): Latitude = {
    val __obj = js.Dynamic.literal(latitude = 1, latitude2 = 1, longitude = 1, longitude2 = 1)
    __obj.asInstanceOf[Latitude]
  }
  
  @scala.inline
  implicit class LatitudeMutableBuilder[Self <: Latitude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatitude(value: typings.vegaLite.vegaLiteNumbers.`1`): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude2(value: typings.vegaLite.vegaLiteNumbers.`1`): Self = StObject.set(x, "latitude2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: typings.vegaLite.vegaLiteNumbers.`1`): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude2(value: typings.vegaLite.vegaLiteNumbers.`1`): Self = StObject.set(x, "longitude2", value.asInstanceOf[js.Any])
  }
}
