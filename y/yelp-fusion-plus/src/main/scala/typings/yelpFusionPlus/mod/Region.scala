package typings.yelpFusionPlus.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Region extends StObject {
  
  var center: Coordinates
}
object Region {
  
  inline def apply(center: Coordinates): Region = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: Coordinates): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
  }
}
