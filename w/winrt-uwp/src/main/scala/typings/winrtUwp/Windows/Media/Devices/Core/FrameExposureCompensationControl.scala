package typings.winrtUwp.Windows.Media.Devices.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the exposure compensation settings for a frame in a variable photo sequence. */
@js.native
trait FrameExposureCompensationControl extends js.Object {
  
  /** Gets or sets the exposure compensation time for a frame in a variable photo sequence. */
  var value: Double = js.native
}
object FrameExposureCompensationControl {
  
  @scala.inline
  def apply(value: Double): FrameExposureCompensationControl = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameExposureCompensationControl]
  }
  
  @scala.inline
  implicit class FrameExposureCompensationControlOps[Self <: FrameExposureCompensationControl] (val x: Self) extends AnyVal {
    
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
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
