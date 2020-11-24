package typings.tizenCommonWeb.tvwindowMod

import typings.tizenCommonWeb.tizenCommonWebStrings.ASPECT_RATIO_16x9
import typings.tizenCommonWeb.tizenCommonWebStrings.ASPECT_RATIO_1x1
import typings.tizenCommonWeb.tizenCommonWebStrings.ASPECT_RATIO_221x100
import typings.tizenCommonWeb.tizenCommonWebStrings.ASPECT_RATIO_4x3
import typings.tizenCommonWeb.tizenCommonWebStrings.ASPECT_RATIO_UNKNOWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoResolution extends js.Object {
  
  /**
    * Video aspect ratio.
    *
    */
  val aspectRatio: AspectRatio | ASPECT_RATIO_1x1 | ASPECT_RATIO_4x3 | ASPECT_RATIO_16x9 | ASPECT_RATIO_221x100 | ASPECT_RATIO_UNKNOWN = js.native
  
  /**
    * Vertical frequency rate in Hz.
    */
  val frequency: Double = js.native
  
  /**
    * Video height in pixels.
    */
  val height: Double = js.native
  
  /**
    * Video width in pixels.
    */
  val width: Double = js.native
}
object VideoResolution {
  
  @scala.inline
  def apply(
    aspectRatio: AspectRatio | ASPECT_RATIO_1x1 | ASPECT_RATIO_4x3 | ASPECT_RATIO_16x9 | ASPECT_RATIO_221x100 | ASPECT_RATIO_UNKNOWN,
    frequency: Double,
    height: Double,
    width: Double
  ): VideoResolution = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoResolution]
  }
  
  @scala.inline
  implicit class VideoResolutionOps[Self <: VideoResolution] (val x: Self) extends AnyVal {
    
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
    def setAspectRatio(
      value: AspectRatio | ASPECT_RATIO_1x1 | ASPECT_RATIO_4x3 | ASPECT_RATIO_16x9 | ASPECT_RATIO_221x100 | ASPECT_RATIO_UNKNOWN
    ): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequency(value: Double): Self = this.set("frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
