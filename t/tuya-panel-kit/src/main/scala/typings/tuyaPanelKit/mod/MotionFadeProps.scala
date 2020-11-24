package typings.tuyaPanelKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MotionFadeProps extends MotionProps {
  
  var fadeOpacity: js.UndefOr[Double] = js.native
}
object MotionFadeProps {
  
  @scala.inline
  def apply(): MotionFadeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionFadeProps]
  }
  
  @scala.inline
  implicit class MotionFadePropsOps[Self <: MotionFadeProps] (val x: Self) extends AnyVal {
    
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
    def setFadeOpacity(value: Double): Self = this.set("fadeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeOpacity: Self = this.set("fadeOpacity", js.undefined)
  }
}
