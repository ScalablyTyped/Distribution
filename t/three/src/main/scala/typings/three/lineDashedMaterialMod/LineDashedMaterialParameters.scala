package typings.three.lineDashedMaterialMod

import typings.three.lineBasicMaterialMod.LineBasicMaterialParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineDashedMaterialParameters extends LineBasicMaterialParameters {
  
  var dashSize: js.UndefOr[Double] = js.native
  
  var gapSize: js.UndefOr[Double] = js.native
  
  var scale: js.UndefOr[Double] = js.native
}
object LineDashedMaterialParameters {
  
  @scala.inline
  def apply(): LineDashedMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineDashedMaterialParameters]
  }
  
  @scala.inline
  implicit class LineDashedMaterialParametersOps[Self <: LineDashedMaterialParameters] (val x: Self) extends AnyVal {
    
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
    def setDashSize(value: Double): Self = this.set("dashSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashSize: Self = this.set("dashSize", js.undefined)
    
    @scala.inline
    def setGapSize(value: Double): Self = this.set("gapSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGapSize: Self = this.set("gapSize", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
}
