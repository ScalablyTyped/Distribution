package typings.viewportMercatorProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.viewportMercatorProject.anon.BaseDistanceScalesInputzo
  - typings.viewportMercatorProject.anon.BaseDistanceScalesInputsc
*/
trait DistanceScalesInput extends js.Object
object DistanceScalesInput {
  
  @scala.inline
  def BaseDistanceScalesInputzo(latitude: Double, longitude: Double, zoom: Double): DistanceScalesInput = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceScalesInput]
  }
  
  @scala.inline
  def BaseDistanceScalesInputsc(latitude: Double, longitude: Double, scale: Double): DistanceScalesInput = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceScalesInput]
  }
}
