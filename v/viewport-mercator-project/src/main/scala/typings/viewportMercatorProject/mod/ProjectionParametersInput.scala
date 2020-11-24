package typings.viewportMercatorProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectionParametersInput extends js.Object {
  
  var altitude: js.UndefOr[Double] = js.native
  
  var farZMultiplier: js.UndefOr[Double] = js.native
  
  var height: Double = js.native
  
  var nearZMultiplier: js.UndefOr[Double] = js.native
  
  var pitch: js.UndefOr[Double] = js.native
  
  var width: Double = js.native
}
object ProjectionParametersInput {
  
  @scala.inline
  def apply(height: Double, width: Double): ProjectionParametersInput = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionParametersInput]
  }
  
  @scala.inline
  implicit class ProjectionParametersInputOps[Self <: ProjectionParametersInput] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    
    @scala.inline
    def setFarZMultiplier(value: Double): Self = this.set("farZMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFarZMultiplier: Self = this.set("farZMultiplier", js.undefined)
    
    @scala.inline
    def setNearZMultiplier(value: Double): Self = this.set("nearZMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNearZMultiplier: Self = this.set("nearZMultiplier", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePitch: Self = this.set("pitch", js.undefined)
  }
}
