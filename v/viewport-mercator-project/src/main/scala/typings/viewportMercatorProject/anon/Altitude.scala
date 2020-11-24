package typings.viewportMercatorProject.anon

import typings.viewportMercatorProject.mod.CoordinatesZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Altitude extends js.Object {
  
  var altitude: Double = js.native
  
  var bearing: Double = js.native
  
  var center: js.UndefOr[CoordinatesZ] = js.native
  
  var flipY: js.UndefOr[Boolean] = js.native
  
  var height: Double = js.native
  
  var pitch: Double = js.native
}
object Altitude {
  
  @scala.inline
  def apply(altitude: Double, bearing: Double, height: Double, pitch: Double): Altitude = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], bearing = bearing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Altitude]
  }
  
  @scala.inline
  implicit class AltitudeOps[Self <: Altitude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBearing(value: Double): Self = this.set("bearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: CoordinatesZ): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setFlipY(value: Boolean): Self = this.set("flipY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlipY: Self = this.set("flipY", js.undefined)
  }
}
