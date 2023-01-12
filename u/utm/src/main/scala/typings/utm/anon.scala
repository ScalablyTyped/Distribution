package typings.utm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Easting extends StObject {
    
    var easting: Double
    
    var northing: Double
    
    var zoneLetter: String
    
    var zoneNum: Double
  }
  object Easting {
    
    inline def apply(easting: Double, northing: Double, zoneLetter: String, zoneNum: Double): Easting = {
      val __obj = js.Dynamic.literal(easting = easting.asInstanceOf[js.Any], northing = northing.asInstanceOf[js.Any], zoneLetter = zoneLetter.asInstanceOf[js.Any], zoneNum = zoneNum.asInstanceOf[js.Any])
      __obj.asInstanceOf[Easting]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Easting] (val x: Self) extends AnyVal {
      
      inline def setEasting(value: Double): Self = StObject.set(x, "easting", value.asInstanceOf[js.Any])
      
      inline def setNorthing(value: Double): Self = StObject.set(x, "northing", value.asInstanceOf[js.Any])
      
      inline def setZoneLetter(value: String): Self = StObject.set(x, "zoneLetter", value.asInstanceOf[js.Any])
      
      inline def setZoneNum(value: Double): Self = StObject.set(x, "zoneNum", value.asInstanceOf[js.Any])
    }
  }
  
  trait Latitude extends StObject {
    
    var latitude: Double
    
    var longitude: Double
  }
  object Latitude {
    
    inline def apply(latitude: Double, longitude: Double): Latitude = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Latitude]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Latitude] (val x: Self) extends AnyVal {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
}
