package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraContextStopRecordResult extends js.Object {
  
  /**
    * 封面图片文件的临时路径
    */
  var tempThumbPath: js.UndefOr[String] = js.native
  
  /**
    * 视频的文件的临时路径
    */
  var tempVideoPath: js.UndefOr[String] = js.native
}
object CameraContextStopRecordResult {
  
  @scala.inline
  def apply(): CameraContextStopRecordResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraContextStopRecordResult]
  }
  
  @scala.inline
  implicit class CameraContextStopRecordResultOps[Self <: CameraContextStopRecordResult] (val x: Self) extends AnyVal {
    
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
    def setTempThumbPath(value: String): Self = this.set("tempThumbPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTempThumbPath: Self = this.set("tempThumbPath", js.undefined)
    
    @scala.inline
    def setTempVideoPath(value: String): Self = this.set("tempVideoPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTempVideoPath: Self = this.set("tempVideoPath", js.undefined)
  }
}
