package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFileInfoSuccess extends js.Object {
  
  /**
    * 按照传入的 digestAlgorithm 计算得出的的文件摘要
    */
  var digest: js.UndefOr[String] = js.native
  
  /**
    * 调用结果
    */
  var errMsg: js.UndefOr[String] = js.native
  
  /**
    * 文件大小，单位：B
    */
  var size: js.UndefOr[Double] = js.native
}
object GetFileInfoSuccess {
  
  @scala.inline
  def apply(): GetFileInfoSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFileInfoSuccess]
  }
  
  @scala.inline
  implicit class GetFileInfoSuccessOps[Self <: GetFileInfoSuccess] (val x: Self) extends AnyVal {
    
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
    def setDigest(value: String): Self = this.set("digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigest: Self = this.set("digest", js.undefined)
    
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrMsg: Self = this.set("errMsg", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
