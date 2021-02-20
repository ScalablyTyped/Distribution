package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Latitude extends StObject {
  
  val latitude: typings.vegaLite.vegaLiteNumbers.`1` = js.native
  
  val latitude2: typings.vegaLite.vegaLiteNumbers.`1` = js.native
  
  val longitude: typings.vegaLite.vegaLiteNumbers.`1` = js.native
  
  val longitude2: typings.vegaLite.vegaLiteNumbers.`1` = js.native
}
object Latitude {
  
  @scala.inline
  def apply(
    latitude: typings.vegaLite.vegaLiteNumbers.`1`,
    latitude2: typings.vegaLite.vegaLiteNumbers.`1`,
    longitude: typings.vegaLite.vegaLiteNumbers.`1`,
    longitude2: typings.vegaLite.vegaLiteNumbers.`1`
  ): Latitude = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], latitude2 = latitude2.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], longitude2 = longitude2.asInstanceOf[js.Any])
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
