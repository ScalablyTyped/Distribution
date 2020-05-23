package typings.viewportMercatorProject.mod

import typings.viewportMercatorProject.viewportMercatorProjectBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.viewportMercatorProject.anon.BaseHighPrecisionDistance
  - typings.viewportMercatorProject.anon.BaseHighPrecisionDistanceHighPrecision
*/
trait HighPrecisionDistanceScalesInput extends js.Object

object HighPrecisionDistanceScalesInput {
  @scala.inline
  def BaseHighPrecisionDistance(highPrecision: `true`, latitude: Double, longitude: Double, zoom: Double): HighPrecisionDistanceScalesInput = {
    val __obj = js.Dynamic.literal(highPrecision = highPrecision.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighPrecisionDistanceScalesInput]
  }
  @scala.inline
  def BaseHighPrecisionDistanceHighPrecision(highPrecision: `true`, latitude: Double, longitude: Double, scale: Double): HighPrecisionDistanceScalesInput = {
    val __obj = js.Dynamic.literal(highPrecision = highPrecision.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighPrecisionDistanceScalesInput]
  }
}

