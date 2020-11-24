package typings.tensorflowTfjsData.typesMod

import typings.tensorflowTfjsData.tensorflowTfjsDataStrings.environment
import typings.tensorflowTfjsData.tensorflowTfjsDataStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebcamConfig extends js.Object {
  
  /**
    * A boolean value that indicates whether to crop the video frame from center.
    * If true, `resizeWidth` and `resizeHeight` must be specified; then an image
    * of size `[resizeWidth, resizeHeight]` is taken from the center of the frame
    * without scaling. If false, the entire image is returned (perhaps scaled to
    * fit in `[resizeWidth, resizeHeight]`, if those are provided).
    */
  var centerCrop: js.UndefOr[Boolean] = js.native
  
  /**
    * A string used to request a specific camera. The deviceId can be obtained by
    * calling `mediaDevices.enumerateDevices()`.
    */
  var deviceId: js.UndefOr[String] = js.native
  
  /**
    * A string specifying which camera to use on device. If the value is
    * 'user', it will use front camera. If the value is 'environment', it will
    * use rear camera.
    */
  var facingMode: js.UndefOr[user | environment] = js.native
  
  /**
    * Specifies the height of the output tensor. The actual height of the
    * HTMLVideoElement (if provided) can be different and the final image will be
    * resized to match resizeHeight.
    */
  var resizeHeight: js.UndefOr[Double] = js.native
  
  /**
    * Specifies the width of the output tensor. The actual width of the
    * HTMLVideoElement (if provided) can be different and the final image will be
    * resized to match resizeWidth.
    */
  var resizeWidth: js.UndefOr[Double] = js.native
}
object WebcamConfig {
  
  @scala.inline
  def apply(): WebcamConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebcamConfig]
  }
  
  @scala.inline
  implicit class WebcamConfigOps[Self <: WebcamConfig] (val x: Self) extends AnyVal {
    
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
    def setCenterCrop(value: Boolean): Self = this.set("centerCrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterCrop: Self = this.set("centerCrop", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setFacingMode(value: user | environment): Self = this.set("facingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacingMode: Self = this.set("facingMode", js.undefined)
    
    @scala.inline
    def setResizeHeight(value: Double): Self = this.set("resizeHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeHeight: Self = this.set("resizeHeight", js.undefined)
    
    @scala.inline
    def setResizeWidth(value: Double): Self = this.set("resizeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeWidth: Self = this.set("resizeWidth", js.undefined)
  }
}
