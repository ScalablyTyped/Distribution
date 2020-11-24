package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnProgressUpdateResult extends js.Object {
  
  /**
    * 上传进度百分比
    */
  var progress: js.UndefOr[Double] = js.native
  
  /**
    * 预期需要上传的数据总长度，单位 Bytes
    */
  var totalBytesExpectedToSend: js.UndefOr[Double] = js.native
  
  /**
    * 已经上传的数据长度，单位 Bytes
    */
  var totalBytesSent: js.UndefOr[Double] = js.native
}
object OnProgressUpdateResult {
  
  @scala.inline
  def apply(): OnProgressUpdateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnProgressUpdateResult]
  }
  
  @scala.inline
  implicit class OnProgressUpdateResultOps[Self <: OnProgressUpdateResult] (val x: Self) extends AnyVal {
    
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
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setTotalBytesExpectedToSend(value: Double): Self = this.set("totalBytesExpectedToSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalBytesExpectedToSend: Self = this.set("totalBytesExpectedToSend", js.undefined)
    
    @scala.inline
    def setTotalBytesSent(value: Double): Self = this.set("totalBytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalBytesSent: Self = this.set("totalBytesSent", js.undefined)
  }
}
