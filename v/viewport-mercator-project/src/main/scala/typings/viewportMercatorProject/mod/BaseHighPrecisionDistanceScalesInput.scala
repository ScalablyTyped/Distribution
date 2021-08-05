package typings.viewportMercatorProject.mod

import typings.viewportMercatorProject.viewportMercatorProjectBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseHighPrecisionDistanceScalesInput
  extends StObject
     with BaseDistanceScalesInput {
  
  var highPrecision: `true`
}
object BaseHighPrecisionDistanceScalesInput {
  
  inline def apply(latitude: Double, longitude: Double): BaseHighPrecisionDistanceScalesInput = {
    val __obj = js.Dynamic.literal(highPrecision = true, latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseHighPrecisionDistanceScalesInput]
  }
  
  extension [Self <: BaseHighPrecisionDistanceScalesInput](x: Self) {
    
    inline def setHighPrecision(value: `true`): Self = StObject.set(x, "highPrecision", value.asInstanceOf[js.Any])
  }
}
