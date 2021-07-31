package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maps extends StObject {
  
  var maps: Geocoder
}
object Maps {
  
  @scala.inline
  def apply(maps: Geocoder): Maps = {
    val __obj = js.Dynamic.literal(maps = maps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maps]
  }
  
  @scala.inline
  implicit class MapsMutableBuilder[Self <: Maps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaps(value: Geocoder): Self = StObject.set(x, "maps", value.asInstanceOf[js.Any])
  }
}
