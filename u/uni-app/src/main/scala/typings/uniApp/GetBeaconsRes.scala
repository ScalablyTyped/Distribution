package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBeaconsRes extends js.Object {
  
  /**
    * 接口调用成功的回调函数
    */
  var beacons: js.UndefOr[js.Array[Beacon]] = js.native
  
  /**
    * 调用结果
    */
  var errMsg: js.UndefOr[String] = js.native
}
object GetBeaconsRes {
  
  @scala.inline
  def apply(): GetBeaconsRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBeaconsRes]
  }
  
  @scala.inline
  implicit class GetBeaconsResOps[Self <: GetBeaconsRes] (val x: Self) extends AnyVal {
    
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
    def setBeaconsVarargs(value: Beacon*): Self = this.set("beacons", js.Array(value :_*))
    
    @scala.inline
    def setBeacons(value: js.Array[Beacon]): Self = this.set("beacons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeacons: Self = this.set("beacons", js.undefined)
    
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrMsg: Self = this.set("errMsg", js.undefined)
  }
}
