package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompressImageSuccessData extends js.Object {
  
  /**
    * 压缩后图片的临时文件路径
    */
  var tempFilePath: js.UndefOr[String] = js.native
}
object CompressImageSuccessData {
  
  @scala.inline
  def apply(): CompressImageSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompressImageSuccessData]
  }
  
  @scala.inline
  implicit class CompressImageSuccessDataOps[Self <: CompressImageSuccessData] (val x: Self) extends AnyVal {
    
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
    def setTempFilePath(value: String): Self = this.set("tempFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTempFilePath: Self = this.set("tempFilePath", js.undefined)
  }
}
