package typings.webdriverJsExtender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Altitude extends StObject {
    
    var altitude: Double = js.native
    
    var latitude: Double = js.native
    
    var longitude: Double = js.native
  }
  object Altitude {
    
    @scala.inline
    def apply(altitude: Double, latitude: Double, longitude: Double): Altitude = {
      val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Altitude]
    }
    
    @scala.inline
    implicit class AltitudeMutableBuilder[Self <: Altitude] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DefineCommand extends StObject {
    
    def defineCommand(name: String, method: String, path: String): Unit = js.native
  }
  object DefineCommand {
    
    @scala.inline
    def apply(defineCommand: (String, String, String) => Unit): DefineCommand = {
      val __obj = js.Dynamic.literal(defineCommand = js.Any.fromFunction3(defineCommand))
      __obj.asInstanceOf[DefineCommand]
    }
    
    @scala.inline
    implicit class DefineCommandMutableBuilder[Self <: DefineCommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefineCommand(value: (String, String, String) => Unit): Self = StObject.set(x, "defineCommand", js.Any.fromFunction3(value))
    }
  }
}
