package typings.webdriverJsExtender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Altitude extends StObject {
    
    var altitude: Double
    
    var latitude: Double
    
    var longitude: Double
  }
  object Altitude {
    
    inline def apply(altitude: Double, latitude: Double, longitude: Double): Altitude = {
      val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Altitude]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Altitude] (val x: Self) extends AnyVal {
      
      inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefineCommand extends StObject {
    
    def defineCommand(name: String, method: String, path: String): Unit
  }
  object DefineCommand {
    
    inline def apply(defineCommand: (String, String, String) => Unit): DefineCommand = {
      val __obj = js.Dynamic.literal(defineCommand = js.Any.fromFunction3(defineCommand))
      __obj.asInstanceOf[DefineCommand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefineCommand] (val x: Self) extends AnyVal {
      
      inline def setDefineCommand(value: (String, String, String) => Unit): Self = StObject.set(x, "defineCommand", js.Any.fromFunction3(value))
    }
  }
}
