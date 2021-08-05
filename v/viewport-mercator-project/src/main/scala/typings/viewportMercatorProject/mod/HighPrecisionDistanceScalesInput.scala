package typings.viewportMercatorProject.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.viewportMercatorProject.anon.BaseHighPrecisionDistance
  - typings.viewportMercatorProject.anon.BaseHighPrecisionDistanceHighPrecision
*/
trait HighPrecisionDistanceScalesInput extends StObject
object HighPrecisionDistanceScalesInput {
  
  inline def BaseHighPrecisionDistance(latitude: Double, longitude: Double, zoom: Double): typings.viewportMercatorProject.anon.BaseHighPrecisionDistance = {
    val __obj = js.Dynamic.literal(highPrecision = true, latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.viewportMercatorProject.anon.BaseHighPrecisionDistance]
  }
  
  inline def BaseHighPrecisionDistanceHighPrecision(latitude: Double, longitude: Double, scale: Double): typings.viewportMercatorProject.anon.BaseHighPrecisionDistanceHighPrecision = {
    val __obj = js.Dynamic.literal(highPrecision = true, latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.viewportMercatorProject.anon.BaseHighPrecisionDistanceHighPrecision]
  }
}
