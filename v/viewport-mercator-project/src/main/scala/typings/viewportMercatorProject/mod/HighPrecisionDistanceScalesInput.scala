package typings.viewportMercatorProject.mod

import typings.viewportMercatorProject.viewportMercatorProjectBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.viewportMercatorProject.anon.BaseHighPrecisionDistance
  - typings.viewportMercatorProject.anon.BaseHighPrecisionDistanceHighPrecision
*/
trait HighPrecisionDistanceScalesInput extends StObject
object HighPrecisionDistanceScalesInput {
  
  @scala.inline
  def BaseHighPrecisionDistance(highPrecision: `true`, latitude: Double, longitude: Double, zoom: Double): typings.viewportMercatorProject.anon.BaseHighPrecisionDistance = {
    val __obj = js.Dynamic.literal(highPrecision = highPrecision.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.viewportMercatorProject.anon.BaseHighPrecisionDistance]
  }
  
  @scala.inline
  def BaseHighPrecisionDistanceHighPrecision(highPrecision: `true`, latitude: Double, longitude: Double, scale: Double): typings.viewportMercatorProject.anon.BaseHighPrecisionDistanceHighPrecision = {
    val __obj = js.Dynamic.literal(highPrecision = highPrecision.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.viewportMercatorProject.anon.BaseHighPrecisionDistanceHighPrecision]
  }
}
