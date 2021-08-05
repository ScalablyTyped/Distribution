package typings.svgMapsUsa

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@svg-maps/usa", JSImport.Default)
  @js.native
  val default: Map = js.native
  
  trait Location extends StObject {
    
    var id: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var path: String
  }
  object Location {
    
    inline def apply(id: String, path: String): Location = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Map extends StObject {
    
    var label: js.UndefOr[String] = js.undefined
    
    var locations: js.Array[Location]
    
    var viewBox: String
  }
  object Map {
    
    inline def apply(locations: js.Array[Location], viewBox: String): Map = {
      val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
      __obj.asInstanceOf[Map]
    }
    
    extension [Self <: Map](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value :_*))
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Map
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Map = default
}
