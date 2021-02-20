package typings.viewportMercatorProject.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizedViewportProps extends FlyToViewportProps {
  
  var bearing: Double = js.native
  
  var pitch: Double = js.native
}
object NormalizedViewportProps {
  
  @scala.inline
  def apply(
    bearing: Double,
    height: Double,
    latitude: Double,
    longitude: Double,
    pitch: Double,
    width: Double,
    zoom: Double
  ): NormalizedViewportProps = {
    val __obj = js.Dynamic.literal(bearing = bearing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedViewportProps]
  }
  
  @scala.inline
  implicit class NormalizedViewportPropsMutableBuilder[Self <: NormalizedViewportProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
  }
}
