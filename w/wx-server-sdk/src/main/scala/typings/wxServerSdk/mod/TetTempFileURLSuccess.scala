package typings.wxServerSdk.mod

import typings.wxServerSdk.anon.ErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TetTempFileURLSuccess extends js.Object {
  
  var fileList: js.Array[ErrMsg] = js.native
}
object TetTempFileURLSuccess {
  
  @scala.inline
  def apply(fileList: js.Array[ErrMsg]): TetTempFileURLSuccess = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[TetTempFileURLSuccess]
  }
  
  @scala.inline
  implicit class TetTempFileURLSuccessOps[Self <: TetTempFileURLSuccess] (val x: Self) extends AnyVal {
    
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
    def setFileListVarargs(value: ErrMsg*): Self = this.set("fileList", js.Array(value :_*))
    
    @scala.inline
    def setFileList(value: js.Array[ErrMsg]): Self = this.set("fileList", value.asInstanceOf[js.Any])
  }
}
