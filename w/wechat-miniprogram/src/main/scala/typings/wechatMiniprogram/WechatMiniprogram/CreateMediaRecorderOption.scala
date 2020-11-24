package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMediaRecorderOption extends js.Object {
  
  /** 指定录制的时长（s)，到达自动停止。最大 7200，最小 5 */
  var duration: js.UndefOr[Double] = js.native
  
  /** 视频 fps */
  var fps: js.UndefOr[Double] = js.native
  
  /** 视频关键帧间隔 */
  var gop: js.UndefOr[Double] = js.native
  
  /** 视频比特率（kbps），最小值 600，最大值 3000 */
  var videoBitsPerSecond: js.UndefOr[Double] = js.native
}
object CreateMediaRecorderOption {
  
  @scala.inline
  def apply(): CreateMediaRecorderOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMediaRecorderOption]
  }
  
  @scala.inline
  implicit class CreateMediaRecorderOptionOps[Self <: CreateMediaRecorderOption] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setFps(value: Double): Self = this.set("fps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFps: Self = this.set("fps", js.undefined)
    
    @scala.inline
    def setGop(value: Double): Self = this.set("gop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGop: Self = this.set("gop", js.undefined)
    
    @scala.inline
    def setVideoBitsPerSecond(value: Double): Self = this.set("videoBitsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoBitsPerSecond: Self = this.set("videoBitsPerSecond", js.undefined)
  }
}
