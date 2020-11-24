package typings.tuyaPanelKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MotionScaleFadeInProps extends MotionProps {
  
  var finalScale: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var initScale: js.UndefOr[Double] = js.native
  
  var isAlign: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object MotionScaleFadeInProps {
  
  @scala.inline
  def apply(): MotionScaleFadeInProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionScaleFadeInProps]
  }
  
  @scala.inline
  implicit class MotionScaleFadeInPropsOps[Self <: MotionScaleFadeInProps] (val x: Self) extends AnyVal {
    
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
    def setFinalScale(value: Double): Self = this.set("finalScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalScale: Self = this.set("finalScale", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setInitScale(value: Double): Self = this.set("initScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitScale: Self = this.set("initScale", js.undefined)
    
    @scala.inline
    def setIsAlign(value: Boolean): Self = this.set("isAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAlign: Self = this.set("isAlign", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
