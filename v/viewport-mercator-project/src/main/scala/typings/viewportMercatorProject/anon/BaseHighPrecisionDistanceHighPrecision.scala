package typings.viewportMercatorProject.anon

import typings.viewportMercatorProject.mod.HighPrecisionDistanceScalesInput
import typings.viewportMercatorProject.viewportMercatorProjectBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined viewport-mercator-project.viewport-mercator-project.BaseHighPrecisionDistanceScalesInput & {  scale :number} */
@js.native
trait BaseHighPrecisionDistanceHighPrecision extends HighPrecisionDistanceScalesInput {
  
  var highPrecision: `true` = js.native
  
  var latitude: Double = js.native
  
  var longitude: Double = js.native
  
  var scale: Double = js.native
}
object BaseHighPrecisionDistanceHighPrecision {
  
  @scala.inline
  def apply(highPrecision: `true`, latitude: Double, longitude: Double, scale: Double): BaseHighPrecisionDistanceHighPrecision = {
    val __obj = js.Dynamic.literal(highPrecision = highPrecision.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseHighPrecisionDistanceHighPrecision]
  }
  
  @scala.inline
  implicit class BaseHighPrecisionDistanceHighPrecisionOps[Self <: BaseHighPrecisionDistanceHighPrecision] (val x: Self) extends AnyVal {
    
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
    def setHighPrecision(value: `true`): Self = this.set("highPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
  }
}
